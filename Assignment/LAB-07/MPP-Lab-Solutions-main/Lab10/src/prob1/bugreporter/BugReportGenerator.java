package prob1.bugreporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.logging.Logger;

import prob1.classfinder.ClassFinder;

/**
 * This class scans the package lesson10.labs.prob2.javapackage for classes with
 * annotation @BugReport. It then generates a bug report bugreport.txt,
 * formatted like this:
 * 
 * Joe Smith reportedBy: classname: description: severity:
 * 
 * reportedBy: classname: description: severity:
 * 
 * Tom Jones reportedBy: classname: description: severity:
 * 
 * reportedBy: classname: description: severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "prob1.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	final static String REPORT_DIR = "E:\\MPP\\Lab10\\src\\prob1/";

	public void writeToFile(List<String> report) throws IOException {
		System.out.println("Inside File Writer");
		try (FileWriter fileWriter = new FileWriter(REPORT_DIR + REPORT_NAME)) {
//			fileWriter.write(report.toString() + System.getProperty("line.separator"));
			report.forEach(e -> {
				try {
					fileWriter.write(e);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
		}

	}

	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);

		// sample code for reading annotations -- you will need to change
		// this quite a bit to solve the problem
		// Sample code below obtains a list of names of developers assigned to bugs
		List<String> classReport = new ArrayList<String>();

		for (Class<?> cl : classes) {
			if (cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport) cl.getAnnotation(BugReport.class);
				String name = annotation.assignedTo();
				String reportedBy = annotation.reportedBy();
				String className = cl.getName();
				String description = annotation.description();
				int severity = annotation.severity();
				String out = String.format(
						"%s %n reportedBy : %s %n className : %s" + "%n description : %s %n severity: %d", name,
						reportedBy, className, description, severity);
				classReport.add(out);
				classReport.add(System.getProperty("line.separator"));
				classReport.add(System.getProperty("line.separator"));

			}
			System.out.println(classReport);
			try {
				writeToFile(classReport);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

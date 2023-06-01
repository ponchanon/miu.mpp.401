package lab3;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private int eid;
    private String fname;
    private String midInitial;
    private String lname;
    private LocalDate birthDate;
    private int ssn;
    private double salary;
    private Position position;

    Employee(int eid,String fname,String midInitial,String lname,LocalDate localDate,int ssn,double salary,Position position){
        this.eid=eid;
        this.fname=fname;
        this.midInitial=midInitial;
        this.lname=lname;
        this.birthDate=localDate;
        this.ssn=ssn;
        this.salary=salary;
        this.position=position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", fname='" + fname + '\'' +
                ", midInitial='" + midInitial + '\'' +
                ", lname='" + lname + '\'' +
                ", birthDate=" + birthDate +
                ", ssn=" + ssn +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }

    @Override
    public boolean equals(Object emp) {
       // if (this == emp) return true;
        if(!(emp instanceof Employee)) return false;
        if (emp == null || getClass() != emp.getClass()) return false;
        Employee employee = (Employee) emp;
        return eid == employee.eid && ssn == employee.ssn && Double.compare(employee.salary, salary) == 0 && Objects.equals(fname, employee.fname) && Objects.equals(midInitial, employee.midInitial) && Objects.equals(lname, employee.lname) && Objects.equals(birthDate, employee.birthDate);
    }
    public Position getPosition() {
        return position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, fname, midInitial, lname, birthDate, ssn, salary);
    }

    public void print(){
        System.out.println(this);
    }

    public int getEid() {
        return eid;
    }

    public String getFname() {
        return fname;
    }

    public String getMidInitial() {
        return midInitial;
    }

    public String getLname() {
        return lname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }
}

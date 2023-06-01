package lab3;


import java.util.ArrayList;
import java.util.List;

 class Company {
    private String name;
    private List<Department> department;
    private Position topExecutive;

    Company(String name){
        this.name=name;
        department=new ArrayList<>();
    }

     public void printReportingHierarchy(){
         System.out.println("CEO-->");
         System.out.println("    "+topExecutive.getEmployee().toString());
         for(Department dept:department){
             dept.printReportingHierarchy();
         }
     }
     public void setTopExecutive(Position topExecutive) {
         this.topExecutive = topExecutive;
     }
     public Position getTopExecutive(){
        return topExecutive;
     }

     public List<Department> getDepartment() {
         return department;
     }
     public void setDepartment(List<Department> department) {
         this.department = department;
     }

     public void print(){
        System.out.println("Company-->                  "+name);
        for(Department department: department){
            department.print();
        }
     }

     public double getSalary(){
         double TotalSal=0;
         for (Department department:department){
             TotalSal+=department.getSalary();
         }
         return TotalSal;
     }



}

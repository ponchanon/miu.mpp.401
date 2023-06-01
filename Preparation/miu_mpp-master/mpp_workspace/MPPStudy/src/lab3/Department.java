package lab3;


import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Department {
    private String name;
    private String location;
    private  Company company;
    private List<Position> positions;



    private Position head;

    Department(String name,String location,Company company){
        this.name=name;
        this.location=location;
        this.company=company;
        positions=new ArrayList<>();
    }


     public void printReportingHierarchy(){
         System.out.println("Departmet Head-->");
         System.out.println("                  "+head.getEmployee().toString());
         System.out.println("Manager-->");
         for(Position p: head.getJunior()){
             System.out.println("                       "+p.getEmployee());
             p.printDownLine();
         }



     }

    public void setHead(Position head) {
        this.head = head;
    }


     public Position getDepartmentHead(){
        //Apply logic
        return head;
     }

    @Override
    public boolean equals(Object dept) {
        //if (this == o) return true;
        if (!(dept instanceof Department)) return false;
        Department that = (Department) dept;
        return Objects.equals(name, that.name) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, positions, head);
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }
    public void print(){
        System.out.println("Department-->               "+name+" "+location);
       // positions.get(0).print();
        for(Position position:positions){
            position.print();
        }
    }

    public double getSalary(){
        double deptSal=0;
        for (Position position:positions){
            deptSal+=position.getSalary();
        }
        return deptSal;
    }



}

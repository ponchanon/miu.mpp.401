package lab3;

import java.util.List;

public class Position {
    private String title;
    private String description;
    private Employee employee;
    private Department department;

    private Position manager;
    private List<Position> junior;
    
    Position(String title, String description, Department department){
        this.title=title;
        this.description=description;
        this.employee=employee;
        this.department=department;
    }

    @Override
    public String toString(){
        return title+" Description="+description;
    }

    public void printDownLine(){
        if(this.isManager()){
            System.out.println("Junior-->");
            for(Position p: this.getJunior()){
                System.out.println("                            "+p.getEmployee());
            }
        }else{
            System.out.println(this.getEmployee());
        }
    }

    public void print(){
        System.out.println("Position-->         "+title+" "+description);
        if(employee!=null){
            employee.print();
        }else{
            System.out.println("Vacancy is open for applying...");
        }

    }

    public void setManager(Position manager) {
        this.manager = manager;
    }
    public Position getManager() {
        return manager;
    }

    public boolean isManager(){

        return employee.equals(manager.employee);
    }


    public List<Position> getJunior() {
        return junior;
    }

    public void setJunior(List<Position> junior) {
        this.junior = junior;
    }


    public double getSalary(){
        if(employee!=null){
            return employee.getSalary();
        }
        return 0.0;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee=employee;
    }
}

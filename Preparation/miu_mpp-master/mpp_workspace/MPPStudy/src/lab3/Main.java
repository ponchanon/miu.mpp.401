package lab3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company=new Company("YRMP");
        Department Sales =new Department("Sales","Fairfield",company);
        Department Marketing=new Department("Marketing","Kabul",company);



        Position frontEnd=new Position("FrontEnd","Front end developer",Sales);
        Employee john=new Employee(1000,"John","Mac","Robert", LocalDate.of(1976, 11, 23),2312,45000.3,frontEnd);
        frontEnd.setEmployee(john);

        Position backEnd=new Position("BackEnd","Back end developer",Sales);
        Employee mike=new Employee(2000,"Mike","Tyson","Hennessy", LocalDate.of(1990, 10, 11),5678,90777.76,backEnd);
        backEnd.setEmployee(mike);

        Position it=new Position("IT","Managing network and servers",Sales);
        Employee lisa=new Employee(8000,"Lisa","Lisa","Mike", LocalDate.of(1998, 10, 11),34222,90777.76,it);
        it.setEmployee(lisa);

        Position Ceo=new Position("Ceo","Managing Comapny",Sales);
        Employee ceo=new Employee(8000,"Ceo","CEO","Mike", LocalDate.of(1998, 10, 11),34222,90777.76,Ceo);
        Ceo.setEmployee(ceo);
        company.setTopExecutive(Ceo);

        Position senior=new Position("Senior","Managing Team",Sales);
        Employee Mona=new Employee(9000,"Mona","Lisa","Jordan", LocalDate.of(1990, 11, 11),9832,99777.76,senior);
        senior.setEmployee(Mona);



        //BREAKING POINTS...............


        List<Position> positionList=new ArrayList<>();
        positionList.add(frontEnd);
        positionList.add(backEnd);
        positionList.add(it);
        positionList.add(senior);
        //positionList.add(Ceo);
        Sales.setPositions(positionList);


        List<Position> junior=new ArrayList<>();
        junior.add(frontEnd);
        junior.add(backEnd);

        frontEnd.setManager(it);
        backEnd.setManager(it);
        it.setJunior(junior);
        it.setManager(it);

        List<Position> seniorsubordinate=new ArrayList<>();
        seniorsubordinate.add(it);
        senior.setJunior(seniorsubordinate);
        Sales.setHead(senior);

        //System.exit(0);



        Position admin=new Position("Admin","Helping Hr",Marketing);
        Employee ahmad=new Employee(3004,"ahmad","fazil","hamed", LocalDate.of(2000, 01, 13),9872,87322.33,admin);
        admin.setEmployee(ahmad);

        Position assistant=new Position("Hr Assistant","Hr assistant",Marketing);
        Employee jawad=new Employee(3009,"jawad","hasam","wasem", LocalDate.of(1990, 03, 28),4321,65300.43,assistant);
        assistant.setEmployee(jawad);


        Position accountant=new Position("HR","HR supervisor",Marketing);

        Position hod=new Position("HR","HR supervisor",Marketing);
        Employee adele=new Employee(8903,"adele","A","Ibraham", LocalDate.of(1980, 8, 22),5673,902223,hod);
        hod.setEmployee(adele);

        List<Position> positionsMarketing=new ArrayList<>();
        positionsMarketing.add(admin);
        positionsMarketing.add(assistant);
        positionsMarketing.add(accountant);
        positionsMarketing.add(hod);
        Marketing.setPositions(positionsMarketing);

        ArrayList<Position> jun=new ArrayList<>();
        jun.add(accountant);
        jun.add(assistant);

        accountant.setManager(admin);
        assistant.setManager(admin);
        admin.setJunior(jun);
        admin.setManager(admin);

        List<Position> hodJunior=new ArrayList<>();
        hodJunior.add(admin);
        hod.setJunior(hodJunior);
        Marketing.setHead(hod);


        company.printReportingHierarchy();
        List<Department> departmentList=new ArrayList<>();
        departmentList.add(Marketing);
        departmentList.add(Sales);

        company.setDepartment(departmentList);
        company.print();
        System.out.println();
        System.out.println("*******************************************Hierarchy******************************************");
        System.out.println();
        company.setTopExecutive(Ceo);
        company.printReportingHierarchy();



    }
}

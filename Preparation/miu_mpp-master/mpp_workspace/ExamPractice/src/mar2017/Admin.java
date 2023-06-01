package mar2017;

import java.util.List;


public class Admin {
  public static double computeUpdatedBalanceSum(List<Employee> employees){
   double total=0;
   for(Employee employee: employees){
    total+=employee.computeUpdatedBalanceSum();
   }
   return total;
  }

  public static String getDetails(List<Employee> emps){
      StringBuilder stringBuilder=new StringBuilder();
   for(Employee employee: emps){
    stringBuilder.append(employee+"\n");
   }
   return stringBuilder.toString();
  }
}

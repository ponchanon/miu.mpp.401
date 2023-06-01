package mar2017;

import java.util.ArrayList;
import java.util.List;

public class Employee {
  private String name;
  List<Account> accounts;
  public Employee(String name){
   this.name=name;
   accounts=new ArrayList<>();
  }

 public String getName() {
  return name;
 }
 public void addAccount(Account account){
   accounts.add(account);
 }

 @Override
 public String toString(){
   StringBuilder stringBuilder=new StringBuilder();
   stringBuilder.append(name+"\n");

   for(Account account: accounts){
     stringBuilder.append(account.getAccountID()+" "+account.getBalance()+"\n");
   }
   return stringBuilder.toString();

 }

 public double computeUpdatedBalanceSum(){
   double total=0;
  for(Account account:accounts){
   total=total+account.computeUpdatedBalance();
  }
   return total;
 }



}

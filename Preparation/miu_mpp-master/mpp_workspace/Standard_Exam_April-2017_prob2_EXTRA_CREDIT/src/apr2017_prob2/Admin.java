package apr2017_prob2;



public class Admin {
	//implement - DONE
	
	private Department[] deptArr = new Department[3];
	
	public Admin(Department[] depts) {
		this.deptArr = depts;
	}
	//which reads the message in each of the Department queues and assembles them into a report, returned as a String
	public String hourlyCompanyMessage() throws EmptyQueueException  {
		//when you access one of the Departmental queues, an EmptyQueueException 
		//will read each of the departmental queues to get the current message from each.
		String output = "";
		try {			
			for(Department d: deptArr) {
				output += format(d.getName(), d.nextMessage());
			}
		}catch(EmptyQueueException e){
			System.out.println("Admin Page EmptyQueue Exception : " + e.getMessage());
		}		
		return output;
	}
	
	public String format(String name,String msg) {
		return name + ": " + msg + "\n";
	}
}

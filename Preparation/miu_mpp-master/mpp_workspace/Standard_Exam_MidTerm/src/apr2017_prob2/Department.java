package apr2017_prob2;

public abstract class Department {
	//The StringQueue stores messages within each department class
	private StringQueue queue = new StringQueue();
	public StringQueue getQueue() {
		return queue;
	}
	//implement
	public void addMessage(String msg) {
		queue.enqueue(msg);
	}
	
	public String nextMessage() throws EmptyQueueException{	
		String rtn = "";
		try{			
			rtn = queue.peek();
			if(rtn != "") queue.dequeue();
		}catch(EmptyQueueException e){
			//
		}
		return rtn;
	}
	
	public abstract String getName();
}

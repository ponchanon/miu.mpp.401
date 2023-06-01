package prob5;

public class PrimeThread extends Thread {
    int threadNumber1;
    int threadNumber2;
    PrimeThread(int threadnbr1, int threadnbr2) {
    	 threadNumber1 = threadnbr1;
    	 threadNumber2 = threadnbr2;
    }

    public void run() {
    	
       System.out.println("Inside BEGINNING of 'run', of thread  " + threadNumber1 + "-" + threadNumber2);      
        
        System.out.println("Prime Numbers betn: " + threadNumber1 + " & " + threadNumber2 );
        for(int i = threadNumber1; i<= threadNumber2; i++) {
        	if(isPrime(i)) System.out.println(i);
        }
        
        
        System.out.println("Inside END of 'run', of thread  " + threadNumber1+ "-" + threadNumber2);      
    	
    }
    boolean  isPrime (int anInt)    {
    	// Corner case
        if (anInt <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < anInt; i++)
            if (anInt % i == 0)
                return false;
  
        return true;
    }
}

package prob6;

public class mainThreadClass_SmallNumTest {
	public static void main( String[] args ) throws InterruptedException {

        System.out.println("Inside main  ");   
        PrimeThread p1 = new PrimeThread(1,1000);
        p1.start();           
        
        PrimeThread p2 = new PrimeThread(1001, 2000);
        p2.start();
                
        PrimeThread p3 = new PrimeThread(2001, 3000);
        p3.start();
        
        PrimeThread p4 = new PrimeThread(3001, 4000);
        p4.start();
        
        PrimeThread p5 = new PrimeThread(4001, 5000);
        p5.start();
        
        PrimeThread p6 = new PrimeThread(5001, 6000);
        p6.start();
        
        PrimeThread p7 = new PrimeThread(6001, 7000);
        p7.start();
        
        PrimeThread p8 = new PrimeThread(7001, 8000);
        p8.start();
        
        PrimeThread p9 = new PrimeThread(8001, 9000);
        p9.start();
        
        PrimeThread p10 = new PrimeThread(9001, 10000);
        p10.start();
        
        p1.join();//System.out.println("p1 is finisehd");
        p1.printSortedPrimeList(); 
        p2.join();//System.out.println("p2 is finisehd");
        p2.printSortedPrimeList();
        p3.join();//System.out.println("p3 is finisehd");
        p3.printSortedPrimeList(); 
        p4.join();//System.out.println("p4 is finisehd");
        p4.printSortedPrimeList(); 
        p5.join();//System.out.println("p5 is finisehd");
        p5.printSortedPrimeList(); 
        p6.join();//System.out.println("p6 is finisehd");
        p6.printSortedPrimeList(); 
        p7.join();//System.out.println("p7 is finisehd");
        p7.printSortedPrimeList(); 
        p8.join();//System.out.println("p8 is finisehd");
        p8.printSortedPrimeList();
        p9.join();//System.out.println("p9 is finisehd");
        p9.printSortedPrimeList(); 
        p10.join();//System.out.println("p10 is finisehd");
        p10.printSortedPrimeList();
        
    }
}

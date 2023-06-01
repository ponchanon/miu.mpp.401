package prob2;

import java.util.*;

public class Building {
	
	List<Apartment> apartments;
	private double maintainanceCost;

    public Building(double maintainanceCost) {
    	this.maintainanceCost=maintainanceCost;
    	apartments = new ArrayList<>();
    }
    
    public void addApartment(Apartment apartment){
    	apartments.add(apartment);
    }
    
    
    public List<Apartment> getApartments(){
    	return apartments;
    }


    public double getProfit() {
    	double sum = 0.0;
        for (Apartment apartment : apartments) {
			sum += apartment.getRent();
		}
        return sum-this.maintainanceCost;
    }
    
  

}
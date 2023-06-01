package prob2;
import java.util.ArrayList;
import java.util.List;

public class Landlord {
	
	private List<Building> buildings;
	private double profitSum;

	public Landlord() {
		this.buildings = new ArrayList<>();
	}

	public List<Building> getBuildings() {
		return buildings;
	}


	public void addBuilding(Building building) {
		buildings.add(building);
	}
	
	public double calcProfits(){
		for (Building building : buildings) {
			profitSum += building.getProfit();
		}
		
		return profitSum;
	}

}
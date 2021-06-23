import java.util.ArrayList;

public class Car {
	private int plateNo;
	private String model;
	private String manager;
	private double cost;
	private boolean rentStatus = false;
	private String contract = "unrenter";
	
	public void setplateno(int plate) {
		if(plate<1000 || plate>9999) {
			throw new NegativeNumberException("Negative plate is not allow");
		}
		else plateNo= plate;
	}
	
	
	
	
	
	public void setcost(double acost) {
		if(acost<0) {
			throw new NegativeNumberException("Negative cost is not allow");
		}
		else cost = acost;
	}
	
	
	
	public int getPlateNo() {
		return plateNo;
	}
	public String getModel() {
		return model;
	}
	public String getmanager() {
		return manager;
	}
	public double getCost() {
		return cost;
	}
	public boolean isRentStatus() {
		return rentStatus;
	}
	public void setRentStatus(boolean rentStatus) {
		this.rentStatus = rentStatus;
	}
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	
	public Car(int no, String mod, double co, boolean stats, String rent,String m)
	{
		setplateno(no);
		model = mod;
		setcost(co);
		rentStatus = stats;
		contract = rent;
		manager =m;
	}
	
}


public class Add {
	public Car Addcar(GUI gui) {
		gui.resetInput();
		Car add= null;
		try {
		gui.display("Please enter the plate no of the car :");
		while(gui.getInput().equalsIgnoreCase("-1"))
		{
			gui.getInput();
		}
		int plate = Integer.parseInt(gui.getInput());
		gui.resetInput();
		
		gui.display("Please enter the company of the car :");
		while(gui.getInput().equalsIgnoreCase("-1"))
		{
			gui.getInput();
		}
		String m1 = gui.getInput();
		gui.resetInput();
		
		gui.display("Please enter the name of the car :");
		while(gui.getInput().equalsIgnoreCase("-1"))
		{
			gui.getInput();
		}
		String m2 = gui.getInput();
		gui.resetInput();
		
		gui.display("Please enter the cost of the car :");
		while(gui.getInput().equalsIgnoreCase("-1"))
		{
			gui.getInput();
		}
		double cost = Double.parseDouble(gui.getInput());
		gui.resetInput();
		
		gui.display("First name of manager of this car:");
		while(gui.getInput().equalsIgnoreCase("-1"))
		{
			gui.getInput();
		}
		String n1= gui.getInput();
		gui.resetInput();
		
		gui.display("Last name of manager of this car:");
		while(gui.getInput().equalsIgnoreCase("-1"))
		{
			gui.getInput();
		}
		String n2 = gui.getInput();
		gui.resetInput();
		
		String x = m1 +" "+ m2;
		String y = n1 +" "+ n2;
		add = new Car(plate,x,cost,false,"unrented",y);
		
		gui.displayh("Car added!");
		gui.displaym();
		
	}catch(NegativeNumberException ex) {
		gui.display(ex.getMessage());
	}
	return add;
}
}

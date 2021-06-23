
public class Rent {
	public Car rentcar(Car car,GUI gui) {

		if(car.isRentStatus())
		{
			gui.displayh("Is this the car to return? (enter 1 to comfirm)");
			gui.resetInput();
			while(gui.getInput().equalsIgnoreCase("-1"))
			{
				gui.getInput();
			}
			int choice = Integer.parseInt(gui.getInput());
			if (choice == 1)
			{
				car.setRentStatus(false);
				car.setContract("unrented");
				gui.display("changes made!");
			}
			else
				gui.display("No changes made!");
		}
		else
		{
			gui.displayh("Is this the car to rent? (enter 1 to comfirm)");
			gui.resetInput();
			while(gui.getInput().equalsIgnoreCase("-1"))
			{
				gui.getInput();
			}
			int choice = Integer.parseInt(gui.getInput());
			if (choice == 1)
			{
				car.setRentStatus(true);
				gui.displayh("Please enter the renter of this car");
				gui.display("First name :");
				gui.resetInput();
				while(gui.getInput().equalsIgnoreCase("-1"))
				{
					gui.getInput();
				}
				String n1= gui.getInput();
				
				gui.display("Last nem:");
				gui.resetInput();
				while(gui.getInput().equalsIgnoreCase("-1"))
				{
					gui.getInput();
				}
				String n2 = gui.getInput();			
				car.setContract(n1+" "+n2);
				gui.display("changes made!");
			}
			else
				gui.display("No changes made!");
		}
		gui.resetInput();
		gui.displaym();
		return car;
	}
}

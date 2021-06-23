import java.io.*;
import java.util.ArrayList;

public class CarApp {
	
	public static void main(String[] args)throws IOException{	
		ArrayList<Car>car = new ArrayList<Car>();
		Search finder = new Search(); //Search function
		Add adder = new Add(); //Add car function
		Rent renter = new Rent(); //Delete car function
		GUI gui = new GUI(); //GUI 
		
		BufferedReader bReader = null; //get car data
	
	
			try {
		
			bReader = new BufferedReader(new FileReader("CarData.txt"));
			String line = null;
			while((line= bReader.readLine()) !=null)
			{
				String [] carinfo = line.split(",");
				int no = Integer.parseInt(carinfo[0]);
				String model = carinfo[1];
				double cos = Double.parseDouble(carinfo[2]);
				boolean stats =Boolean.parseBoolean(carinfo[3]);
				String rent = carinfo[4];
				String name = carinfo[5];
				car.add(new Car(no,model,cos,stats,rent,name));
			}
		} catch (FileNotFoundException e) {
			System.out.println("CarData.txt not found!");;
		}
		bReader.close();
		
		int option =0; //main menu
		
		int choice;
		gui.menu();
	int x=1;
		do {
		try{ 
			gui.displayd(" ");
			choice = Integer.parseInt(gui.getInput());
			
			switch(choice) {
			case 1:finder.findcar(car,gui);
			break;
			case 2:car.add(adder.Addcar(gui));
			break;
			case 3:{
				int comf = 0; //Confirmation
				int found = 0; //Placement of the car found
				while (comf != 1)
				{
					gui.displayh("Please search the car to delete!");
					found = finder.findcar(car,gui);
					if(found != -1)
					{
						gui.displayh("Is this the car to delete? (enter 1 to comfirm)");
						gui.resetInput();
						while(gui.getInput().equalsIgnoreCase("-1"))
						{
							gui.getInput();
						}
						int inc = Integer.parseInt(gui.getInput());
						if (inc == 1)
							comf++;
					}
				}
				car.remove(found);
				gui.displayh("Car deleted! retrun to menu >>>");
				gui.resetInput();
			}
			break;
			case 4:{
				int found = -1; 
				Car rent = null; 
				gui.displayh("Please search the car to rent/return!");
				found = finder.findcar(car,gui);	
				if (found != -1)
				{
					rent = renter.rentcar(car.get(found),gui);
					car.set(found, rent);
				}
				else 
				{
					gui.display("No car found!!");
					gui.displaym();
				}
				gui.resetInput();
			}
			break;
			case 5:listcar(car,gui);
			break;
			case 6:{
				PrintWriter output = new PrintWriter("CarData.txt"); //save array list to text file
				for( Car a :car) {
					output.println(a.getPlateNo() + "," + a.getModel() + "," + a.getCost() + "," + a.isRentStatus() + "," + a.getContract() + "," + a.getmanager());
					}
				output.close();
				gui.displayh("changes saved!");
				gui.resetInput();
			};
			break;
			}
			
			}
			
			catch(Exception ex) {
				gui.display("Invalid input, enter any numbers and click 'OK', then click on 'MENU' to return to page");
			}
		}while(option !=1);
			
		

	}
	public static void listcar(ArrayList<Car> car,GUI gui) { 
		String showcar = "<html>";
		for( Car a :car) {
			String newshowcar =  "<br/>PlateNo :" +a.getPlateNo() +"<br/>Model   :"+a.getModel()+"<br/>Cost    :"+"RM"+a.getCost()+"<br/>Rent    :"+a.getContract() + "<br/>";
			showcar = showcar + newshowcar ;
		}
		gui.display(showcar);
		gui.displaym();
		gui.resetInput();
	}

	
}
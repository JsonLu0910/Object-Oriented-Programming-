import java.util.ArrayList;

public class Search {
	public int findcar(ArrayList<Car> car,GUI gui) {
		int x=1;
		int comf=-1;
		do {
			try {
		gui.display("Enter the plate no of the car :");
		gui.resetInput();
		while(gui.getInput().equalsIgnoreCase("-1"))
		{
			gui.getInput();
		}
		int num = Integer.parseInt(gui.getInput());
		gui.resetInput();
		int count = 0;
		
		for( Car a :car) {
			if(num == a.getPlateNo()) {
				String showcar = "<html>" + "<br/>PlateNo :" +a.getPlateNo() +"<br/>Model   :"+a.getModel()+"<br/>Cost    :"+"RM"+a.getCost()+
						"<br/>Rent    :"+a.getContract();
				gui.display(showcar);
				gui.displaym();
				comf=count;
			}
			count++;
		}
		if(comf == -1)
		{
			gui.displayh("No Car found! return to menu>>>");
		}
		x=2;
	}
		catch(NegativeNumberException ex) {
			gui.display("Negative plate not allow or Not in the range of the value 1000-9999 is not allow as well");	
		}
			return comf;
	
		}while(x==1);}
	
	
}

package Final_2;
import java.util.Scanner;

public class machinetest {
	public static void main(String args[]) {
		machine mac = new machine();
		//Ready re = new Ready(mac);
		//Disabled db = new Disabled(mac);
		//Unkown u = new Unkown(mac);
		//Down d = new Down(mac);
		//System.out.println("You are in the Unkown state");
		mac.currentstate();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter one of the following : \ncheck is good\ncheck is bad\nservice enabled\nservice disabled");
		while (true) {
			//String a = input.nextLine();
		
		if (mac.perform(input.nextLine())) {
			mac.currentstate();
			}
		//else {System.out.print("Check the input");}
		}
		//input.close();
		}
	
}

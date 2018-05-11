package Final_2;
import java.util.Scanner;

public class machinetest {
	public static void main(String args[]) {
		machine mac = new machine();
		state ready, down, disbaled,unknown = null;
		System.out.println("You are in the Unkown state");

		mac.setState(unknown);
		mac.getstate();
		
		while(true) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter one of the following : \ncheck is good\ncheck is bad\nservice enabled\nservice disabled");
		String s = input.nextLine();
		mac.doAction(s);
		}	
}

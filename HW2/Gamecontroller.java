import java.util.Scanner;

public class Gamecontroller {

	HelpCommand h = new HelpCommand();
	QuitCommand q = new QuitCommand();
	public String userinput;	

	public void Survey(){
	Scanner s = new Scanner(System.in);
	System.out.println("Exit the game or Need Help?");
	String a = s.nextLine();
	System.out.print("\n");

	if ("quit".equals(a) ) {
			q.docommand();}
		else if("help".equals(a)) {
			h.docommand();
		}

			else {

				System.out.println("Command not recognized");
			}	

	}


	}
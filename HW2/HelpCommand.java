
	import java.awt.List;
	import java.util.ArrayList;

	public class HelpCommand implements commanadable
	{

		public void docommand() {
			// TODO Auto-generated method stub
			//ArrayList<String> listStrings = new ArrayList<String>();
			//listStrings.add("1. Start a new game \n");
			//listStrings.add("2. End a game \n");
			//listStrings.add("3. continue");
			//System.out.println(listStrings);
			System.out.println("1. Start a new game \n");
			System.out.println("2. End a game \n");
			System.out.println("3. continue");
		}

		public boolean matchcommand(String input) {
			// TODO Auto-generated method stub
			return true;
		}

		
	}


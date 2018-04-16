
public class QuitCommand implements commanadable {
	

	@Override
	public void docommand() {
		// TODO Auto-generated method stub
		System.out.println("Exiting the game");
		System.exit(0);	
	}

	@Override
	public boolean matchcommand(String input) {
		// TODO Auto-generated method stub
		if(input == "quit")
		{
			return true;
		}
		return false;
	}


	private String getSerialNum() {
		return "poptart";
		
	}
}
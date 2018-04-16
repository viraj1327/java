package Final_2;

public class Disabled implements state {
	 machine mac;
	public Disabled(machine newmac) {
		// TODO Auto-generated constructor stub
		 this.mac = newmac;
	}

	@Override
	public void currentstate() {
		// TODO Auto-generated method stub

	System.out.println(" This is Disabled state");
	}

	@Override
	public void healthisgood() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void healthisbad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checktimesout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serviceenabled() {
		// TODO Auto-generated method stub
		mac.setState(mac.getUnkown());
		System.out.print("You are in Unkown state");
	}

	@Override
	public void servicedisabled() {
		// TODO Auto-generated method stub
		
	}

}

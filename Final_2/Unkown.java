package Final_2;

public class Unkown implements state {
	machine mac;
	public Unkown(machine newmac) {
		// TODO Auto-generated constructor stub
		 this.mac = newmac;
	}
	
	
	@Override
	public void currentstate() {
		// TODO Auto-generated method stub
		System.out.println(" This Unkown state");
	}

	@Override
	public void healthisgood() {
		// TODO Auto-generated method stub
		mac.setState(mac.getReady());
		System.out.print("You are in Ready state");
	}

	@Override
	public void healthisbad() {
		// TODO Auto-generated method stub
		mac.setState(mac.getDown());
		System.out.print("You are in Down state");
	}

	@Override
	public void checktimesout() {
		// TODO Auto-generated method stub
		mac.setState(mac.getDown());
		System.out.print("You are in Down state");
	}

	@Override
	public void serviceenabled() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void servicedisabled() {
		// TODO Auto-generated method stub
		
	}

}

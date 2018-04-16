package Final_2;

public class Down implements state {

	machine mac;
	public Down(machine newmac) {
		// TODO Auto-generated constructor stub
		 this.mac = newmac;
	}

	@Override
	public void currentstate() {
		// TODO Auto-generated method stub

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
		
	}

	@Override
	public void checktimesout() {
		// TODO Auto-generated method stub
		
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

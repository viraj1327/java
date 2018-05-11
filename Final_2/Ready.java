package Final_2;

public class Ready implements state {
 machine mac;

public Ready(machine newmac) {
	 this.mac = newmac;
}
	@Override
	public void currentstate() {
		// TODO Auto-generated method stub
		
			System.out.println(" This Ready state");
		
	}

	@Override
	public void  healthisgood() {
		// TODO Auto-generated method stub
		
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
		mac.setState(mac.getUnkown());
		System.out.print("You are in Unkown state");
	}

	@Override
	public void serviceenabled() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void servicedisabled() {
		// TODO Auto-generated method stub
		mac.setState(mac.getDisabled());
		System.out.print("You are in Diabled state");
	}

}


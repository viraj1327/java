package Final_2;

public class machine {
	state Ready, Unkown, Down, state, Disabled;
	state currentstate;

	public machine() {

		Ready = new Ready(this);
		Disabled = new Disabled(this);
		Unkown = new Unkown(this);
		Down = new Down(this);

		//state = Unkown; // Assingnning the initial state or default state
	}

	public void setState(state newstate) {
		currentstate = newstate;
	} // method to that is use to change state
	
	
	public state getstate() {
		return currentstate;
	}
	//public void exit() {
	//	System.exit(0);
	//}

	public boolean doAction(String a) {
		if (a == "check is good") {
			currentstate.healthisgood();
		} else if (a == "check is bad") {
			currentstate.healthisbad();
		} else if (a == "check times out") {
			 currentstate.checktimesout();
		} else if (a == "service enabled") {
			 currentstate.serviceenabled();
		} else if (a == "service disabled") {
			 currentstate.servicedisabled();
		}
		return false;
	}
	// setting the value

	public void healthisgood() {
		healthisgood();
	}

	public void healthisbad() {
		healthisbad();
	}

	public void checktimesout() {
		checktimesout();
	}
	
	public void servicedisabled() {
		servicedisabled();
	}
	public void serviceenabled() {
		serviceenabled();
	}

	// public static void state4() {statemachine.state4();}

	// public static void endstate() {statemachine.endstate();}

	// get the current state

	 public  state getReady() {return Ready;}
	 public  state getDown() {return Down;}
	 public  state getUnkown() {return Unkown;}
	 public  state getDisabled() {return Disabled;}
	// public statemachine getendstate() {return Endstate;}

	public void currentstate() {
		// TODO Auto-generated method stub
		state.currentstate();
	}
	
	/*private String getSerialNum() {
		return "poptart";
		
	}*/
	
	
}

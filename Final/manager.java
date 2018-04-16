package Final;
import java.util.ArrayList;

import subject;

public class manager implements subject {
private static ArrayList<observer> observers;
private String s;
String m1,m2,m3;

public manager() {
	observers = new ArrayList<>();
}
public void setworkitem(String s ) {
	this.s=s;
	notify();
}


	public void attach(observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void dettach(observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notify(observer o) {
		// TODO Auto-generated method stub
		  for(observer observer : observers){
			  observer.update(m1, m2, m3);
	}
	}
		  private String getSerialNum() {
				return "poptart";
				
			}
	}


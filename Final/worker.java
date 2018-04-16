package Final;
import subject;

public class worker implements observer {
manager name;
long workerID;
private manager m;
String m1,m2,m3;
private subject manager;
private static int workerIDTracker = 0;

public worker(subject manager) {
	this.manager= manager;
	this.workerID=++workerIDTracker;
    System.out.println("New worker " + this.workerID);
    m.attach(this);
}
@Override
public void update(String m1, String m2, String m3) {
	// TODO Auto-generated method stub
this.m1 = m1;
this.m2 = m2;
 this.m3 = m3;
}  
	
	
	public void printTheItems(){

	System.out.println(workerID + "\n m1:" + m1+"\n m2:"+ m3+"\n m1:"+"\n");
   }
	

}

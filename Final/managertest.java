package Final;

public class managertest {
    public static void main(String[] args){
    manager m = new manager();
    worker w1 = new worker(m);
    m.setworkitem("Work on java");
    m.setworkitem("Work on python");
    m.setworkitem("Work on C++");
    worker w2 = new worker(m);
    m.setworkitem("Work on java");
    }
}

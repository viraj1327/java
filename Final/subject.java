import Final.observer;

public interface subject {
void attach(observer o);
void dettach(observer o);
void notify(observer o);
}

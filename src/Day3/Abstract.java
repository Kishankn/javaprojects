package Day3;
abstract class vehicles123{
    abstract void start();
    void stop(){System.out.println("Stopped");}}
class car extends vehicles123 {
    void start() {
        System.out.println("Car starts");
    }
}
public class Abstract {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.stop();
    }
}

package StateDesignPattern;

public class Main {
    public static void main(String[] args) {
        Fan fan=new Fan();
        fan.displayState();

        fan.toggle();
        fan.displayState();

        fan.toggle();
        fan.displayState();
    }
}

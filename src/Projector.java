public class Projector {
    private boolean on;

    public void on() {
        on = true;
        System.out.println("Projector is on");
    }

    public void off() {
        on = false;
        System.out.println("Projector is off");
    }

    public boolean isOn() {
        return on;
    }
}
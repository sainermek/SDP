public class Amplifier {
    private boolean on;
    private int volume;

    public void on() {
        on = true;
        System.out.println("Amplifier is on");
    }

    public void off() {
        on = false;
        volume = 0;
        System.out.println("Amplifier is off");
    }

    public void setVolume(int volume) {
        if (!on) {
            throw new IllegalStateException("Amplifier must be on before setting the volume");
        }
        if (volume < 0 || volume > 10) {
            throw new IllegalArgumentException("Volume must be between 0 and 10");
        }
        this.volume = volume;
        System.out.println("Amplifier volume set to " + volume);
    }

    public boolean isOn() {
        return on;
    }

    public int getVolume() {
        return volume;
    }
}
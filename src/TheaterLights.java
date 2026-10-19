public class TheaterLights {
    private int brightness = 100;

    public void dim(int brightness) {
        if (brightness < 0 || brightness > 100) {
            throw new IllegalArgumentException("Brightness must be between 0 and 100");
        }
        this.brightness = brightness;
        System.out.println("Lights dimmed to " + brightness + "%");
    }

    public void turnOn() {
        brightness = 100;
        System.out.println("Lights are on at 100%");
    }

    public int getBrightness() {
        return brightness;
    }
}
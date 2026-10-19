public class DvdPlayer {
    private boolean on;
    private String currentMovie;

    public void on() {
        on = true;
        System.out.println("DVD player is on");
    }

    public void off() {
        on = false;
        currentMovie = null;
        System.out.println("DVD player is off");
    }

    public void play(String movie) {
        if (!on) {
            throw new IllegalStateException("DVD player must be on before playing a movie");
        }
        currentMovie = movie;
        System.out.println("DVD player is playing \"" + movie + "\"");
    }

    public void stop() {
        if (currentMovie == null) {
            throw new IllegalStateException("DVD player has no movie to stop");
        }
        System.out.println("DVD player stopped \"" + currentMovie + "\"");
        currentMovie = null;
    }

    public boolean isOn() {
        return on;
    }

    public String getCurrentMovie() {
        return currentMovie;
    }
}
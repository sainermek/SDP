public class HomeTheaterFacade {
    private final Amplifier amplifier;
    private final Projector projector;
    private final TheaterLights lights;
    private final DvdPlayer dvdPlayer;
    private boolean movieRunning;

    public HomeTheaterFacade() {
        this.amplifier = new Amplifier();
        this.projector = new Projector();
        this.lights = new TheaterLights();
        this.dvdPlayer = new DvdPlayer();
    }

    public void watchMovie(String movie) {
        if (movie == null || movie.isBlank()) {
            throw new IllegalArgumentException("Movie title must not be empty");
        }
        if (movieRunning) {
            throw new IllegalStateException("A movie is already playing");
        }

        System.out.println("Getting ready to watch a movie...");
        lights.dim(10);
        projector.on();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
        movieRunning = true;
    }

    public void endMovie() {
        if (!movieRunning) {
            throw new IllegalStateException("There is no movie to end");
        }

        System.out.println("Shutting down the home theater...");
        dvdPlayer.stop();
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        lights.turnOn();
        movieRunning = false;
    }

    public boolean isMovieRunning() {
        return movieRunning;
    }

    public String getCurrentMovie() {
        return dvdPlayer.getCurrentMovie();
    }
}
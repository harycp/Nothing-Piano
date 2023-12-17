package PianoVirtual;
public abstract class Instrument {
    protected final String path;

    // Konstruktor
    public Instrument(String path) {
        this.path = path;
    }

    // Metode play yang akan diimplementasikan oleh kelas anak
    public abstract void play();
}

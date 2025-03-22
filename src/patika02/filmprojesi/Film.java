package patika02.filmprojesi;

public class Film {
    private String ad;
    private int yil;
    private String tur;
    private double imdb;

    public Film(String ad, int yil, String tur, double imdb) {
        this.ad = ad;
        this.yil = yil;
        this.tur = tur;
        this.imdb = imdb;
    }

    public String getAd() { return ad; }
    public int getYil() { return yil; }
    public String getTur() { return tur; }
    public double getImdb() { return imdb; }

    @Override
    public String toString() {
        return ad + " (" + yil + ") - " + tur + " - IMDb: " + imdb;
    }
}



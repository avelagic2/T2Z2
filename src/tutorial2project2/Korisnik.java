package tutorial2project2;
import java.util.Objects;
public class Korisnik extends Osoba{
    private Racun racun;

    public Korisnik(String ime, String prezime) {
        super(ime, prezime);
    }

    public void dodajRacun(Racun racun) {
        this.racun = racun;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}

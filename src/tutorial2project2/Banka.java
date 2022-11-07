package tutorial2project2;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Banka {
    private Long brojRacuna;
    private List<Korisnik> korisnici;

    private List<Uposlenik> uposlenici;

    public Banka(List<Korisnik> korisnici, List<Uposlenik> uposlenici) {
        this.korisnici = korisnici;
        this.uposlenici = uposlenici;
    }

    public Korisnik kreirajNovogKorisnika(String ime, String prezime) {
        Korisnik k = new Korisnik(ime, prezime);
        this.korisnici.add(k);
        return k;
    }

    public Uposlenik kreirajNovogUposlenika(String ime, String prezime) {
        Uposlenik k = new Uposlenik(ime, prezime);
        this.uposlenici.add(k);
        return k;
    }

    public Racun kreirajRacunZaKorisnika(Korisnik k) {
        Racun r = null;
        for (int i = 0; i < korisnici.size(); i++) {
            if(korisnici.get(i).equals(k)) {
                Long brojRacuna = (new Random().nextLong());
                r = new Racun(brojRacuna, korisnici.get(i));
                break;
            }
        }
    return r;
    }
}

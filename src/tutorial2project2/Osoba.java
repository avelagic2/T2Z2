package tutorial2project2;

import java.util.Objects;

public class Osoba {

    private String ime;
    private String prezime;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(ime, osoba.ime) && Objects.equals(prezime, osoba.prezime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prezime);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }
}

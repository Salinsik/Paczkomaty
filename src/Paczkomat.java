import java.util.ArrayList;
import java.util.List;

public class Paczkomat {
    public static void main(String[] args) {
        Paczkomat paczkomat = new Paczkomat();
        Paczka paczka2 = new Paczka("LLC10255",2);

        paczkomat.dodajPaczke(paczka2);
        paczkomat.dodajPaczke(new Paczka("LBC10255",15));
        paczkomat.wyswietlZawartosc(paczkomat);
    }

    List<Paczka> paczki = new ArrayList();

    public void dodajPaczke(Paczka paczka) {
        paczki.add(paczka);
    }

    public void wyswietlZawartosc(Paczkomat paczkomat) {
        for (Paczka paczka : paczki) {
            System.out.println("Kod: " + paczka.getKod() + ", Waga: " + paczka.getWaga());
        }
    }

}

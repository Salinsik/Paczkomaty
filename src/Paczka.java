public class Paczka {
    private String kod;
    private int waga;

    public Paczka() {
        this.setKod("0");
        this.setWaga(0);
    }

    public Paczka(String kod, int waga) {
        this.setKod(kod);
        this.setWaga(waga);
    }


    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        if (kod != null && kod.matches("^   [A-Z]{3}[A-Z0-9]{5}$")) {
            this.kod = kod;
        } else {
            throw new IllegalArgumentException("Nieprawidłowe kod.");
        }
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }
}

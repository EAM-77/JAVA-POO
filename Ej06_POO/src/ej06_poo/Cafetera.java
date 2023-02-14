package ej06_poo;

public class Cafetera {
    private int capMax;
    private int capAct;

    public Cafetera() {
    }

    public Cafetera(int capMax, int capAct) {
        this.capMax = capMax;
        this.capAct = capAct;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCapAct() {
        return capAct;
    }

    public void setCapAct(int capAct) {
        this.capAct = capAct;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capMax=" + capMax + ", capAct=" + capAct + '}';
    }
}
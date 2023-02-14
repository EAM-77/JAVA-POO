package ej02_pooextra;

public class Puntos {
    private int [] vectorX = new int[2];
    private int [] vectorY;

    public Puntos() {
    }

    public Puntos(int[] vectorY) {
        this.vectorY = vectorY;
    }

    public int[] getVectorX() {
        return vectorX;
    }

    public void setVectorX(int[] vectorX) {
        this.vectorX = vectorX;
    }

    public int[] getVectorY() {
        return vectorY;
    }

    public void setVectorY(int[] vectorY) {
        this.vectorY = vectorY;
    }

    
}
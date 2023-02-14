
package Entidad;

public class Cuenta {
    
    // ATRIBUTOS
    
    private int numCta;
    private long numDNI;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numCta, long numDNI, int saldoActual) {
        this.numCta = numCta;
        this.numDNI = numDNI;
        this.saldoActual = saldoActual;
    }

    public int getNumCta() {
        return numCta;
    }

    public void setNumCta(int numCta) {
        this.numCta = numCta;
    }

    public long getNumDNI() {
        return numDNI;
    }

    public void setNumDNI(long numDNI) {
        this.numDNI = numDNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    @Override
    public String toString() {
        return "Cuenta{" + "numCta=" + numCta + ", numDNI=" + numDNI + ", saldoActual=" + saldoActual + '}';
    }
    

    
}

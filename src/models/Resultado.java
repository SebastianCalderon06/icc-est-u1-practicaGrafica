package models;

public class Resultado {
    private String algoritmo; 
    private int tamanio;      
    private long tiempo;      

    
    public Resultado(String algoritmo, int tamanio, long tiempo) {
        this.algoritmo = algoritmo;
        this.tamanio = tamanio;
        this.tiempo = tiempo;
    }
    public String getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String algoritmo) {
        this.algoritmo = algoritmo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }
}



package org.example.mutxaAwards;

public abstract class MutxaAwards {

    private int anyo;

    public MutxaAwards(int anyo) {
        this.anyo = anyo;
    }

    abstract void obtenerDetalles();
}

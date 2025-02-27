package org.example.mutxaAwards;

public class Presentador extends MutxaAwards implements AccionesAsistentes{

    private String nombre;

    public Presentador(int anyo, String nombre) {
        super(anyo);
        this.nombre = nombre;
    }

    @Override
    public void aplaudir() {
        System.out.println("Presentador " + nombre + " aplaudiendo... PLAS PLAS PLAS");

    }

    public void alfombraRoja() {
        System.out.println("Presentador " + nombre + " pasando por la alfombe roja...");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println("EL presentador da un discurso para " + tematica);
    }

    @Override
    public void celebrarPremio(Premio premio) {
        System.out.println("EL presentador " + nombre + " está celebrando el premio " + premio + " otorgado a " + premio.getGanador());

    }

    @Override
    void obtenerDetalles() {
        System.out.println("Presentador: " + nombre);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

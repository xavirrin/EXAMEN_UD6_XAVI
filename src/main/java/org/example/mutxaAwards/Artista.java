package org.example.mutxaAwards;

import java.util.ArrayList;

public class Artista extends MutxaAwards implements AccionesAsistentes {

    private String nombre;
    private ArrayList<Premio> listaPremios;
    private ArrayList<Categoria> categorias;

    public Artista(int anyo, String nombre, ArrayList<Premio> listaPremios, ArrayList<Categoria> categorias) {
        super(anyo);
        this.nombre = nombre;
        this.listaPremios = listaPremios;
        this.categorias = categorias;
    }


    @Override
    public void aplaudir() {
        System.out.println("El asistente " + nombre + " aplaudiendo... PLAS PLAS PLAS");
    }

    @Override
    public void alfombraRoja() {
        System.out.println("Artista " + nombre + " pasando por la alfombe roja...");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println("El artista está dando un discurso sobre " + tematica);
    }

    @Override
    public void celebrarPremio(Premio premio) {

        System.out.println("EL artista " + nombre + " está celebrando el premio " + premio + " otorgado a " + premio.getGanador());
    }

    @Override
    void obtenerDetalles() {

    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public ArrayList<Premio> getListaPremios() {
        return listaPremios;
    }

    public void setListaPremios(ArrayList<Premio> listaPremios) {
        this.listaPremios = listaPremios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}

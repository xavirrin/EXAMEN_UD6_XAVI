package org.example.mutxaAwards;

import java.util.ArrayList;

import static org.example.mutxaAwards.Categoria.MEJOR_ACTOR;
import static org.example.mutxaAwards.Categoria.MEJOR_PELICULA;

public class AppMutxaAwards {

    public static void main(String[] args) {

        ArrayList<MutxaAwards> listaAwards = new ArrayList<>();

        System.out.println("======BIENVENIDO A LOS MUTXAAWARDS======");

        // crear 1 presentador para la edicion de 2025 y obtenerDetalles()
        Presentador pres1 = new Presentador(1, "Roberto Leal");
        pres1.obtenerDetalles();
        listaAwards.add(pres1);
        System.out.println("----------------------");

        // crear 5 artistas para la edicion de 2025
        Artista art1 = new Artista(1,"Anna Castillo", new ArrayList<>(), new ArrayList<>() );
        Artista art2 = new Artista(1, "Luis Tosar", new ArrayList<>(), new ArrayList<>());
        Artista art3 = new Artista(1, "Eduard Fernández", new ArrayList<>(), new ArrayList<>());
        Artista art4 = new Artista(1, "Carolina Yuste", new ArrayList<>(), new ArrayList<>());
        Artista art5 = new Artista(1, "Enric Auquer", new ArrayList<>(), new ArrayList<>());

        listaAwards.add(art1);
        listaAwards.add(art2);
        listaAwards.add(art3);
        listaAwards.add(art4);
        listaAwards.add(art5);


        // todos los asistentes pasan por la alfombra roja
//        for (MutxaAwards asistente : listaAwards){
//                asistente.alfombraRoja();
//        }

        // todos los asistentes aplauden
//        for (MutxaAwards asistente : listaAwards){
//            asistente.aplaudir();
//        }

        // el presentador empieza a presentar la gala
        System.out.println(pres1.getNombre() + " presentado la gala...") ;

        // el presentador da un discurso "para solidarizarse con los afectados de la DANA"
        pres1.darDiscurso(" solidarizarse con los afectados de la DANA");

        // se crea el premio (new) con la categoria MEJOR_ACTOR
        Premio premio1 = new Premio(1, MEJOR_ACTOR, null);
        System.out.println("Introduciendo premio " + premio1.getCategoria().name());

        // 4 de los artistas son nominados a la categoria MEJOR_ACTOR y actualizan su lista de categorias
        ArrayList<Artista> listaNominados = new ArrayList<>();
        for(Artista artist : listaNominados){
            listaNominados.add(artist);
            System.out.println(artist.getNombre() + " nominado a " + artist.getCategorias());
          //  artist.setCategorias(Categoria.valueOf(MEJOR_ACTOR));
        }

        for (Artista nomis : listaNominados){
            //nomis.setCategorias(MEJOR_ACTOR);
            System.out.println(nomis.getNombre() + " nominado a " + nomis.getCategorias());
        }

        System.out.println("------------------");


        // 1 de los artistas nominados gana el premio y actualiza su lista de premios ganados
        System.out.println(art3.getNombre() + " ha ganado el premio " + premio1.getCategoria().name());
        System.out.println("------------------");

        // se actualiza el atributo ganador en el premio MEJOR_ACTOR
        premio1.setGanador(art3);

        // todos los asistentes aplauden y celebran el premio
        for (MutxaAwards asistente : listaAwards) {
 //           asistente.aplaudir();
        }
        System.out.println("------------------");
        for (MutxaAwards asistente : listaAwards){

   //         asistente.celebrarPremio();
        }
        System.out.println("------------------");
        // 1 de los artistas que estaba nominado intenta recoger el premio aunque no lo haya ganado


        // el artista ganador recoge el premio
        System.out.println("El artista " + premio1.getGanador() + " sube a recoger el premio " + premio1.getCategoria().name());

        // el presentador entrega el premio
        System.out.println("El presentador " + pres1.getNombre() + " está entregando el premio " + premio1.getCategoria().name() + " a " + premio1.getGanador());

        // el artista ganador realiza un discurso "sobre el esfuerzo realizado para rodar la película"
        premio1.getGanador().darDiscurso("el esfuerzo realizado para rodar la película.");
        System.out.println("------------------");

        // todos los asistentes aplauden
//        for(MutxaAwards gente : listaAwards){
//        }

        // el presentador da un discurso "para introducir el siguiente premio: MEJOR_PELICULA"
        pres1.darDiscurso(" introducir el siguiente premio: MEJOR_PELICULA");
        System.out.println("--------------------");

        // se crea el premio con la categoria MEJOR_PELICULA
        Premio premioMejorPeli = new Premio(1, Categoria.MEJOR_PELICULA, null);

        // 4 de los artistas son nominados a la categoria MEJOR_PELICULA y actualizan su lista de categorias
        ArrayList<Artista> nominadosMejorPeli = new ArrayList<>();
        for(Artista artist : nominadosMejorPeli){
            nominadosMejorPeli.add(artist);
            System.out.println(artist.getNombre() + " nominado a " + MEJOR_PELICULA.name());
            //  artist.setCategorias(Categoria.valueOf(MEJOR_ACTOR));
        }


        // 1 de los artistas nominados gana el premio y actualiza su lista de premios ganados
    //    art4.setListaPremios(Categoria.MEJOR_PELICULA);


        // se actualiza el ganador en el premio MEJOR_PELICULA
        premio1.setGanador(art4);

        // todos los asistentes celebran el premio
        for (MutxaAwards asistente : listaAwards){

    //        asistente.celebrarPremio();
        }
        System.out.println("------------------");

        // el artista ganador recoge el premio
        System.out.println("El artista " + premioMejorPeli.getGanador() + " sube a recoger el premio " + premioMejorPeli.getCategoria().name());


        // el presentador entrega el premio


        // el artista ganador realiza un discurso "sobre lo duro que ha sido conseguir financiación"


        // el presentador da un discurso "para despedir la gala"


        // mostrarDetalles() de cada artista después de la gala









    }
}

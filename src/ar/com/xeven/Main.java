package ar.com.xeven;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Queue<Usuario>filaUsuarios = new LinkedList<>();
        Usuario usuario = new Usuario("tatiana");

        Usuario usuario1 = new Usuario("Nick");

        Usuario usuario2 = new Usuario("Isabel");
        Negocio negocio = new Negocio();
        filaUsuarios.add(usuario);
        filaUsuarios.add(usuario1);
        filaUsuarios.add(usuario2);
        negocio.atenderUsuarios(filaUsuarios);

    }
}

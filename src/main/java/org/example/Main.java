package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<RuletaRusa> jugadores = new ArrayList<>();
        boolean estado = true;

        while (estado) {
            System.out.println("Bienvenido a Ruleta Rusa");
            System.out.println("1. Iniciar Juego");
            System.out.println("2. Salir del Juego");
            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    RuletaRusa.generarBala();
                    System.out.println("Crea a tus 5 jugadores:");
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Nombre del Jugador " + i + ": ");
                        String nombre = sc.nextLine();
                        jugadores.add(new RuletaRusa(nombre));
                        System.out.println("Jugador creado.");
                    }
                    boolean juegoTerminado = false;
                    int turno = 0;

                    while (!juegoTerminado) {
                        RuletaRusa jugadorActual = jugadores.get(turno);
                        System.out.println(jugadorActual.jugador + " No tengas miedo presiona ENTER y disparar...");
                        sc.nextLine();
                        if (jugadorActual.disparar()) {
                            System.out.println("Haz perdido " + jugadorActual.jugador + " Nos vemos en la otra vida");
                            juegoTerminado = true;
                        } else {
                            turno = (turno + 1) % jugadores.size();
                        }
                    }
                    break;
                case 2:
                    estado = false;
                    System.out.println("Cerrando Juego...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
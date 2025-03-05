package org.example;

import java.util.Random;

public class RuletaRusa {
    String jugador;
    private static int bala;
    private int posicionActual;
    private static Random random = new Random();

    public static void generarBala() {
        bala = random.nextInt(6) + 1;
        System.out.println("Bala = "+ bala);
    }

    public RuletaRusa(String jugador) {
        this.jugador = jugador;
        this.random = new Random();
        this.posicionActual = 0;
    }

    public boolean disparar() {
        posicionActual = random.nextInt(6) + 1;
        System.out.println("Posicion actual de Jugador " + posicionActual);
        System.out.println(jugador + " aprieta el gatillo...");
        if (posicionActual == bala) {
            System.out.println("NOOO " + jugador + " ha pasado a mejor vida.");
            System.out.println("Bala estaba en posicion # "+bala);
            return true;
        } else {
            System.out.println(jugador + " se ha salvado. pero solo por esta vez");
            return false;
        }
    }

    public void reiniciarJuego(){
        bala = random.nextInt(6)+1;
        posicionActual = random.nextInt(6)+1;
        System.out.println("Juego reinciado");
    }
}

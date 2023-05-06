package org.example;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("Bienvenido al Menú del Juego de Ajedrez");
            System.out.println("1. Juego");
            System.out.println("2. Jugadores");
            System.out.println("3. Ayuda");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = input.nextInt();

            switch(option) {
                case 1:
                    gameMenu();
                    break;
                case 2:
                    playersMenu();
                    break;
                case 3:
                    helpMenu();
                    break;
                case 4:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

            System.out.println();
        } while(option != 4);
    }

    public static void gameMenu() {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú de Juego");
            System.out.println("1. Iniciar un juego nuevo");
            System.out.println("2. Cargar un juego en curso");
            System.out.println("3. Jugar un juego finalizado");
            System.out.println("4. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            option = input.nextInt();

            switch(option) {
                case 1:
                    startNewGame();
                    break;
                case 2:
                    loadGame();
                    break;
                case 3:
                    playFinishedGame();
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

            System.out.println();
        } while(option != 4);
    }

    public static void startNewGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando un juego nuevo...");
        System.out.print("Ingrese el nombre del primer jugador: ");
        String player1 = input.nextLine();
        System.out.print("Ingrese el nombre del segundo jugador: ");
        String player2 = input.nextLine();
        System.out.println("Asignando colores a los jugadores...");
        System.out.println(player1 + " jugará con las piezas blancas.");
        System.out.println(player2 + " jugará con las piezas negras.");
    }

    public static void loadGame() {
        System.out.println("Cargando juegos en curso...");
        System.out.println("Juego 1: Jugador 1 vs Jugador 2");
        System.out.println("Juego 2: Jugador 3 vs Jugador 4");
        System.out.println("Juego 3: Jugador 5 vs Jugador 6");
    }

    public static void playFinishedGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("Juegos finalizados disponibles:");
        System.out.println("Juego 1: Jugador 1 vs Jugador 2");
        System.out.println("Juego 2: Jugador 3 vs Jugador 4");
        System.out.println("Juego 3: Jugador 5 vs Jugador 6");
        System.out.print("Ingrese el número del juego que desea volver a jugar: ");}

    public static void playersMenu() {
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("---------- JUGADORES ----------");
            System.out.println("1. Crear nuevo jugador");
            System.out.println("2. Lista de todos los jugadores");
            System.out.println("3. Puntuaciones de los jugadores");
            System.out.println("4. Actualizar jugador");
            System.out.println("5. Eliminar jugador");
            System.out.println("0. Volver al menú principal");

            int choice = input.nextInt();
            input.nextLine(); // consume extra \n character

            switch (choice) {
                case 1:
                    //createNewPlayer();
                    break;
                case 2:
                    //listAllPlayers();
                    break;
                case 3:
                    //listPlayersScore();
                    break;
                case 4:
                    //updatePlayer();
                    break;
                case 5:
                    //deletePlayer();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    public static void helpMenu() {
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("---------- AYUDA ----------");
            System.out.println("1. Cómo jugar");
            System.out.println("2. Reglas del juego");
            System.out.println("3. Contactar al administrador");
            System.out.println("0. Volver al menú principal");

            int choice = input.nextInt();
            input.nextLine(); // consume extra \n character

            switch (choice) {
                case 1:
                    System.out.println("Aquí se mostrará una explicación sobre cómo jugar.");
                    break;
                case 2:
                    System.out.println("Aquí se mostrarán las reglas del juego.");
                    break;
                case 3:
                    System.out.println("Para contactarse con un administrador ingrese a @");;
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }}
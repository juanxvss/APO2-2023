package TicTacToe;
import java.util.Scanner;

public class TicTacToe {
    
    // Tablero de juego
    private char[][] board = new char[3][3];
    
    // Jugador actual
    private char currentPlayer;
    
    // Constructor
    public TicTacToe() {
        // Inicializar el tablero
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
        // El jugador X va primero
        currentPlayer = 'X';
    }
    
    // Método para imprimir el tablero en la consola
    public void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    
    // Método para cambiar el jugador actual
    public void changePlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
    
    // Método para colocar una marca en el tablero
    public void placeMark(int row, int col) {
        board[row][col] = currentPlayer;
    }
    
    // Método para verificar si hay un ganador
    public boolean checkForWin() {
        // Comprobar filas
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == currentPlayer && 
                board[row][1] == currentPlayer &&
                board[row][2] == currentPlayer) {
                return true;
            }
        }
        // Comprobar columnas
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == currentPlayer && 
                board[1][col] == currentPlayer &&
                board[2][col] == currentPlayer) {
                return true;
            }
        }
        // Comprobar diagonal principal
        if (board[0][0] == currentPlayer && 
            board[1][1] == currentPlayer &&
            board[2][2] == currentPlayer) {
            return true;
        }
        // Comprobar diagonal secundaria
        if (board[0][2] == currentPlayer && 
            board[1][1] == currentPlayer &&
            board[2][0] == currentPlayer) {
            return true;
        }
        // Si no hay ganador, devolver false
        return false;
    }
    
    // Método para ejecutar el juego
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido a Tic-Tac-Toe!");
        while (true) {
            // Imprimir el tablero
            printBoard();
            // Pedir al jugador que ingrese la fila y la columna
            System.out.print("Jugador " + currentPlayer + ", ingrese la fila (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Jugador " + currentPlayer + ", ingrese la columna (0-2): ");
            int col = scanner.nextInt();
            // Coloc


	import java.util.Scanner;

	public class puntoOcho {

	    private static Scanner scanner = new Scanner(System.in);
	    private static int[][] arrayA;
	    private static int[][] arrayB;
	    private static int[][] arrayC;
	    private static int rowsA;
	    private static int colsA;
	    private static int rowsB;
	    private static int colsB;

	    public static void main(String[] args) {
	        boolean exit = false;
	        while (!exit) {
	            System.out.println("Ingresa una opción");
	            System.out.println("A. Ingresa Arreglo A");
	            System.out.println("B. Ingresa Arreglo B");
	            System.out.println("C. Pantalla A + B");
	            System.out.println("D. Pantalla A - B");
	            System.out.println("E. Pantalla A * B");
	            System.out.println("F. Salir");

	            String option = scanner.nextLine();

	            switch (option) {
	                case "A":
	                    enterArrayA();
	                    break;
	                case "B":
	                    enterArrayB();
	                    break;
	                case "C":
	                    if (arrayA != null && arrayB != null && rowsA == rowsB && colsA == colsB) {
	                        displayArray(addArrays(arrayA, arrayB));
	                    } else {
	                        System.out.println("Las matrices deben tener las mismas dimensiones y no ser nulas.");
	                    }
	                    break;
	                case "D":
	                    if (arrayA != null && arrayB != null && rowsA == rowsB && colsA == colsB) {
	                        displayArray(subtractArrays(arrayA, arrayB));
	                    } else {
	                        System.out.println("Las matrices deben tener las mismas dimensiones y no ser nulas");
	                    }
	                    break;
	                case "E":
	                    if (arrayA != null && arrayB != null && colsA == rowsB) {
	                        displayArray(multiplyArrays(arrayA, arrayB));
	                    } else {
	                        System.out.println("Las columnas de la matriz A deben ser iguales a las filas de la matriz B y ambas matrices no deben ser nulas.");
	                    }
	                    break;
	                case "F":
	                    exit = true;
	                    break;
	                default:
	                    System.out.println("Opcion invalida.");
	                    break;
	            }
	        }
	    }

	    private static Object multiplyArrays(int[][] arrayA2, int[][] arrayB2) {
		
			return null;
		}

		private static Object subtractArrays(int[][] arrayA2, int[][] arrayB2) {
			
			return null;
		}

		private static void displayArray(Object addArrays) {
			
			
		}

		private static Object addArrays(int[][] arrayA2, int[][] arrayB2) {
			
			return null;
		}

		private static void enterArrayA() {
	        System.out.println("Ingrese el número de filas para la matriz A:");
	        rowsA = scanner.nextInt();
	        scanner.nextLine();

	        System.out.println("Ingrese el número de columnas para la matriz A:");
	        colsA = scanner.nextInt();
	        scanner.nextLine();

	        arrayA = new int[rowsA][colsA];

	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsA; j++) {
	                System.out.printf("Ingrese el valor para la fila %d y la columna %d de la matriz A: ", i+1, j+1);
	                arrayA[i][j] = scanner.nextInt();
	                scanner.nextLine();
	            }
	        }

	        displayArray(arrayA);
	    }

	    private static void enterArrayB() {
	        System.out.println("Ingrese el número de filas para la matriz B:");
	        rowsB = scanner.nextInt();
	        scanner.nextLine();

	        System.out.println("Ingrese el número de columnas para la matriz B:");
	        colsB = scanner.nextInt();
	        scanner.nextLine();

	        arrayB = new int[rowsB][colsB];

	        for (int i = 0; i < rowsB; i++) {
	            for (int j = 0; j < colsB; j++) {
	                System.out.printf("Ingrese el valor para la fila %d y la columna %d de la matriz B: ", i+1, j+1);
	                arrayB[i][j] = scanner.nextInt();
	               


}
	        }
	    }
	}
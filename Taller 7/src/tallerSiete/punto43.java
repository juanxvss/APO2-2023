package tallerSiete;

public class punto43 {
	
	    public static void main(String[] args) {    //Hay una excepción en la línea 4. Al intentar acceder al elemento en el índice 10 de un arreglo de tamaño 5,
	    	                                        //Se lanza una excepción ArrayIndexOutOfBoundsException. 
	        try {
	            int[] arr = new int[5];
	            arr[10] = 15;
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: índice fuera de los límites del arreglo.");
	        }
	    }
	}

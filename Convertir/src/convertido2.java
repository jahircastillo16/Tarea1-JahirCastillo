import java.util.Scanner;

public class convertido2 {
	  public static void main(String[] args) {
	    	//Declaracion de variables
	        int unidad, menu , decena, centena, numero,temp=0,ant = 0,suma = 0;
	        char letra = ' ';
	        String [] unidadx = {"I","II","III","IV","V","VI","VII","VIII","IX"}; 
	        String [] decenax = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"}; 
	        String [] centenax = {"C","C"};
	        char romanov[]= {' ','I','V','X','L','C'}; 
	        int valor[] = {0,1,5,10,50,100};
	       
	        //Imprimir menu
	        Scanner entrada = new Scanner(System.in);
	        System.out.printf(" ===================================%n");
	        System.out.printf("|1. Convertir de Arabigos a Romanos|");
	        System.out.printf("%n");
	        System.out.printf("%s%n","|2. Convertir de Romanos a Arabigos|");
	        System.out.printf("%s%n","|Ingresa Opcion:                   |");
	        System.out.printf(" ===================================%n");
	        menu = entrada.nextInt();
	        
	        switch(menu) {
	        case 1:
	        	 //arabigos a romanos
	        	 System.out.printf(" ====================================%n");
	            System.out.printf("%s%n","|Convertir numeros Arabigos a Romanos|");
	            System.out.printf("|Ingrese el numero a convertir:      |%n ");
	            System.out.printf("====================================%n");
	            numero = entrada.nextInt();
	            unidad = numero % 10;
	            numero /= 10;
	            decena = numero % 10;
	            numero /= 10;
	            centena = numero % 10;
	            numero /= 10;
	            System.out.println();
	            System.out.println("Resultado en Romanos:");
	            for (int i=0;i < centenax.length; i++){
	                if (numero == 9) {
	                    System.out.printf("%s", centenax[8]);
	                    break;
	                }else if (centena == i && centena != 0) {
	                    temp = i - 1;
	                    System.out.printf("%s", centenax[temp]);
	                }
	            }
	            for (int i=0;i < decenax.length; i++){
	                if (decena == 9) {
	                    System.out.printf("%s", decenax[8]);
	                    
	                    break;
	                }else if (decena == i && decena != 0) {
	                    temp = i - 1;
	                    System.out.printf("%s", decenax[temp]);
	                }
	            }
	            for (int i=0;i < unidadx.length; i++){
	                if (unidad == 9) {
	                    System.out.printf("%s", unidadx[8]);	                    
	                    break;
	                }else
	                if (unidad == i && unidad != 0) {
	                    temp = i - 1;
	                    System.out.printf("%s", unidadx[temp]);	                    	                    	                    
	                }
	            }          
	        
	        break;
	       
	        
	        case 2:   
	  /**romanos a arabigos**/
	        	System.out.printf("=======================================%n");
	             System.out.printf("%s%n","|Convertir numeros Romanos a Arabigos |");
	             Scanner leer = new Scanner(System.in);
	             System.out.printf("|Ingrese el numero Romano a convertir:|%n");
	             System.out.printf("=======================================%n");
	             String romano = leer.nextLine();
	             for(int i = 0; i < romano.length(); i++){//Escanea la frase
	                 letra = romano.charAt(i);
	                 for(int j = 0; j < romanov.length; j++){
	                     if(letra == romanov[j]){//si letra recorrida = a letra contenida en rom
	                                 suma = suma + valor [j]; //sumar el valor de la letra
	                             if( ant < valor[j]){ //si el valor de letra anterior menor a valor letra   //actual
	                                     suma = suma - ant*2 ; // restale el doble del menor de los dos
	                                     ant = valor[j]; // valor anterior = valor letra actual
	                             }else {//si no se cumple lo anterior
	                         ant = valor[j];//el dato actual se guarda en anterior
	  }
	                     }

	                 }
	         }
	         System.out.println("Resultado en Arabigos:");
	         System.out.print(suma);
	         break;
	        }

	}
}

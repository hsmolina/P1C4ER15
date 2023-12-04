
package actividad2pooe15;

//Importamos el java.util.Scanner para registrar los datos escritos
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        //Definimos variables
        int PESOA, PESOB, PESOC, PESOD; //PESOA: Peso de la esfera A PESOB: Peso de la esfera B PESOC: Peso de la esfera C PESOD: Peso de la esfera D
                
        //Título y datos
        System.out.println("Ejercicio resuelto #15");
        
        //Definimos la variable scanner de tipo Scanner para que registre las entradas
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario  los datos de peso de las esferas A,B,C Y D
        System.out.print("Ingrese el peso de las esfera A: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada1 = scanner.nextLine();
        PESOA = Integer.parseInt(entrada1);
        
        System.out.print("Ingrese el peso de las esfera B: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada2 = scanner.nextLine();
        PESOB = Integer.parseInt(entrada2);
        
        System.out.print("Ingrese el peso de las esfera C: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada3 = scanner.nextLine();
        PESOC = Integer.parseInt(entrada3);
        
        System.out.print("Ingrese el peso de las esfera D: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada4 = scanner.nextLine();
        PESOD = Integer.parseInt(entrada4);
        
        //Toma de decisiones
        if (PESOA == PESOB && PESOA == PESOC) {
            System.out.println("La esfera D es la diferente");
            if (PESOD > PESOA) {
                System.out.println("y es la de mayor peso ");
            } else {
                System.out.println("y es la de menor peso ");
            }
        } else {
            if (PESOA == PESOB && PESOA == PESOD ) {
            System.out.println("La esfera C es la diferente ");
                if (PESOC > PESOA) {
                System.out.println("y es de mayor peso");
                } else {
                    System.out.println("y es de menor peso");
                }  
            } else {
                if (PESOA == PESOC && PESOA == PESOD) {
                    System.out.println("La esfera B es la diferente ");
                    if (PESOB > PESOD){
                        System.out.println("y es de mayor peso");
                    } else {
                        System.out.println("y es de menor peso");
                    }
                } else {
                    System.out.println("La esfera A es la diferente ");
                    if (PESOA> PESOB) {
                        System.out.println("y es de mayor peso");
                    } else {
                            System.out.println("y es de menor peso");
                            }
                }

                }
        }
    }
    
}

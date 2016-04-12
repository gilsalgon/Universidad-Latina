
package calificacion;
import java.util.*;

public class Calificacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Metodo para leer del teclado
        int i,mayor=0,indice=0;//Variable mayor almacenara el indice de el elemento mayor
        int[] x = new int[10];//Declarando arreglo

        //Lenando arreglo
        //for para moverse por el arreglo
        for(i=0;i<10;i++){
           System.out.println("Alumno ["+i+"]");
           x[i] = sc.nextInt();//Leyendo dato del teclado
        }
 
    mayor=x[0];//Igualamos mayor al primer elemento del arreglo
    //Encontrando la pocicion del mayor;
    //For para desplazarce por el arreglo
    for(i=0;i<10;i++){
    //Comparando elementos del array para determinar el mayor
    if(x[i]>mayor){
        mayor = x[i];//Si x[i] es mayor que mayor esta toma su valor
        indice = i;//Almacenando el ndice del mayor
    }
}//Cierra for

 //Mostrando elementos del arreglo
 for(i=0;i<10;i++)
 System.out.println("Elemento ["+i+"]"+x[i]);

 //Mostrando indice del mayor
 System.out.println("El elemento mayor es:"+mayor+"y su pocicion es: "+indice);

 }
}
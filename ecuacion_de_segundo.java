import java.util.Scanner;
public class ecuacion_de_segundo
{
 public static void main (String args [])
 {
 Scanner t=new Scanner (System.in);
 
 double raiz, x1, x2;
 
 System.out.println("Favor de ingresar el valor de a");
 int a=t.nextInt();
 System.out.println("Favor de ingresar el valor de b");
 int b=t.nextInt();
 System.out.println("Favor de ingresar el valor de c");
 int c=t.nextInt();
 
 raiz = b * b - (4 * a * c);
 
 if (raiz == 0){
  x1 = -b / (2 * a);
  System.out.println("Tiene 1 resultado: " + "\nResultado 1: " + x1);
  }else if (raiz > 0){
  raiz = Math.sqrt(raiz);
  x1 = (-b + raiz) / (2 * a);
  x2 = (-b -raiz) / (2 * a);
  System.out.println("Tiene 2 resultados: " + "\nResultado 1: " + x1 +"\nResultado 2: " + x2);
  }else{
   System.out.println("No tiene solucion");
  }
 }
}
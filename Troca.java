 
 import java.util.Scanner;
 public class Troca {
     public static void main(String[] args) {
 
 int num1, num2, res;
       Scanner sc= new Scanner(System.in);
      
     //processamennto
       System.out.print("Digite um número para ser definido como valor da variável A: ");
       num1 = sc.nextInt();
       System.out.println("Digite um número para ser definido como valor da variável B: ");
       num2= sc.nextInt();
      
    System.out.println("Agora a variável A passa a possuir o valor: " +num2);
      
 System.out.println("Agora a variável B passa a possuir o valor: " +num1);
     }
    }

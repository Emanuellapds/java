import java.util.Scanner;

public class consoleNumber {
    
    public static void main(String[] args) {
        
    

     Scanner x = new Scanner(System.in);

     int idade;

     System.out.println("digite a sua idade");
     idade = x.nextInt();


     String resultado = (idade >=18) ? "Maior de idade" : "Menor de idade";
    System.out.println(resultado);

     x.close();

     
    }
}

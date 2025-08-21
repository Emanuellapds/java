public class Ex_01 {
    public static void main(String [] args){
    
       double base = 10;
       double altura = 15;
       double lado = 2;

       double quadrado = lado * lado;
       double retangulo = base *altura;
       double triangulo = (base*altura)/2;

       System.out.println("A area do triangulo é: " + triangulo + "n/"+ 
                            "A area do retangulo é: " + retangulo + "n/"+
                             "A area do quadrado é: " + quadrado 
                             );

    }
}

package metodos1;

import java.util.Scanner;

public class metodos7 {

    public static void areadocirculo() {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        double raio = leitor.nextDouble();
        double areaDoCirculo = calcularAreaCirculo(raio);
        System.out.println("A área do círculo é: " + areaDoCirculo);
    }

    public static double calcularAreaCirculo(double raio) {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }


    public static void main(String[] args) { 
        
   areadocirculo();
}
    
}

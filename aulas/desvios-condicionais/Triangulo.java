import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int lado1, lado2, lado3;
        
        System.out.println("Digite Lado 1:");
        lado1 = leitor.nextInt();
        System.out.println("Digite Lado 2:");
        lado2 = leitor.nextInt();
        System.out.println("Digite Lado 3:");
        lado3 = leitor.nextInt();

        System.out.println("Lado1: "+lado1);
        System.out.println("Lado2: "+lado2);
        System.out.println("Lado3: "+lado3);

        if(lado1 == lado2 && lado1 == lado3) {
            System.out.println("EQUILATERO");
        } else {
            if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
                System.out.println("ESCALENO");
            } else {
                System.out.println("ISOSCELES");
            }
        }

    }
}

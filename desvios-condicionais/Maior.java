import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("numero 1:");
        n1 = leitor.nextInt();
        System.out.println("numero 2:");
        n2 = leitor.nextInt();
        System.out.println("numero 3:");
        n3 = leitor.nextInt();

        if(n1 >= n2 && n1 >= n3) {
            System.out.println("MAIOR: "+n1);
        } else {
            if(n2 >= n3) {
                System.out.println("MAIOR: "+n2);
            } else {
                System.out.println("MAIOR: "+n3);
            }
        }
        
    }
}

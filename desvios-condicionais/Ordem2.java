import java.util.Scanner;

public class Ordem2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("numero 1:");
        n1 = leitor.nextInt();
        System.out.println("numero 2:");
        n2 = leitor.nextInt();
        System.out.println("numero 3:");
        n3 = leitor.nextInt();

        if(n1 < n2) {
            if(n2 < n3) {
                System.out.println("ORDEM: "+n1+","+n2+","+n3);
            } else {
                if(n1 < n3) {
                    System.out.println("ORDEM: "+n1+","+n3+","+n2);
                } else {
                    System.out.println("ORDEM: "+n3+","+n1+","+n2);
                }
            }
        } else {
            if(n2 > n3) {
                System.out.println("ORDEM: "+n3+","+n2+","+n1);
            } else {
                if(n1 < n3) {
                    System.out.println("ORDEM: "+n2+","+n1+","+n3);
                } else {
                    System.out.println("ORDEM: "+n2+","+n3+","+n1);
                }
            }
        }
        
    }
}

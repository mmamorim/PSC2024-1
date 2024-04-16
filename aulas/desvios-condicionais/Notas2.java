package aula1803;

import java.util.Scanner;

public class Notas2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a1, a2, a3, notaFinal;
        
        System.out.println("Digite a nota A1:");
        a1 = leitor.nextInt();
        System.out.println("Digite a nota A2:");
        a2 = leitor.nextInt();
        System.out.println("Digite a nota A3:");
        a3 = leitor.nextInt();
        notaFinal = (a1*3+a2*3+a3*4)/10;
        
        System.out.println("Notas: "+a1+" "+a2+" "+a3);
        System.out.println("NotaFinal: "+notaFinal);
        
        if(notaFinal >= 70) {
            System.out.println("AP");
        } else {
            if(notaFinal >= 30) {
                System.out.println("AI");                
            } else {
                System.out.println("REP");
            }
        }
        
    }
    
}
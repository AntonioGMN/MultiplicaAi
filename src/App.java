import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Digite um numero");
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        

        System.out.println("Tabela de multiplicação de " + num);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));    
        }
    }
}

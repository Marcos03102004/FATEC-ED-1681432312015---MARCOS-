import java.util.Scanner;

public class FibonacciLoop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de sequências que serão impressas: ");
        
        int quantidadeSequencias = scanner.nextInt();
        
        int primeiroNumero = 1;
        int segundoNumero = 1;
        
        System.out.println("Sequência de Fibonacci utilizando loop:");
        for (int i = 0; i < quantidadeSequencias; i++) {
            System.out.print(primeiroNumero + " ");
            
            int proximoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
        }
    }
}

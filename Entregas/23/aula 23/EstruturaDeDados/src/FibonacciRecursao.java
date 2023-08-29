import java.util.Scanner;

public class FibonacciRecursao {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de sequ�ncias que ser�o impressas: ");
        
        int quantidadeSequencias = scanner.nextInt();
        
        System.out.println("Sequ�ncia de Fibonacci utilizando recurs�o:");
        for (int i = 0; i < quantidadeSequencias; i++) {
            System.out.print(calcularFibonacci(i + 1) + " ");
        }
    }
    
    public static int calcularFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}



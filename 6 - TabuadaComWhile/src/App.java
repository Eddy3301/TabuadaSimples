import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a tabuada que quer calcular!");
        N = scanner.nextInt();

        int multiplicador = 1;
        while (multiplicador <= 10) {
            int resultado = N * multiplicador;
            System.out.println(N + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }
        scanner.close();
    }
}

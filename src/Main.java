import java.util.Scanner;

// Operador booleano e de igual ==/ e essa operação está comparando o resultado
// que o usuário escrever para o resultado que é esperado
public class Main {
    public static void main(String[] args) {
        var scanner =  new Scanner(System.in);
        System.out.printf("Quanto é 2 + 2?");
        var result = scanner.nextInt();
        var isRight = result == 4;
        System.out.printf("O resultado é 4, você acertou? (%s)", result == 4);
    }
}

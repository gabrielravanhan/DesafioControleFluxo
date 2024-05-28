package contador;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm, parametroDois;

        System.out.print("Digite o primeiro parâmetro: ");
        parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("\nO segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        System.out.println();

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

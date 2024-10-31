import java.util.Scanner;

import exceptions.ParametroInvalidoException;

public class Contador {
    public static void main(String[] args) throws Exception {

        // Lendo valores do usuário -------------------------
        Scanner cin = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        int valor1 = cin.nextInt();

        System.out.print("Informe o segundo valor: ");
        int valor2 = cin.nextInt();

        cin.close();

        // Tentando imprimir valores -------------------------------------

        
        try {

            // Exemplo com valores fixos ---------------------------------
            // count(30, 12); // Descomentar para testar a exception
            // count(12, 30); // Descomentar para testar com valor fixo

            // Valores fornecidos pelo usuário
            count(valor1, valor2);
            
        } catch (ParametroInvalidoException e) {
            e.printStackTrace();
        }


    }

    private static void count(int n1, int n2) throws ParametroInvalidoException {

        // Dispara exceção se o parametro for inválido -------------------

        if (n1 > n2) throw new ParametroInvalidoException();

        System.out.printf("========== Iterando de %d a %d ==================\n", n1, n2);


        int num = 0;

        for (int i = n1; i < n2; i++) {
            num = (i - n1) + 1;
            System.out.println("Imprimindo numero " + num);
        }

        System.out.println("=================================================\n");

    }
}

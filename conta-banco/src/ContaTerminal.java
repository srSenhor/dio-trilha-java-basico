import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Importando a classe Scanner --------------------------------------
        Scanner cin = new Scanner(System.in);
        
        // Exibindo e obtendo informações via Scanner -----------------------
        System.out.println("===== Terminal de Conta Bancária =====");
        System.out.println("Por favor, preencha as informacoes com cuidado!");

        System.out.print("Informe seu nome completo:\t");
        String nomeCliente = cin.nextLine();

        System.out.print("Informe o numero da agencia:\t");
        String agencia = cin.nextLine();

        System.out.print("Informe o numero da conta:\t");
        int numero = cin.nextInt();
        
        System.out.print("Informe o saldo da conta:\t");
        double saldo = cin.nextDouble();

        // Exibindo a mensagem da conta criada pelo usuário -----------------
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco,"
                        + " sua agencia é %s,"
                        + " conta %d e"
                        + " seu saldo %.2f esta disponível para saque.\n", 
                            nomeCliente.toUpperCase(), agencia, numero, saldo);

        // Outro jeito de fazer
        // System.out.println("Olá "   +  nomeCliente.toUpperCase() + ", obrigado por criar uma conta em nosso banco," 
        //                             + " sua agencia é " + agencia + ", "
        //                             + "conta " + numero 
        //                             + " e seu saldo " + saldo + " esta disponível para saque.");


        cin.close();
        
    }
}

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, insira seu nome!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, insira sua agencia");
        agencia = scanner.nextLine();

        System.out.println("Por favor, insira seu saldo!");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " e seu saldo " + saldo + " já está disponivel para saque." );

    }

}

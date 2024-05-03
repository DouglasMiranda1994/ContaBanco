import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua agência: ");
        String agencia = scan.next();

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite sua conta: ");
        int numeroConta = scan.nextInt();

        System.out.println("Digite seu saldo: ");
        double saldo = scan.nextDouble();

        System.out.println("Conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
    }
}

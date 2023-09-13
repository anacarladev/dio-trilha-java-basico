import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Recebendo as informacoes do cliente
        System.out.println("Digite o numero da sua agência - com o digito - e tecle ENTER");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o numero da sua conta - sem o digito - e tecle ENTER");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo da sua conta bancária - e tecle ENTER");
        Double saldoConta = scanner.nextDouble();

        System.out.println("Digite o nome completo - e tecle ENTER");
        String nomeCliente = scanner.next();

        //Imprimindo as informacoes do cliente
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é  " + numeroAgencia + " , conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");

    }
}

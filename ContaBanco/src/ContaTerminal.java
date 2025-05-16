import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public ContaTerminal() {
    }
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = (new Scanner(System.in)).useLocale(Locale.US);
        //Exibir as mensagens para o nosso usuário
        System.out.println("Olá, seja bem-vindo ao Banco Digital!");
        // Obter pela Scanner o número da conta digitada no termimal
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = scanner.next();
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.next();
        double saldo = (237.48);
        // Obter pela Scanner os valores digitados no termimal
        
        // Exibir a mensagem conta criada com sucesso
        System.out.println("Olá, " + nomeCliente + "! Seja bem-vindo ao Banco Digital! Obrigado por criar sua conta em nosso Banco.");
        System.out.println("Sua conta é: " + numeroConta + " e sua agência é: " + numeroAgencia);
        System.out.println("Seu saldo é: " + saldo + " reais, já disponível para saque.");
    }
}

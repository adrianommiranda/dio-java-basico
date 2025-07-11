import java.util.Locale;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nome;
        int idade;
        String cidade;

        System.out.println("Digite o seu nome");
        nome = scanner.nextLine();

        System.out.println("Digite a idade: ");
        idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite a cidade: ");
        cidade = scanner.nextLine();


        System.out.println("Nome cadastrado: " + nome + " idade: " + idade + " cidade " + cidade);
    }
}

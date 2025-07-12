import java.util.Scanner;

public class EscolaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.println("Entre com a nota do aluno");
        nota = scanner.nextInt();

        if(nota > 7){
            System.out.println("Aluno Aprovado");
        }else if((nota>4) && (nota<7) ){
            System.out.println("Aluno em recuperação");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
}

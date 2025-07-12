public class Ternario {
    public static void main(String[] args) {
        
        int nota = 7;

        String resp = nota>=7?"Aprovado":"Reprovado";

        System.out.println(resp);

        System.out.println("\n\n-------------------\n\n");
        double salario = 1000; 
        double bonus = salario * (salario > 1000 ? 0.10 : 0.15);
        System.err.println(bonus);
    }
}

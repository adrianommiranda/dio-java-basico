public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 20.0;
        double saque = 14.5;

        if(saque < saldo){
            saldo = saldo - saque;
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Salfo insuficiente");
        }
    }
}

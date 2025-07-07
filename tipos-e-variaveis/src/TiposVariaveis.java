public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        short curto = 1;
        int normal = curto;

        //cast
        short n = (short) normal;

        System.out.println("O valor de n é = " + n);

        final double VALOR_DE_PI = 3.14;
        System.out.println("valor constante de PI = " + VALOR_DE_PI);
    }
}

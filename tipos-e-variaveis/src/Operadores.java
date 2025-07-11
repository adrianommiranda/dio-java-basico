public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Adriano " + "Mir";
        System.out.println(nomeCompleto);    

        String concat = 1+1+1 + " 1";
        System.out.println(concat);

        System.out.println("-------------------------");

        int n = 5;
        System.out.println(- n);
        System.out.println(n);

        //Caso eu queira que o número agora seja negativo
        n = -n;
        System.out.println(n);


        System.out.println("\n\n------------incremento e decremento-------------\n\n");
        int i = 1;
        System.out.println(i++);
        System.out.println(i+4);
        System.out.println(++i);

         System.out.println(i--);
         System.out.println(--i);

        System.out.println("\n\n------------Negando boolean-------------\n\n");
        boolean resp = true;
        System.out.println(!resp); // vai dar falso, mas é em memória

        //vou atribuir ela a ser falsa agora
        resp = !resp;
        System.out.println(resp); 


        System.out.println("\n\n------------Operador Ternário-------------\n\n");
        int idade = 18;

        String mensagem = idade >= 18
            ?"Pode entrar na festa"
            :"Não tem idade para entrar";

        System.out.println(mensagem);


          System.out.println("\n\n------------Condicionais-------------\n\n");
          int a=20, b=20;

          if(a>b){
            System.out.println("A é maior");
          }else if(b>a){
            System.out.println("B é maior");
          }else{
            System.out.
            println("Iguais");
          }


          System.out.println("\n\n------------Equals--para objetos ou textos. Compara conteúdos----------\n\n");
          String nomeUm = "Adriano";
          String nomeDois = new String("Adriano");

          System.out.println(nomeUm.equals(nomeDois));
    }

    
}

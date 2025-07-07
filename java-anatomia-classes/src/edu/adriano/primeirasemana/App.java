package edu.adriano.primeirasemana;
public class App {
        public static void main(String[] args) {
            //System.out.println("Bem vindo");
            int anofabticacao = 1982;
            boolean verdadeiro =  true;

            int n1 = 10;
            int n2 = 20; 
            somar(n1, n2);
            
            String nome = "Adriano";
            String sobreNome = "Mir";
            System.out.println(nomeCompleto(nome, sobreNome));   

        }

        public static void somar(int n1, int n2){
            int soma = n1 + n2;
            System.out.println("O valor da soma é: " + soma);
        }

        public static String nomeCompleto(String primeiroNome, String segundioNome){
            return primeiroNome.concat(" " + segundioNome);
        }
    }


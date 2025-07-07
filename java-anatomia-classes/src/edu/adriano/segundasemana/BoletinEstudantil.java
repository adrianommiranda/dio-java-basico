package edu.adriano.segundasemana;
public class BoletinEstudantil {
    public static void main(String[] args) {
        int mediafinal = 6;

        if (mediafinal < 6)
            System.out.println("Reprovado");
        else if (mediafinal == 7) {
            System.out.println("Prova minerva");
        } else {
            System.out.println("Aprovado");
        }
    }
}

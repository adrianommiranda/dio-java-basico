public class SistemaMedida {
    public static void main(String[] args) {
        
        String resp;
        String medida = "Pa";

        switch (medida) {
            case "P":
                resp = "Tamanho pequeno";
                break;
        
            case "M":
                resp = "Tamanho médio";
                break;
        
            case "G":
                resp = "Tamanho grande";
                break;
            
            default:
                resp = "Tamanho inválido";
                break;
        }

        System.out.println(resp);
    }
}

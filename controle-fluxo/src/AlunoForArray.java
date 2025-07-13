public class AlunoForArray {
    public static void main(String[] args) {
        
        String alunos[] ={"marley", "luck", "juju"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }

        for (String lista : alunos) {
            System.out.println("Aluno = " + lista);
        }
    }
}

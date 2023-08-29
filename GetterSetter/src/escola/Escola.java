package escola;


public class Escola {
    public static void main(String[] args) {
        Aluno juan = new Aluno();
        juan.setNome("Juan");
        juan.setIdade(8);


        System.out.println("O aluno " + juan.getNome() + " tem " + juan.getIdade() + " anos ");
    }
}

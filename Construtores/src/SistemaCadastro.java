public class SistemaCadastro {
    public static void main(String[] args) {

        Pessoa juan = new Pessoa("Juan", "123");


        juan.setEndereco("RUA DAS MARIAS");


        System.out.println(juan.getNome() + "-" + juan.getCpf());
    }
}


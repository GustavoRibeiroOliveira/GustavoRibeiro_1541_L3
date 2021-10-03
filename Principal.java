public class Principal {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("nome1",1111111111,5);

        Endereco e = new Endereco("rua1","bairro1",1);
        p.addEndereco(e);

        e = new Endereco("rua2","bairro2",2);
        p.addEndereco(e);

        e = new Endereco("rua3","bairro3",3);
        p.addEndereco(e);

        p.mostraInfo();

    }

}

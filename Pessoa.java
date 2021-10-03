public class Pessoa {

    String nome;
    int cpf;
    Endereco enderecos[] = new Endereco[10];

    public Pessoa(String nome, int cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        Endereco enderecos[] = new Endereco[qtdEnd];
        //eu sei que assim n funciona , mas n sabia como fazer, por isso
        //inicializei com 10.
    }

    public void addEndereco(Endereco end){
        for(int i = 0; i< enderecos.length; i++){
            if(enderecos[i] == null){
                enderecos[i] = end;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        for(int i = 0; i< enderecos.length; i++){
            if(enderecos[i] != null){
                System.out.println("Bairro: "+enderecos[i].bairro);
                System.out.println("Rua: "+enderecos[i].rua);
                System.out.println("Número: "+enderecos[i].num);
            }
        }
    }
}

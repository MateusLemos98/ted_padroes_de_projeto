package ted.pessoaFisica;




public class Pessoa {
    protected String nome;
    protected String dataNascimento;
    protected String endereco;
    protected int cep;
    protected  String telefone;
    protected int DDD;
    public Pessoa() {
    }

    public Pessoa(String nome, String dataNascimento, String endereco, int cep, String telefone, int DDD) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
        this.DDD = DDD;
    }

    public String getNome() {
        System.out.println("Nome do cliente cadastrado: ");
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        System.out.println("Data de nascimento:");
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        System.out.println("Endereço:");
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        System.out.println("Cep:");
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        System.out.println("Telefone para contato:");
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getDDD() {
        System.out.println("DDD:");
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cep=" + cep +
                ", telefone='" + telefone + '\'' +
                ", DDD=" + DDD +
                '}';
    }
}

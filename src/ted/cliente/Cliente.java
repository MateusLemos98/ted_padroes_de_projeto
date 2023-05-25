package ted.cliente;

import ted.pessoaFisica.Pessoa;


public class Cliente extends Pessoa {
     private String codigo;
     private String profissao;

    public Cliente() {
    }

    public Cliente(String nome, String dataNascimento, String endereco, int cep, String telefone, int DDD, String codigo, String profissao) {
        super(nome, dataNascimento, endereco, cep, telefone, DDD);
        this.codigo = codigo;
        this.profissao = profissao;
    }

    public String getCodigo() {
        System.out.println("Código do cliente:");
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfissao() {
        System.out.println("Profissão:");
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo='" + codigo + '\'' +
                ", profissao='" + profissao + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cep=" + cep +
                ", telefone='" + telefone + '\'' +
                ", DDD=" + DDD +
                '}';
    }
}

package ted.funcionario;

import ted.pessoaFisica.Pessoa;

public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;
    private String dataAdmissao;

    private String cargo;

    public Funcionario() {
    }

    public Funcionario(String nome, String dataNascimento, String endereco, int cep, String telefone, int DDD, int matricula, double salario, String dataAdmissao, String cargo) {
        super(nome, dataNascimento, endereco, cep, telefone, DDD);
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }

    public int getMatricula() {
        System.out.println("Matrícula do funcionário:");
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        System.out.println("Sálario:");
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        System.out.println("Data de admissão:");
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        System.out.println("Cargo:");
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", salario=" + salario +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", cargo='" + cargo + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cep=" + cep +
                ", telefone='" + telefone + '\'' +
                ", DDD=" + DDD +
                '}';
    }
}

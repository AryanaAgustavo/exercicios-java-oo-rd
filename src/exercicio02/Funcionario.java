package exercicio02;

public abstract class Funcionario {

    public String nomeFuncionario;
    public double salarioMensal;

    public abstract double salarioAnual(double salarioMensal) {

    }
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}

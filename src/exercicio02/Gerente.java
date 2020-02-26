package exercicio02;

public class Gerente {
    private String nomeFuncionario;
    private double salarioMensal;
    private double bonusAnualVariavel;

    public Gerente(String nomeFuncionario, double salarioMensal, double bonusAnualVariavel) {
        this.nomeFuncionario = nomeFuncionario;
        this.salarioMensal = salarioMensal;
        this.bonusAnualVariavel = bonusAnualVariavel;
    }

    public double salarioAnual(double salarioMensal) {
        return (salarioMensal*13)+(this.bonusAnualVariavel* this.salarioMensal);
    }

    // TODO: implemente o código desta classe


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

    public double getBonusAnualVariavel() {
        return bonusAnualVariavel;
    }

    public void setBonusAnualVariavel(double bonusAnualVariavel) {
        this.bonusAnualVariavel = bonusAnualVariavel;
    }
}

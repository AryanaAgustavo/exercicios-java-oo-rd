package exercicio02;

public class AuxiliarEscritorio extends Funcionario {
    private String nomeFuncionario;
    private double salarioMensal;
    private double bonusAnualFixo;
    // TODO: implemente o código desta classe


    public AuxiliarEscritorio(String nomeFuncionario, double salarioMensal, double bonusAnualFixo) {
        this.nomeFuncionario = nomeFuncionario;
        this.salarioMensal = salarioMensal;
        this.bonusAnualFixo = bonusAnualFixo;
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

    public double getBonusAnualFixo() {
        return bonusAnualFixo;
    }

    public void setBonusAnualFixo(double bonusAnualFixo) {
        this.bonusAnualFixo = bonusAnualFixo;
    }

    public double salarioAnual(double salarioMensal){
        return (salarioMensal*13)+this.bonusAnualFixo;
    }
}

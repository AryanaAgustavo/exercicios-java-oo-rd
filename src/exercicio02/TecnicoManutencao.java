package exercicio02;

public class TecnicoManutencao extends Funcionario {
    private String nomeFuncionario;
    private double salarioMensal;
    private double adicionalInsalubridadeMensal;
    private  double bonusAnualFixo;

    public TecnicoManutencao(String nomeFuncionario, double salarioMensal, double adicionalInsalubridadeMensal, double bonusAnualFixo) {
        this.nomeFuncionario = nomeFuncionario;
        this.salarioMensal = salarioMensal;
        this.adicionalInsalubridadeMensal = adicionalInsalubridadeMensal;
        this.bonusAnualFixo = bonusAnualFixo;
    }

    public double salarioAnual (double salarioMensal) {
        return (salarioMensal*13) + (adicionalInsalubridadeMensal*12) + this.bonusAnualFixo;

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

    public double getAdicionalInsalubridadeMensal() {
        return adicionalInsalubridadeMensal;
    }

    public void setAdicionalInsalubridadeMensal(double adicionalInsalubridadeMensal) {
        this.adicionalInsalubridadeMensal = adicionalInsalubridadeMensal;
    }

    public double getBonusAnualFixo() {
        return bonusAnualFixo;
    }

    public void setBonusAnualFixo(double bonusAnualFixo) {
        this.bonusAnualFixo = bonusAnualFixo;
    }
}

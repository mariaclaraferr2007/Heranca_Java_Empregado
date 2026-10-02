public class Assalariado extends Empregado{
    private double salario;

    public Assalariado(String nome, String sobrenome, String cof, double salario) {
        super(nome, sobrenome, cof);
        this.salario = salario;
    }

    @Override
    public double vencimento() {
        return salario;
    }
}

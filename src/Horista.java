public class Horista extends Empregado{
    private double precoHora;
    private double horasTabalhadas;

    public Horista(String nome, String sobrenome, String cof, double precoHora, double horasTabalhadas) {
        super(nome, sobrenome, cof);
        this.precoHora = precoHora;
        this.horasTabalhadas = horasTabalhadas;
    }

    @Override
    public double vencimento() {
        return precoHora * horasTabalhadas;
    }
}

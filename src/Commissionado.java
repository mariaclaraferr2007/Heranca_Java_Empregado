public class Commissionado extends Empregado{
    private double totalVenda;
    private double taxaComissao;

    public Commissionado(String nome, String sobrenome, String cof, double taxaComissao, double totalVenda) {
        super(nome, sobrenome, cof);
        this.taxaComissao = taxaComissao;
        this.totalVenda = totalVenda;
    }

    @Override
    public double vencimento() {
        return totalVenda * taxaComissao;
    }
}

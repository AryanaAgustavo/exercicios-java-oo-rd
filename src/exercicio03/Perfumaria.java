package exercicio03;

// TODO: implemente o código-fonte de Perfumaria.java
// possuem um preço promocional definido no cadastro e, além disso, dados referentes a qtde e preço do produto na modalidade LMPM (Leve Mais, Pague Menos)


public class Perfumaria extends Produto{
    private String codigoId;
    private String nomeProduto;
    private double preçoVenda;
    private double percentualDescontoSite;
    private double precoPromocional;
    private int quantidade;
    private double precoLMPG;

    public Perfumaria(String codigoId, String nomeProduto, double preçoVenda, double percentualDescontoSite, double precoPromocional, int quantidade, double precoLMPG) {
        this.codigoId = codigoId;
        this.nomeProduto = nomeProduto;
        this.preçoVenda = preçoVenda;
        this.percentualDescontoSite = percentualDescontoSite;
        this.precoPromocional = precoPromocional;
        this.quantidade = quantidade;
        this.precoLMPG = precoLMPG;

    }

    public String getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(String codigoId) {
        this.codigoId = codigoId;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreçoVenda() {
        return preçoVenda;
    }

    public void setPreçoVenda(double preçoVenda) {
        this.preçoVenda = preçoVenda;
    }

    public double getPercentualDescontoSite() {
        return percentualDescontoSite;
    }

    public void setPercentualDescontoSite(double percentualDescontoSite) {
        this.percentualDescontoSite = percentualDescontoSite;
    }

    public double getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(double precoPromocional) {
        this.precoPromocional = precoPromocional;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoLMPG() {
        return precoLMPG;
    }

    public void setPrecoLMPG(double precoLMPG) {
        this.precoLMPG = precoLMPG;
    }
}
package exercicio03;

// TODO: implemente o código-fonte de Produto.java
//Todos os produtos possuem: código ID, nome, preço de venda e percentual de desconto aplicado no site

abstract class Produto {
    private String codigoId;
    private String nomeProduto;
    private double preçoVenda;
    private double percentualDescontoSite;

    public Produto(String codigoId, String nomeProduto, double preçoVenda, double percentualDescontoSite) {
        this.codigoId = codigoId;
        this.nomeProduto = nomeProduto;
        this.preçoVenda = preçoVenda;
        this.percentualDescontoSite = percentualDescontoSite;
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

}

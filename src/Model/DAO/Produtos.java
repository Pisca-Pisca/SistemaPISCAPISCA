/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

public class Produtos {
    
   private int IdProduto = 0;
   private int CodigoProduto = 0;
   private String DescricaoProduto = "";
   private int QtdProduto = 0;
   private double ValorCompra = 0.0;
   private double ValorVenda = 0.0;
   private String NotaFiscal = "";
   private int Serie = 0;
   private byte[] Url_Img = new byte[5];
   private int IdCategoria = 1;
   private int IdFornecedor = 1;

   
   // GETTERS E SETTERS
    public int getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }

    public int getCodigoProduto() {
        return CodigoProduto;
    }

    public void setCodigoProduto(int CodigoProduto) {
        this.CodigoProduto = CodigoProduto;
    }

    public String getNomeProduto() {
        return DescricaoProduto;
    }

    public void setNomeProduto(String DescricaoProduto) {
        this.DescricaoProduto = DescricaoProduto;
    }

    public int getQtdProduto() {
        return QtdProduto;
    }

    public void setQtdProduto(int QtdProduto) {
        this.QtdProduto = QtdProduto;
    }

    public double getValorCompra() {
        return ValorCompra;
    }

    public void setValorCompra(double ValorCompra) {
        this.ValorCompra = ValorCompra;
    }

    public double getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(double ValorVenda) {
        this.ValorVenda = ValorVenda;
    }

    public String getNotaFiscal() {
        return NotaFiscal;
    }

    public void setNotaFiscal(String NotaFiscal) {
        this.NotaFiscal = NotaFiscal;
    }

    public int getSerie() {
        return Serie;
    }

    public void setSerie(int Serie) {
        this.Serie = Serie;
    }

    public byte[] getUrl_Img() {
        return Url_Img;
    }

    public void setUrl_Img(byte[] Url_Img) {
        this.Url_Img = Url_Img;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public int getIdFornecedor() {
        return IdFornecedor;
    }

    public void setIdFornecedor(int IdFornecedor) {
        this.IdFornecedor = IdFornecedor;
    }   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

/**
 *
 * @author lucve
 */
public class Produtos {
    
   private int IdProduto;
   private int CodigoProduto;
   private String NomeProduto = "";
   private int QtdProduto;
   private double ValorCompra;
   private double ValorVenda;
   private String NotaFiscal = "";
   private int Serie;
   private String Url_Img = "";
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
        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
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

    public String getUrl_Img() {
        return Url_Img;
    }

    public void setUrl_Img(String Url_Img) {
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

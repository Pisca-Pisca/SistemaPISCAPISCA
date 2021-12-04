/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

/**
 *
 * @author nicol
 */
public class Carrinho {

    private int idVendaCarrinho;
    private int FormaPagamento;
    private int codigoCompra;
    private int clienteId;
    private int funcionarioId;
    private int qtdItens;

    public int getIdVendaCarrinho() {
        return idVendaCarrinho;
    }

    public void setIdVendaCarrinho(int idVendaCarrinho) {
        this.idVendaCarrinho = idVendaCarrinho;
    }
    
    public int getFormaPagamento() {
        return FormaPagamento;
    }

    public void setFormaPagamento(int FormaPagamento) {
        this.FormaPagamento = FormaPagamento;
    }

    public int getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    private float valorTotal;

}

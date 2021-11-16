/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFac;
import Model.DAO.Produtos;
import UI_SistemaInterno.UI_Modal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lucve
 */
public class ProdutosDAO {

    public void Create(Produtos P) {

        Connection con = ConnectionFac.getConnecton();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produtos (CodigoProduto, DescricaoProduto, QtdProduto, ValorCompra, voltagem ,ValorVenda, NotaFiscal, Serie, Url_Img, idCategoria, idFornecedor) VALUES(?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setInt(1, P.getCodigoProduto());

            stmt.setString(2, P.getNomeProduto());

            stmt.setInt(3, P.getQtdProduto());

            stmt.setDouble(4, P.getValorCompra());
            
            stmt.setInt(5, P.getVoltagem());

            stmt.setDouble(6, P.getValorVenda());

            stmt.setString(7, P.getNotaFiscal());

            stmt.setInt(8, P.getSerie());

            stmt.setBytes(9, P.getUrl_Img());

            stmt.setInt(10, P.getIdCategoria());

            stmt.setInt(11, P.getIdFornecedor());

            stmt.executeUpdate();

            //JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
            
            UI_Modal dialog = new UI_Modal(new javax.swing.JFrame(), true);
            dialog.enviaDados("Cadastro de Produto", "Salvo com Sucesso!");
            dialog.setVisible(true);

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir valores na tabela Produtos", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt);
        }

    }

    public List<Produtos> Read() {
        Connection con = ConnectionFac.getConnecton();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produtos> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Produtos");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Produtos produto = new Produtos();

                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setCodigoProduto(rs.getInt("CodigoProduto"));
                produto.setNomeProduto(rs.getString("DescricaoProduto"));
                produto.setQtdProduto(rs.getInt("QtdProduto"));
                produto.setValorCompra(rs.getDouble("ValorCompra"));
                produto.setVoltagem(rs.getInt("voltagem"));
                produto.setValorVenda(rs.getDouble("ValorVenda"));
                produto.setNotaFiscal(rs.getString("NotaFiscal"));
                produto.setSerie(rs.getInt("Serie"));
                produto.setUrl_Img(rs.getBytes("Url_Img"));
                produto.setIdCategoria(rs.getInt("idCategoria"));
                produto.setIdFornecedor(rs.getInt("idFornecedor"));

                produtos.add(produto);

            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao ler os valores da tabela Produtos", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt, rs);
        }

        return produtos;
    }

    public List<Produtos> ReadByName(String Nome) {
        Connection con = ConnectionFac.getConnecton();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produtos> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Produtos WHERE DescricaoProduto like ?");
            stmt.setString(1, "%" + Nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produtos produto = new Produtos();

                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setCodigoProduto(rs.getInt("CodigoProduto"));
                produto.setNomeProduto(rs.getString("DescricaoProduto"));
                produto.setQtdProduto(rs.getInt("QtdProduto"));
                produto.setValorCompra(rs.getDouble("ValorCompra"));
                produto.setVoltagem(rs.getInt("voltagem"));
                produto.setValorVenda(rs.getDouble("ValorVenda"));
                produto.setNotaFiscal(rs.getString("NotaFiscal"));
                produto.setSerie(rs.getInt("Serie"));
                produto.setUrl_Img(rs.getBytes("Url_Img"));
                produto.setIdCategoria(rs.getInt("idCategoria"));
                produto.setIdFornecedor(rs.getInt("idFornecedor"));

                produtos.add(produto);

            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao ler os valores da tabela Produtos - Filtro de Nome", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt, rs);
        }

        return produtos;
    }

    public void Update(Produtos P) {

        Connection con = ConnectionFac.getConnecton();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE Produtos SET CodigoProduto = ?, DescricaoProduto = ?, QtdProduto = ?, ValorCompra = ?, ValorVenda = ?, Serie = ?, NotaFiscal = ?, Url_Img = ?, idFornecedor = ?, idCategoria = ?, voltagem = ? WHERE idProduto = ?");

            stmt.setString(2, P.getNomeProduto());
            stmt.setInt(1, P.getCodigoProduto());
            stmt.setInt(3, P.getQtdProduto());
            stmt.setDouble(4, P.getValorCompra());
            stmt.setDouble(5, P.getValorVenda());
            stmt.setInt(6, P.getSerie());
            stmt.setString(7, P.getNotaFiscal());
            stmt.setBytes(8, P.getUrl_Img());
            stmt.setInt(9, P.getIdCategoria());
            stmt.setInt(10, P.getIdFornecedor());
            stmt.setInt(11,P.getVoltagem());
            stmt.setInt(12, P.getIdProduto());

            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar valores na tabela Produtos", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt);
        }

    }

    public void Delete(Produtos P) {

        Connection con = ConnectionFac.getConnecton();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM Produtos WHERE idProduto = ?");

            stmt.setInt(1, P.getIdProduto());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com Sucesso");
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao excluir valores na tabela Produtos", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt);
        }

    }

}

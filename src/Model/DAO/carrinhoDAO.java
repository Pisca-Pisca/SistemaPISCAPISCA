package Model.DAO;

import Connection.ConnectionFac;
import UI_SistemaInterno.UI_Modal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nicol
 */
public class carrinhoDAO {

    public void Create(Carrinho f) {

        Connection con = ConnectionFac.getConnecton();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO VendaCarrinho (idVendaCarrinho,  codCompra, Clientes, Funcionarios, FormaPagamento, ValorTotal , QtdeItens) VALUES(?,?,?,?,?,?,?)");

            stmt.setInt(1, f.getIdVendaCarrinho());

            stmt.setInt(2, f.getCodigoCompra());

            stmt.setInt(3, f.getClienteId());

            stmt.setInt(4, f.getFuncionarioId());

            stmt.setInt(5, f.getFormaPagamento());

            stmt.setDouble(6, f.getValorTotal());

            stmt.setInt(7, f.getQtdItens());

            stmt.executeUpdate();

            //JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
            UI_Modal dialog = new UI_Modal(new javax.swing.JFrame(), true);
            dialog.enviaDados("Carrinho", "Carrinho gerado com sucesso!");
            dialog.setVisible(true);

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir valores na tabela VendaCarrinho", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt);
        }

    }

    public List<Carrinho> Read() {
        Connection con = ConnectionFac.getConnecton();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Carrinho> carrinhos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM VendaCarrinho");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Carrinho carrinho = new Carrinho();

                carrinho.setClienteId(rs.getInt("Clientes"));
                carrinho.setFuncionarioId(rs.getInt("Funcionarios"));
                carrinho.setFormaPagamento(rs.getInt("FormaPagamento"));
                carrinho.setValorTotal(rs.getFloat("ValorTotal"));
                carrinho.setQtdItens(rs.getInt("QtdeItens"));
                carrinho.setIdVendaCarrinho(rs.getInt("idVendaCarrinho"));
                carrinho.setCodigoCompra(rs.getInt("codCompra"));

                carrinhos.add(carrinho);

            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao ler os valores da tabela VendaCarrinho", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt, rs);
        }

        return carrinhos;
    }

    public List<Carrinho> ReadByCod(int cod) {
        Connection con = ConnectionFac.getConnecton();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Carrinho> carrinhos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM VendaCarrinho WHERE codCompra = ?");
            stmt.setString(1, "%" + cod + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Carrinho carrinho = new Carrinho();

                carrinho.setClienteId(rs.getInt("Clientes"));
                carrinho.setFuncionarioId(rs.getInt("Funcionarios"));
                carrinho.setFormaPagamento(rs.getInt("FormaPagamento"));
                carrinho.setValorTotal(rs.getFloat("ValorTotal"));
                carrinho.setQtdItens(rs.getInt("QtdeItens"));
                carrinho.setIdVendaCarrinho(rs.getInt("idVendaCarrinho"));
                carrinho.setCodigoCompra(rs.getInt("codCompra"));

                carrinhos.add(carrinho);

            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao ler os valores da tabela VendaCarrinho - Filtro de codCompra", ex);
        } finally {
            ConnectionFac.closeConnection(con, stmt, rs);
        }

        return carrinhos;
    }
}

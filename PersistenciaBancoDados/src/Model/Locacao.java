package Model;

import Factory.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Locacao {
    private int id;
    private int id_quarto;
    private int id_pessoa;
    private LocalDateTime data_entrada;
    private LocalDateTime data_saida;

    public Locacao() {
        this.id_quarto = 0;
        this.id_pessoa = 0;
        this.data_entrada = null;
        this.data_saida = null;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_quarto() {
        return this.id_quarto;
    }

    public void setId_quarto(int id_quarto) {
        this.id_quarto = id_quarto;
    }

    public int getId_pessoa() {
        return this.id_quarto;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public LocalDateTime getData_entrada() {
        return this.data_entrada;
    }

    public void setData_entrada(LocalDateTime data_entrada) {
        this.data_entrada = data_entrada;
    }

    public LocalDateTime getData_saida() {
        return this.data_saida;
    }

    public void setData_saida(LocalDateTime data_saida) {
        this.data_saida = data_saida;
    }

    // To String
    public String toString() {
        return "Id: " +this.id+ " | Id Quarto: " +this.id_quarto+ " | Id Pessoa: " +this.id_pessoa+ " | Data Entrada: "
                +this.data_entrada.toString()+  " | Data Saída : " + this.data_saida.toString();
    }

    // CREATE
    public String createLocacaoDB() {
        ConnectionFactory cf = new ConnectionFactory();
        try {
            Statement stmt = cf.conectar().createStatement();
            stmt.execute("INSERT INTO locacao (id_quarto, id_pessoa, data_entrada, data_saida) VALUES " +
                    "("+id_quarto+", "+id_pessoa+", '"+data_entrada.toString()+"', '"+data_saida.toString()+"')");
            cf.desconectar();

            return "Inserção bem-sucedida";
        } catch (SQLException e) {
            return "Erro ao inserir registro! " + e.getMessage();
        }
    }

    // READ
    public ArrayList<Locacao> listaLocacaoDB() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ArrayList<Locacao> listaLocacao = new ArrayList<>();
        ConnectionFactory cf = new ConnectionFactory();
        try {
            Statement stmt = cf.conectar().createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM locacao ORDER BY id");
            cf.desconectar();

                while(result.next()) {
                    Locacao locacao = new Locacao();
                    locacao.setId(result.getInt("id"));
                    locacao.setId_quarto(result.getInt("id_quarto"));
                    locacao.setId_pessoa(result.getInt("id_pessoa"));
                    locacao.setData_entrada(LocalDateTime.parse(result.getString("data_entrada"), formatter));
                    locacao.setData_saida(LocalDateTime.parse(result.getString("data_saida"), formatter));
                    listaLocacao.add(locacao);
                }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar no banco de dados. \nErro: " +
                    e.getMessage());
        }
        return listaLocacao;
    }

    // UPDATE
    public String updateLocacaoDB() {
        ConnectionFactory cf = new ConnectionFactory();
        try {
            Statement stmt = cf.conectar().createStatement();
            stmt.execute("UPDATE locacao SET id_quarto = " +id_quarto+ ", id_pessoa = "+
                            id_pessoa+", data_entrada = '"+data_entrada.toString()+"', data_saida = '"+data_saida.toString()+"' " +
                    "WHERE id = "+id);
            cf.desconectar();

            return "Atualização bem-sucedida";
        } catch (SQLException e) {
            return "Erro ao atualizar o registro " + e.getMessage();
        }
    }

    // DELETE
    public String deleteLocacaoDB(int id) {
        ConnectionFactory cf = new ConnectionFactory();

        try {
            Statement stmt = cf.conectar().createStatement();
            stmt.execute("DELETE FROM locacao WHERE id = "+ id);
            cf.desconectar();
            return "Exclusão bem-sucedida";
        } catch (SQLException e) {
            return "Erro ao excluir o registro " + e.getMessage();
        }
    }
}
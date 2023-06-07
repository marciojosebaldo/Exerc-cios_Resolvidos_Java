package Model;

import Factory.ConnectionFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Quarto {

    private int id;
    private int pousada_id;
    private String nome;

    public Quarto() {
        this.id = 0;
        this.pousada_id = 0;
        this.nome = "";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPousada_id() {
        return this.pousada_id;
    }

    public void setPousada_id(int pousada_id) {
        this.pousada_id = pousada_id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "ID: " + this.id + " | ID da Pousada: " + this.pousada_id + " | Nome do Quarto: " + this.nome;
    }

    // CREATE
    public String createQuartoDB(Quarto quarto) {
        ConnectionFactory cf = new ConnectionFactory();
        try{
            Statement stmt = cf.conectar().createStatement();
            stmt.execute("INSERT INTO quarto (pousada_id, nome) VALUES ("+quarto.getId()+", '"+quarto.getNome()+"')");
            cf.desconectar();
            return "Inserção bem-sucedida";
        }catch (SQLException e) {
            return "Erro ao inserir registro!" + e.getMessage();
        }
    }

    // READ
    public ArrayList<Quarto> listaQuartoDB() {
        ArrayList<Quarto> listaQuarto = new ArrayList<>();
        ConnectionFactory cf = new ConnectionFactory();
        try {
            Statement stmt = cf.conectar().createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM quarto ORDER BY nome");
            cf.desconectar();

            while (result.next()){
                Quarto quarto = new Quarto();
                quarto.setId(result.getInt("id"));
                quarto.setPousada_id(result.getInt("pousada_id"));
                quarto.setNome(result.getString("nome"));
                listaQuarto.add(quarto);
            }

        } catch (SQLException e) {
            e.getMessage();
        }
        return listaQuarto;
    }

    // UPDATE
    public String updateQuartoDB(int id, int pousada_id, String nome) {
        ConnectionFactory cf = new ConnectionFactory();
        try {
            Statement stmt = cf.conectar().createStatement();
            stmt.execute("UPDATE quarto SET nome = '"+this.getNome()+"', pousada_id = "+pousada_id + "WHERE id = "+this.getId());
            cf.desconectar();
            return "Atualização bem-sucedida";
        } catch (SQLException e) {
            return "Erro ao atualizar os dados " + e.getMessage();
        }
    }

    // DELETE
    public String deleteQuartoDB(int id) {
        ConnectionFactory cf = new ConnectionFactory();
        try {
            Statement stmt = cf.conectar().createStatement();
            stmt.execute("DELETE FROM quarto WHERE id = "+id);
            cf.desconectar();
            return "Exclusão bem-sucedida";
        } catch (SQLException e) {
            return "Erro ao excluir o registro" + e.getMessage();
        }
    }
}
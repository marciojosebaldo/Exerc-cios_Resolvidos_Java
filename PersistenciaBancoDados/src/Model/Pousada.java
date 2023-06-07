package Model;

import Factory.ConnectionFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Pousada {

    // Atributos da Classe
    private int id;
    private String nome;

    // Construtor da Classe
    public Pousada() {
        this.id = 0;
        this.nome = nome;
    }

    // Métodos Acessores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Id: " + this.id + " | Nome: " + this.nome;
    }

    //CREATE
    public String createPousadaDB(Pousada pousada) {
        ConnectionFactory cf = new ConnectionFactory();
        try {
            Statement stmt = cf.conectar().createStatement();
            stmt.execute("INSERT INTO pousada (nome) VALUES ('"+this.nome+"')");
            cf.desconectar();
            return "Inserção bem-sucedida";
        } catch (SQLException e) {
            return "Erro ao inserir registro" + e.getMessage();
        }
    }

    //READ
    public ArrayList<Pousada> listaPousadaDB() {
        ArrayList<Pousada> listaPousada = new ArrayList<>();
        ConnectionFactory cf = new ConnectionFactory();
        try {
            Statement stmt = cf.conectar().createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM pousada ORDER BY nome");
            cf.desconectar();

            while (result.next()) {
                Pousada pousada = new Pousada();
                pousada.setId(result.getInt("id"));
                pousada.setNome(result.getString("nome"));
                listaPousada.add(pousada);
            }

        } catch(SQLException e) {
            System.out.println("Erro ao conectar no banco de dados. \nErro: " +
                    e.getMessage());
        }
        return listaPousada;
    }

    //UPDATE
    public String updatePousadaDB(int id, String nome) {
        ConnectionFactory cf = new ConnectionFactory();
        try{
            Statement stmt = cf.conectar().createStatement();
            stmt.execute("UPDATE pousada SET nome = '"+nome+"' WHERE id = "+id);
            cf.desconectar();
            return "Atualização bem-sucedida";
        }catch (SQLException e){
            return "Erro ao atualizar o registro" + e.getMessage();
        }
    }

    //DELETE
    public String deletePousadaDB(int id){
        ConnectionFactory cf = new ConnectionFactory();
        try{
            Statement stmt = cf.conectar().createStatement();
            stmt.execute("DELETE FROM pousada WHERE id = "+id);
            cf.desconectar();
            return "Exclusão bem-sucedida";
        }catch(SQLException e) {
            return "Erro ao deletar o dado" + e.getMessage();
        }
    }

}
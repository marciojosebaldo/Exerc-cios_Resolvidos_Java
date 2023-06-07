package Model;

import Factory.ConnectionFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class Pessoa {
    private int id;
    private String nome;
    private LocalDate data_nascimento;

    public Pessoa() {
        this.id = 0;
        this.nome = "";
        this.data_nascimento = LocalDate.now();
    }

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

    public LocalDate getData_nascimento() {
        return this.data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String toString() {
        return "Id: " + this.id + " | Nome: " + this.nome + " | Data Nascimento: "
                + this.data_nascimento;
    }

    // CREATE
    // Este método criou como parâmetro a variável pessoa do tipo Pessoa apenas para exemplo
    // O melhor é utilizar o atributo direto com a sobrecarga this
    public String createPessoaDB(Pessoa pessoa) {
        ConnectionFactory cf = new ConnectionFactory();
        try {
            Statement stmt = cf.conectar().createStatement();
            stmt.execute("insert into pessoa (nome, data_nascimento) " +
                    "values ('"+pessoa.getNome()+"','"
                    +pessoa.getData_nascimento().toString()+"')");
            cf.desconectar();
            return "Inserção bem-sucedida";
        }catch (SQLException e) {
            return "Erro ao inserir registro! " + e.getMessage();
        }
    }

    // READ
    public ArrayList<Pessoa> listaPessoaDB() {
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        ConnectionFactory cf = new ConnectionFactory();
        try {
            Statement stmt = cf.conectar().createStatement();
            ResultSet result = stmt.executeQuery("Select * from pessoa order by nome");
            cf.desconectar();

            while (result.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(result.getInt("id"));
                pessoa.setNome(result.getString("nome"));
                pessoa.setData_nascimento(LocalDate.parse(result.getString("Data_nascimento")));
                listaPessoas.add(pessoa);
            }
        } catch(SQLException e) {
            System.out.println("Erro ao conectar o banco de dados. \nErro: " +
                    e.getMessage());
        }
        return listaPessoas;
    }

    // UPDATE
    public String updatePessoaDB(int id, String nome, String dataNascimento) {
        ConnectionFactory cf = new ConnectionFactory();
        try {
            Statement stmt = cf.conectar().createStatement();
            stmt.execute("UPDATE pessoa SET nome = '" + this.nome +"', data_nascimento = '"+this.data_nascimento+
                            "' WHERE id = " +this.id);
            cf.desconectar();
            return "Atualização bem-sucedida";
        }catch (SQLException e) {
            return "Erro ao atualizar o registro " + e.getMessage();
        }
    }

    // DELETE
    public String deletePessoaDB(int id) {
        ConnectionFactory cf = new ConnectionFactory();
        try {
            Statement stmt = cf.conectar().createStatement();
            stmt.execute("DELETE FROM pessoa WHERE id = " + id);
            cf.desconectar();
            return "Exclusão bem-sucedida";
        }catch (SQLException e) {
            return "Erro ao excluir o registro" + e.getMessage();
        }
    }
}
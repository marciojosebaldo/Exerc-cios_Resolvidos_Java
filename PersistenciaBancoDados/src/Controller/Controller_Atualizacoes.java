package Controller;

import Model.Locacao;
import Model.Pessoa;
import Model.Pousada;
import Model.Quarto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Controller_Atualizacoes {
    public Controller_Atualizacoes() {
    }

    public String updatePessoa(int id, String nome, String dataNascimento) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(id);
        pessoa.setNome(nome);
        pessoa.setData_nascimento(LocalDate.parse(dataNascimento));
        return pessoa.updatePessoaDB(id, nome, dataNascimento);
    }

    public String updatePousadaDB(int id, String nome) {
        Pousada pousada = new Pousada();
        pousada.setId(id);
        pousada.setNome(nome);
        return pousada.updatePousadaDB(id, nome);
    }

    public String updateQuartoDB(int id, int pousada_id, String nome) {
        Quarto quarto = new Quarto();
        quarto.setId(id);
        quarto.setPousada_id(pousada_id);
        quarto.setNome(nome);
        return quarto.updateQuartoDB(id, pousada_id, nome);
    }

    public String updateLocacaoDB(int id, int id_quarto, int id_pessoa, String data_entrada, String data_saida) {
        Locacao locacao = new Locacao();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        locacao.setId(id);
        locacao.setId_quarto(id_quarto);
        locacao.setId_pessoa(id_pessoa);
        locacao.setData_entrada(LocalDateTime.parse(data_entrada, formatter));
        locacao.setData_saida(LocalDateTime.parse(data_saida, formatter));
        return locacao.updateLocacaoDB();
    }
}
package Controller;

import Model.Locacao;
import Model.Pessoa;
import Model.Pousada;
import Model.Quarto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Controller_Cadastros {

    public Controller_Cadastros() {

    }
        public String createPessoaDB(String nome, String dataNascimento) {
            Pessoa pessoa = new Pessoa();
            if(nome == null || nome == "" || dataNascimento == null || dataNascimento == "") {
                return "Nome e Data de Nascimento devem ser preenchidos";
            }
            pessoa.setNome(nome);
            pessoa.setData_nascimento(LocalDate.parse(dataNascimento));
            return pessoa.createPessoaDB(pessoa);
        }

        public String createPousadaDB(String nome) {
            Pousada pousada = new Pousada();
            if(nome == null || nome == "") {
                return "Nome deve ser preenchido";
            }
            pousada.setNome(nome);
            return pousada.createPousadaDB(pousada);
        }

        public String createQuartoDB(String nome, int pousada_id) {
            Quarto quarto = new Quarto();
            if (nome == null || nome == "" || pousada_id == 0) {
                return "Nome e Pousada_id precisam ser preenchidos";
            }
            quarto.setId(pousada_id);
            quarto.setNome(nome);
            return quarto.createQuartoDB(quarto);
        }

        public String createLocacaoDB(int id_quarto, int id_pessoa, String data_entrada, String data_saida) {
            Locacao locacao = new Locacao();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            if (data_entrada == null  || data_saida == null) {
                return "Todas as informações devem ser preenchidas";
            }

            locacao.setId_quarto(id_quarto);
            locacao.setId_pessoa(id_pessoa);
            locacao.setData_entrada(LocalDateTime.parse(data_entrada, formatter));
            locacao.setData_saida(LocalDateTime.parse(data_saida, formatter));
            return locacao.createLocacaoDB();
        }
}
package Controller;

import Model.Pessoa;
import Model.Pousada;
import Model.Quarto;
import Model.Locacao;

public class Controller_Exclusao {
    public Controller_Exclusao() {
    }
        public String deletePessoa(int id){
            return new Pessoa().deletePessoaDB(id);
        }

        public String deletePousada(int id) {
            return new Pousada().deletePousadaDB(id);
        }

        public String deleteQuarto(int id) {
            return new Quarto().deleteQuartoDB(id);
        }

        public String deleteLocacaoDB(int id) {
            return new Locacao().deleteLocacaoDB(id);
        }
}
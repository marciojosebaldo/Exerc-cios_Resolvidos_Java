package Controller;

import Model.Pessoa;
import Model.Pousada;
import Model.Quarto;
import Model.Locacao;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller_Listas {

    public Controller_Listas() {
    }

    public ArrayList<String> listaPessoaDB() {
        ArrayList<String> listaPessoasTexto = new ArrayList<String>();
        for (Pessoa pessoa : new Pessoa().listaPessoaDB()) {
            listaPessoasTexto.add(pessoa.toString());
        }
        return listaPessoasTexto;
    }

    public ArrayList<String> listaPousadaDB() {
        ArrayList<String> listaPousadasTexto = new ArrayList<String>();
        for (Pousada pousada : new Pousada().listaPousadaDB()) {
            listaPousadasTexto.add(pousada.toString());
        }
        return listaPousadasTexto;
    }

    public ArrayList<String> listaQuartoDB() {
        ArrayList<String> listaQuartoTexto = new ArrayList<String>();
        for (Quarto quarto : new Quarto().listaQuartoDB()) {
            listaQuartoTexto.add(quarto.toString());
        }
        return listaQuartoTexto;
    }

    public ArrayList<String> listaLocacaoDB() {
        ArrayList<String> listaLocacaoTexto = new ArrayList<>();
        for (Locacao locacao : new Locacao().listaLocacaoDB()) {
            listaLocacaoTexto.add(locacao.toString());
        }
        return listaLocacaoTexto;
    }
}
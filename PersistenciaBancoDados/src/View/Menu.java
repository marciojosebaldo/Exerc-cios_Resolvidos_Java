package View;

import Controller.Controller_Atualizacoes;
import Controller.Controller_Cadastros;
import Controller.Controller_Exclusao;
import Controller.Controller_Listas;
import Model.Pessoa;

import java.util.Scanner;

public class Menu {
    Scanner sc;
    Pessoa pessoa;

    public Menu() {
        sc = new Scanner(System.in);
    }
    public void mostrarMenu() {
        int opcao;
        do {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Ver Lista");
            System.out.println("3 - Atualiazar Cadastro");
            System.out.println("4 - Excluir Cadastro");
            System.out.println("0 - Encerrar Aplicação");
            System.out.printf("Selecione uma Opção: ");
            opcao = sc.nextInt();
            if (opcao >= 1 && opcao <= 4) {
                mostrarSubMenu(opcao);
            } else if(opcao != 0) {
                System.out.println("Opção inválida, por favor, selecione uma das" +
                        "opções abaixo:");
                }
        } while(opcao != 0);
    }

    public void mostrarSubMenuGeral(String menu) {
        System.out.println();
        System.out.println(menu);
        System.out.println("1 - Locação");
        System.out.println("2 - Pessoa");
        System.out.println("3 - Pousada");
        System.out.println("4 - Quarto");
        System.out.println("0 - Voltar ao Menu Anterior");
        System.out.println("Selecione uma Opção: ");
    }

    public void mostrarSubMenuListas(String menu) {
        System.out.println();
        System.out.println(menu);
        System.out.println("1 - Locações");
        System.out.println("2 - Pessoas");
        System.out.println("3 - Pousadas");
        System.out.println("4 - Quartos");
        System.out.println("0 - Voltar ao Menu Anterior");
        System.out.println("Selecione uma Opção: ");
    }

    public void mostrarSubMenu(int opcao) {
        int subOpcao = - 1;
        Controller_Atualizacoes ca = new Controller_Atualizacoes();
        Controller_Cadastros cc = new Controller_Cadastros();
        Controller_Listas cl = new Controller_Listas();
        Controller_Exclusao ce = new Controller_Exclusao();
        do{
            switch(opcao) {
                case 1:
                    System.out.println();
                    mostrarSubMenuGeral("Cadastrar");
                    subOpcao = sc.nextInt();
                    if(subOpcao == 1) {
                        System.out.println();
                        System.out.println("Informe a Id do Quarto: ");
                        int id_quarto = sc.nextInt();
                        System.out.println("Informe a Id da Pessoa: ");
                        int id_pessoa = sc.nextInt();
                        System.out.println("Informe a Data de Entrada (YYYY-MM-DD HH:mm): ");
                        sc.nextLine();
                        String data_entrada = sc.nextLine();
                        System.out.println("Informe a Data de Saída (YYYY-MM-DD HH:mm): ");
                        String data_saida = sc.nextLine();
                        System.out.println(cc.createLocacaoDB(id_quarto, id_pessoa, data_entrada, data_saida));

                    }else if(subOpcao == 2) {
                        System.out.println();
                        System.out.println("Informe o Nome da Pessoa: ");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.println("Informe a Data de Nascimento: (YYYY-MM-DD): ");
                        String data_nascimento = sc.nextLine();
                        System.out.println(cc.createPessoaDB(nome, data_nascimento));

                    }else if(subOpcao == 3) {
                        System.out.println();
                        System.out.println("Informe o Nome da Pousada: ");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.println(cc.createPousadaDB(nome));

                    }else if (subOpcao == 4) {
                        System.out.println();
                        System.out.println("Informe o Nome do Quarto: ");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.println("Informe a ID da Pousada que pertence o Quarto: ");
                        int pousada_id = sc.nextInt();
                        System.out.println(cc.createQuartoDB(nome, pousada_id));
                    }
                    break;

                case 2:
                    System.out.println();
                    mostrarSubMenuListas("Listar");
                    subOpcao = sc.nextInt();
                    if(subOpcao == 1) {
                        System.out.println();
                        System.out.println("Lista de Locações existentes: ");
                        for (String locacao : cl.listaLocacaoDB()) {
                            System.out.println(locacao);
                        }
                        System.out.println("Pressione qualquer tecla para voltar ao menu anterior: ");
                        sc.next();
                        cl.listaLocacaoDB();

                    } else if(subOpcao == 2) {
                        System.out.println();
                        System.out.println("Lista de Clientes existentes: ");
                        for (String pessoa : cl.listaPessoaDB()) {
                            System.out.println(pessoa);
                        }
                        System.out.println("Pressione qualquer tecla para voltar ao menu anterior: ");
                        sc.next();
                        cl.listaPessoaDB();

                    } else if(subOpcao == 3) {
                        System.out.println();
                        System.out.println("Lista de Pousadas existentes: ");
                        for (String pousada : cl.listaPousadaDB()) {
                            System.out.println(pousada);
                        }
                        System.out.println("Pressione qualquer tecla para voltar ao menu anterior: ");
                        sc.next();
                        cl.listaPousadaDB();

                    } else if(subOpcao == 4) {
                        System.out.println();
                        System.out.println("Lista de Quartos existentes: ");
                        for (String quarto : cl.listaQuartoDB()) {
                            System.out.println(quarto);
                        }
                        System.out.println("Pressione qualquer tecla para voltar ao menu anterior: ");
                        sc.next();
                        cl.listaQuartoDB();
                    }

                    break;
                case 3:
                    System.out.println();
                    mostrarSubMenuGeral("Atualizar");
                    subOpcao = sc.nextInt();
                    if(subOpcao == 1) {
                        System.out.println();
                        System.out.println("Informe a Id da Locação que deseja atualizar: ");
                        int id = sc.nextInt();
                        System.out.println("Informe a Id do Quarto: ");
                        int id_quarto = sc.nextInt();
                        System.out.println("Informe a Id da Pessoa: ");
                        int id_pessoa = sc.nextInt();
                        System.out.println("Informe a Data de Entrada: (YYYY-MM-DD HH:mm): ");
                        sc.nextLine();
                        String data_entrada = sc.nextLine();
                        System.out.println("Informe a Data de Saída: (YYYY-MM-DD HH:mm): ");
                        String data_saida = sc.nextLine();
                        System.out.println(ca.updateLocacaoDB(id, id_quarto, id_pessoa, data_entrada, data_saida));

                    } else if(subOpcao == 2) {
                        System.out.println();
                        System.out.println("Informe a Id da Pessoa que deseja atualizar: ");
                        int id = sc.nextInt();
                        System.out.println("Informe o Nome da Pessoa: ");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.println("Informe a Data de Nascimento (Padrão ISO 8601 -> YYYY-MM-DD): ");
                        String dataNascimento = sc.nextLine();
                        System.out.println(ca.updatePessoa(id, nome, dataNascimento));

                    } else if(subOpcao == 3) {
                        System.out.println();
                        System.out.println("Informe a ID da Pousada que deseja atualizar: ");
                        int id = sc.nextInt();
                        System.out.println("Informe o Nome da Pousada: ");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.println(ca.updatePousadaDB(id, nome));

                    } else if(subOpcao == 4) {
                        System.out.println();
                        System.out.println("Informe a Id do Quarto que deseja atualizar: ");
                        int id = sc.nextInt();
                        System.out.println("Informe a Id da Pousada: ");
                        int pousada_id = sc.nextInt();
                        System.out.println("Informe o Nome da Pousada: ");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.println(ca.updateQuartoDB(id, pousada_id, nome));
                    }
                    break;

                case 4:
                    System.out.println();
                    mostrarSubMenuGeral("Excluir");
                    subOpcao = sc.nextInt();
                    if(subOpcao == 1) {
                        System.out.println();
                        System.out.println("Informe a ID da Locação que deseja excluir: ");
                        int id = sc.nextInt();
                        System.out.println(ce.deleteLocacaoDB(id));
                    } else if(subOpcao == 2) {
                        System.out.println();
                        System.out.println("Informe a ID da Pessoa que deseja excluir: ");
                        int id = sc.nextInt();
                        System.out.println(ce.deletePessoa(id));
                    } else if(subOpcao == 3) {
                        System.out.println();
                        System.out.println("Informe a ID da Pousada que deseja excluir: ");
                        int id = sc.nextInt();
                        System.out.println(ce.deletePousada(id));
                    } else if(subOpcao == 4) {
                        System.out.println();
                        System.out.println("Informe a ID do Quarto que deseja excluir: ");
                        int id = sc.nextInt();
                        System.out.println(ce.deleteQuarto(id));
                    }
                    break;
            }

            if(subOpcao < 0 || subOpcao > 4) {
                System.out.println("Opção inválida. Por favor, selecione uma das opções");
            }
        } while(subOpcao != 0);
    }
}
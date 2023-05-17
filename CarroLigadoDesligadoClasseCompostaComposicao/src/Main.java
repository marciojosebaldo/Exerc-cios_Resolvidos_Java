/*
Composição:
Exercício para prática de classe composta e classe componente
A primeira tentativa foi possível porque foi criado outro método, além dos métodos acessores,
para buscar o parâmetro na Classe componente Motor
A segunda tentativa foi criada uma variável booleana e invocado a classe Carro e, consequentemente,
o parâmetro do tipo Motor motor e seu parâmetro Ligado
 */

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.acelerar();

        System.out.println("Primeira tentativa");
        if (carro.getSituacaoMotor() == true) {
            System.out.println("O carro está ligado");
        }
        else {
            System.out.println("O carro está desligado");
        }

        System.out.println("Segunda tentativa");
        boolean motorLigado = carro.getMotor().getLigado();

        if (motorLigado == true) {
            System.out.println("O carro está ligado");
        }
        else {
            System.out.println("O carro está desligado");
        }
    }
}
public class Carro {

    private Motor motor;
    private Pneu pneuDianteiro;
    private Pneu pneuTraseiro;


    //Métodos Acessores
    public boolean getSituacaoMotor() {
        return motor.getLigado();
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Pneu getPneuDianteiro() {
        return this.pneuDianteiro;
    }

    public void setPneuDianteiro(Pneu pneuDianteiro) {
        this.pneuDianteiro = pneuDianteiro;
    }

    public Pneu getPneuTraseiro() {
        return this.pneuTraseiro;
    }

    public void setPneuTraseiro(Pneu pneuTraseiro) {
        this.pneuTraseiro = pneuTraseiro;
    }

    // Construtor
    public Carro() {
        this.motor = new Motor();
        this.pneuDianteiro = new Pneu();
        this.pneuTraseiro = new Pneu();
    }

    // Métodos
    public void acelerar() {
        this.motor.ligar();
    }

    public void trocarPneuDianteiro() {
        this.pneuDianteiro = new Pneu();
    }

    public void trocarPneuTraseiro() {
        this.pneuTraseiro = new Pneu();
    }
}
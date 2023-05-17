public class Motor {
    private boolean ligado;

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    //Métodos Acessores

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}

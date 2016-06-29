package br.com.toystore;

public class Eletronico extends Brinquedo{

    private int qtdPilhas;
    private String caracteristica;
    
    public int getQtdPilhas() {
        return qtdPilhas;
    }

    public void setQtdPilhas(int qtdPilhas) {
        this.qtdPilhas = qtdPilhas;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nCaracterísticas: " + this.getCaracteristica() 
                                + "\nQuantidade de pilhas: " + this.getQtdPilhas();
    }
}

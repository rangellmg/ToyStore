package br.com.toystore;

public class Montagem extends Brinquedo {
    
    private int qtdPeca;

    public int getQtdPeca() {
        return qtdPeca;
    }

    public void setQtdPeca(int qtdPeca) {
        this.qtdPeca = qtdPeca;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nQuantidade de peças: " + this.getQtdPeca();
    }
}

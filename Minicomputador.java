package br.com.toystore;

public class Minicomputador extends Eletronico {
    
    private int qtdFuncao;

    public int getQtdFuncao() {
        return qtdFuncao;
    }

    public void setQtdFuncao(int qtdFuncao) {
        this.qtdFuncao = qtdFuncao;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nQuantidades de funções: " + this.getQtdFuncao();
    }
}

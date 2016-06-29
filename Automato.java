package br.com.toystore;

public class Automato extends Brinquedo {
    
    private String tipoEnergia;

    public String getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(String tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTipo de energia: " + this.getTipoEnergia();
    }
}

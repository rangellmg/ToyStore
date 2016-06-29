package br.com.toystore;

public class Brinquedo {
    
    private String nome;
    private int idadeMinima;
    private String descMaterial;

    public String getDescMaterial() {
        return descMaterial;
    }

    public void setDescMaterial(String descMaterial) {
        this.descMaterial = descMaterial;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.getNome() +
               "\nIdade mínima: " + this.getIdadeMinima() +
               "\nDescrição do material: " + this.getDescMaterial();
    }
}
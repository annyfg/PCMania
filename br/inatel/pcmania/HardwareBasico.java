package br.inatel.pcmania;

public class HardwareBasico {
    private String nome; //tipo de dispositivo
    private float capacidade; //capacidade daquele dispositivo

    public HardwareBasico(String nome,float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public float getCapacidade() {
        return capacidade;
    }

}

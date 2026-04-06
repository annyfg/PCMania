package br.inatel.pcmania;

public class Cliente {
    private String nome;
    private Computador[] computadores = new Computador[10];
    private String cpf;

    //construtor
    public Cliente(String n, String cpf)
    {
        this.nome = n;
        this.cpf = cpf;


    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    //metodos
    public void calculaTotalCompra()
    {
        float total = 0;

        for(int i=0; i < computadores.length; i++)
        {
            if(computadores[i] != null)
            {
                total += computadores[i].getPreco();
                System.out.println("Total R$ " + total);

            }
        }
    }
}

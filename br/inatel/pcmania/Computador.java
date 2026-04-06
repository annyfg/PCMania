package br.inatel.pcmania;
//objetotodo
public class Computador {

    private String marca;
    private float preco;
    private SistemaOperacional sistemop;
    private HardwareBasico[] hardsbasic;
    private MemoriaUSB memoriaUSB;

    public Computador(String m,float p)
    {
        this.marca = m;
        this.preco = p;
        this.hardsbasic = hardsbasic;
        this.sistemop = sistemop;
        this.memoriaUSB = memoriaUSB;
    }

    //get e set

    public float getPreco() {

        return preco;
    }

    public void setHardsbasic(HardwareBasico[] hardsbasic) {
        this.hardsbasic = hardsbasic;
    }

    public void setMemoriaUSB(MemoriaUSB memoriaUSB) {
        this.memoriaUSB = memoriaUSB;
    }


    public void setSistemop(SistemaOperacional sistemop) {
        this.sistemop = sistemop;
    }

    //metodos
    public void mostraPConfigs()
    {
        System.out.println("marca: " + marca);
        System.out.println("preço: " + "R$ " + preco );

        for(int i =0; i < hardsbasic.length; i++)
        {
            System.out.println(hardsbasic[i].getNome() + " " + hardsbasic[i].getCapacidade());
        }
        if(sistemop != null)
        {
            System.out.println("sistema operacional: " + sistemop.getNome() + " -- " + sistemop.getTipo() + " bits");
        }
        if(memoriaUSB != null)
        {
            System.out.println("memoria usb: " + memoriaUSB.getNome() + " -- " + memoriaUSB.getCapacidade());
        }

    }
    public void addMemoriaUSB (MemoriaUSB musb)
    {

        this.memoriaUSB = musb;

    }

}

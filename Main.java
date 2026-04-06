import br.inatel.pcmania.*;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner entrada = new Scanner(System.in);
        Cliente cliente1 = new Cliente("anny","123456");


        Computador c1 = new Computador("Apple",816);
        Computador c2 = new Computador("Samsung",2050);
        Computador c3 = new Computador("Dell",6494);

        SistemaOperacional s1 = new SistemaOperacional("macOS Sequoia", 64);
        SistemaOperacional s2 = new SistemaOperacional("Windows",64);
        SistemaOperacional s3 = new SistemaOperacional("Windows 10",64);

        c1.setSistemop(s1);
        c2.setSistemop(s2);
        c3.setSistemop(s3);

        MemoriaUSB usb1 = new MemoriaUSB("Acompanha Pen-drive (Gb)",16);
        MemoriaUSB usb2 = new MemoriaUSB("Acompanha Pen-drive (Gb)",32);
        MemoriaUSB usb3 = new MemoriaUSB("Acompanha HD Externo (Tb)",1);

        c1.setMemoriaUSB(usb1);
        c2.setMemoriaUSB(usb2);
        c3.setMemoriaUSB(usb3);

        HardwareBasico[] hw1 = new HardwareBasico[3];
        HardwareBasico[] hw2 = new HardwareBasico[3];
        HardwareBasico[] hw3 = new HardwareBasico[3];

        hw1[0] = new HardwareBasico("Core i3 (MHz)",2200);
        hw1[1] = new HardwareBasico("RAM (Gb)",8);
        hw1[2] = new HardwareBasico("HD (Gb)",500);

        hw2[0] = new HardwareBasico("Core i5 (MHz)",3370);
        hw2[1] = new HardwareBasico("RAM (Gb)",16);
        hw2[2] = new HardwareBasico("HD (Tb)",1);

        hw3[0] = new HardwareBasico("Core i7 (MHz)",4500);
        hw3[1] = new HardwareBasico("RAM (Gb)",32);
        hw3[2] = new HardwareBasico("HD (Tb)",2);

        c1.setHardsbasic(hw1);
        c2.setHardsbasic(hw2);
        c3.setHardsbasic(hw3);

        System.out.println("---- loja PCMania ----");
        System.out.println("promação 1- digite 1");
        System.out.println("promação 2- digite 2");
        System.out.println("promação 3- digite 3");
        System.out.println("quaso não queira comprar - digite 0");

        int opção = entrada.nextInt();

        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCpf());

        switch (opção)
        {
            case 0:
                break;
            case 1:
                cliente1.getComputadores()[0] = c1;
                c1.mostraPConfigs();
                cliente1.calculaTotalCompra();
                c1.addMemoriaUSB(new MemoriaUSB("extra (Gb)",240));
                c1.mostraPConfigs();


                break;
            case 2:
                cliente1.getComputadores()[0] = c2;
                c2.mostraPConfigs();
                cliente1.calculaTotalCompra();
                c2.addMemoriaUSB(new MemoriaUSB("extra (Gb)",24));
                c2.mostraPConfigs();
                break;
            case 3:
                cliente1.getComputadores()[0] = c3;
                c3.mostraPConfigs();
                cliente1.calculaTotalCompra();
                break;
        }
        ProcessarPedido.processar(cliente1.getComputadores());





    }
}

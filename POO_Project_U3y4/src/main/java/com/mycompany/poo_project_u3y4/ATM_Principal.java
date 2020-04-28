package com.mycompany.poo_project_u3y4;

import java.util.Scanner;

public abstract class ATM_Principal extends Cliente {

    protected int transacion;
    protected int retirar;
    protected int ingresar;

    Scanner entrada = new Scanner(System.in);

    /*Cliente cliente = new Cliente();*/

    public void operaciones() {
        int cambio = 0;
        int seleccion = 0;

        System.out.println("Ingrese su nombre");
        setNombre(entrada.nextLine());
        System.out.println("------------------------------------");
        System.out.println("Ingrese su numero de cuenta");
        setNumCuenta(entrada.nextLine());
        System.out.println("------------------------------------");
        

        do {
            do {
                System.out.println("Seleccione una opcion");
                System.out.println("1. Consultar mi saldo");
                System.out.println("2. Retirar efectivo");
                System.out.println("3. Depositar efectivo");
                System.out.println("4. Salir");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    cambio = 1;
                } else {
                    System.out.println("------------------------------------");
                    System.out.println("        Opcion no disponible");
                    System.out.println("------------------------------------");
                }

            } while (cambio == 0);

            switch (seleccion) {
                case 1:
                    ATM_Principal consulta = new Consulta();
                    consulta.transaciones();
                    break;
                case 2:
                    ATM_Principal retiro = new Retiro();
                    retiro.transaciones();
                    break;
                case 3:
                    ATM_Principal deposito = new Deposito();
                    deposito.transaciones();
                    break;
                case 4:
                    System.out.println("------------------------------------");
                    System.out.println("    Gracias por usar el programa");
                    System.out.println("------------------------------------");
                    cambio = 2;
                    break;
            }
        } while (cambio != 2);
    }

    public void retirar() {
        retirar = entrada.nextInt();
    }

    public void depositar() {
        ingresar = entrada.nextInt();
    }

    public abstract void transaciones();

}

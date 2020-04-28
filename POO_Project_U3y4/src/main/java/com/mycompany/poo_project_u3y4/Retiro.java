package com.mycompany.poo_project_u3y4;

public class Retiro extends ATM_Principal {

    @Override
    public void transaciones() {
        System.out.println("Ingrese la cantidad a retirar");
        retirar();

        if (retirar <= getSaldo()) {
            transacion = getSaldo();
            setSaldo(transacion - retirar);
            System.out.println("------------------------------------");
            System.out.println("Numero de cuenta: " + getNumCuenta());
            System.out.println("Titular de la cuenta: " + getNombre());
            System.out.println("Retiraste: $" + retirar);
            System.out.println("Nuevo saldo: $" + getSaldo());
            System.out.println("------------------------------------");
        } else {
            System.out.println("------------------------------------");
            System.out.println("        Saldo insuficiente");
            System.out.println("------------------------------------");
        }
    }
}

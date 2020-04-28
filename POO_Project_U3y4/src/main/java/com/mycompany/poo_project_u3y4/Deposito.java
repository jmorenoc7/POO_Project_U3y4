package com.mycompany.poo_project_u3y4;

public class Deposito extends ATM_Principal {

    @Override
    public void transaciones() {
        System.out.println("Ingrese la cantidad a depositar");
        depositar();
        transacion = getSaldo();
        setSaldo(transacion + ingresar);
        System.out.println("------------------------------------");
        System.out.println("Numero de cuenta: "+getNumCuenta());
        System.out.println("Titular de la cuenta: "+getNombre());
        System.out.println("Depositaste: $" + ingresar);
        System.out.println("Nuevo saldo: $" + getSaldo());
        System.out.println("------------------------------------");
    }
}

package com.mycompany.poo_project_u3y4;

public class Consulta extends ATM_Principal {

    @Override
    public void transaciones() {
        System.out.println("------------------------------------");
        System.out.println("Numero de cuenta: "+getNumCuenta());
        System.out.println("Titular de la cuenta: "+getNombre());
        System.out.println("Tu saldo actual es: $" + getSaldo());
        System.out.println("------------------------------------");
    }
}

package com.mycompany.poo_project_u3y4;

public class Cliente {

    private static String Nombre;
    private static String NumCuenta;
    private static int saldo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(String NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}

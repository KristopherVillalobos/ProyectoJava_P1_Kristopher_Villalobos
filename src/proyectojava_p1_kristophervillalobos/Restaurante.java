/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojava_p1_kristophervillalobos;

/**
 *
 * @author krist
 */
public class Restaurante {
    
    private int numeromesas;
    private boolean reservada;

    public Restaurante(int numeromesas, boolean reservada) {
        this.numeromesas = numeromesas;
        this.reservada = reservada;
    }

    public int getNumeromesas() {
        return numeromesas;
    }

    public void setNumeromesas(int numeromesas) {
        this.numeromesas = numeromesas;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }
}

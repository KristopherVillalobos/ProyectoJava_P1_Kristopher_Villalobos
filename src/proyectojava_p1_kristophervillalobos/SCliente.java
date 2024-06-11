/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojava_p1_kristophervillalobos;

/**
 *
 * @author krist
 */
public class SCliente {
    
    private String NombreCliente;
    private String Comentarios;
    private int Valoracion;

    public SCliente(String NombreCliente, String Comentarios, int Valoracion) {
        this.NombreCliente = NombreCliente;
        this.Comentarios = Comentarios;
        this.Valoracion = Valoracion;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getComentarios() {
        return Comentarios;
    }

    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }

    public int getValoracion() {
        return Valoracion;
    }

    public void setValoracion(int Valoracion) {
        this.Valoracion = Valoracion;
    }
}

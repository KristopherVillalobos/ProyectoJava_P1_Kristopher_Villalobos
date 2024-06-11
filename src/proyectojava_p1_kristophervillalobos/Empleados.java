/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojava_p1_kristophervillalobos;

/**
 *
 * @author krist
 */
public class Empleados {
   
    private String Nombre;
    private String Tarea;
    private String Turno;

    public Empleados(String Nombre, String Tarea, String Turno) {
        this.Nombre = Nombre;
        this.Tarea = Tarea;
        this.Turno = Turno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTarea() {
        return Tarea;
    }

    public void setTarea(String Tarea) {
        this.Tarea = Tarea;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojava_p1_kristophervillalobos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author krist
 */
public class Menu {
    
    class Plato {

        private String nombre;
        private String categoria;
        private double precio;
        private boolean disponible;

        public Plato(String nombre, String categoria, double precio, boolean disponible) {
            this.nombre = nombre;
            this.categoria = categoria;
            this.precio = precio;
            this.disponible = disponible;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCategoria() {
            return categoria;
        }

        public double getPrecio() {
            return precio;
        }

        public boolean isDisponible() {
            return disponible;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public void setDisponible(boolean disponible) {
            this.disponible = disponible;
        }
    }

    private List<Plato> platos;

    public Menu() {
        this.platos = new ArrayList<>();
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void eliminarPlato(String nombre) {
        platos.removeIf(plato -> plato.getNombre().equals(nombre));
    }

    public void actualizarPlato(String nombre, Plato nuevoPlato) {
        for (Plato plato : platos) {
            if (plato.getNombre().equals(nombre)) {
                plato.setNombre(nuevoPlato.getNombre());
                plato.setCategoria(nuevoPlato.getCategoria());
                plato.setPrecio(nuevoPlato.getPrecio());
                plato.setDisponible(nuevoPlato.isDisponible());
            }
        }
    }

    public void listarPlatos() {
        for (Plato plato : platos) {
            System.out.println("Nombre: " + plato.getNombre() + ", Categoria: " + plato.getCategoria() + ", Precio: " + plato.getPrecio() + ", Disponible: " + plato.isDisponible());
        }
    }
}

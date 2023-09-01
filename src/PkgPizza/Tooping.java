package PkgPizza;

import java.util.ArrayList;

public class Tooping {
    private String nombre;
    private double precio;
    private ArrayList<String> ingredientes = new ArrayList<>();

    // Constructor que recibe nombre y precio del topping
    public Tooping(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Agrega un ingrediente a la lista de ingredientes del topping
    public void agregarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    // Getter y setter para el nombre del topping
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y setter para el precio del topping
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter y setter para la lista de ingredientes del topping
    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    // Representación en cadena del topping
    @Override
    public String toString() {
        return "Topping{ nombre:" + nombre + " ingredientes:" + ingredientes;
    }
}

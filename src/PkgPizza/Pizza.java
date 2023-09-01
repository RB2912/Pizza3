package PkgPizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private List<Tooping> toopings = new ArrayList<>();

    // Constructor
    public Pizza(String name) {
        this.name = name;
    }

    // Agrega un ingrediente a la pizza y actualiza el precio total
    public void addTopping(Tooping tooping) {
        this.toopings.add(tooping);
        this.price += tooping.getPrecio();
    }

    // Remueve un ingrediente de la pizza y ajusta el precio total
    public void removeTopping(int index) {
        if (index >= 0 && index < toopings.size()) {
            this.price -= toopings.get(index).getPrecio();
            this.toopings.remove(index);
        }
    }

    // Prepara la pizza mostrando los ingredientes y un retardo de 1 segundo por ingrediente
    public void prepare() {
        System.out.println("Preparando la pizza.. " + name);
        System.out.println("Agregando chunches...");
        for (Tooping tooping : toopings) {
            System.out.println("- " + tooping.getNombre());
            // Delay de 1 segundo.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Devuelve una representación en cadena de la pizza
    @Override
    public String toString() {
        return "Pizza:" + name + " Price=" + price;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public List<Tooping> getToopings() {
        return toopings;
    }
}

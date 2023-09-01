import PkgPizza.Pizza;
import PkgPizza.Tooping;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para recibir entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de objetos Tooping con nombres y precios específicos
        Tooping tomate = new Tooping("Tomate", 2.5);
        Tooping cebolla = new Tooping("Cebolla", 1.8);
        Tooping peperoni = new Tooping("Peperoni", 3.0);
        Tooping queso = new Tooping("Queso", 3.0);
        Tooping jamon = new Tooping("Jamón", 2.0);
        Tooping champinones = new Tooping("Champiñones", 2.5);

        // Mostrar un menú de opciones para que el usuario elija ingredientes
        System.out.println("Elige los toppings que quieres:");
        System.out.println("1. Tomate - Precio: " + tomate.getPrecio());
        System.out.println("2. Cebolla - Precio: " + cebolla.getPrecio());
        System.out.println("3. Peperoni - Precio: " + peperoni.getPrecio());
        System.out.println("4. Queso - Precio: " + queso.getPrecio());
        System.out.println("5. Jamón - Precio: " + jamon.getPrecio());
        System.out.println("6. Champiñones - Precio: " + champinones.getPrecio());

        // Crear una instancia de Pizza con el nombre "Margarita"
        Pizza pizza = new Pizza("Margarita");

        // Bucle para permitir al usuario agregar ingredientes a la pizza
        boolean seguirAgregando = true;
        while (seguirAgregando) {
            System.out.println("Ingresa el número del topping que quieres agregar (0 para terminar):");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 0:
                    seguirAgregando = false;
                    break;
                case 1:
                    pizza.addTopping(tomate);
                    break;
                case 2:
                    pizza.addTopping(cebolla);
                    break;
                case 3:
                    pizza.addTopping(peperoni);
                    break;
                case 4:
                    pizza.addTopping(queso);
                    break;
                case 5:
                    pizza.addTopping(jamon);
                    break;
                case 6:
                    pizza.addTopping(champinones);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        // Preparar y mostrar la pizza
        pizza.prepare();

        // Mostrar el precio total de la pizza
        System.out.println("Precio total de la pizza: " + pizza.getPrice());
    }
}

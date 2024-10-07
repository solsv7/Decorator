package decorator;

public class Decorator_Test {

    public static void main(String[] args) {
        
        Pizza pizza = new PizzaBasica();
        System.out.println(pizza.getDescripcion() + " Costo: $" + pizza.getCosto());


        pizza = new Queso(pizza);
        System.out.println(pizza.getDescripcion() + " Costo: $" + pizza.getCosto());


        pizza = new Jamon(pizza);
        System.out.println(pizza.getDescripcion() + " Costo: $" + pizza.getCosto());
    }

}

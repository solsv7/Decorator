package decorator;

public class Jamon extends PizzaDecorator {

    public Jamon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizzaDecorada.getDescripcion() + ", Jamón";
    }

    @Override
    public double getCosto() {
        return pizzaDecorada.getCosto() + 2.00; 
    }
}


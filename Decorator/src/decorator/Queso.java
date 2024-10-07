package decorator;

public class Queso extends PizzaDecorator {

    public Queso(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizzaDecorada.getDescripcion() + ", Queso";
    }

    @Override
    public double getCosto() {
        return pizzaDecorada.getCosto() + 1.50; 
    }
}

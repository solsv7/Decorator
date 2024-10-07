package decorator;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizzaDecorada;

    public PizzaDecorator(Pizza pizza) {
        this.pizzaDecorada = pizza;
    }

    @Override
    public String getDescripcion() {
        return pizzaDecorada.getDescripcion();
    }

    @Override
    public double getCosto() {
        return pizzaDecorada.getCosto();
    }
}

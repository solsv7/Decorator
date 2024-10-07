package decorator;

public class PizzaBasica implements Pizza {

    @Override
    public String getDescripcion() {
        return "Masa de pizza con salsa de tomate";
    }

    @Override
    public double getCosto() {
        return 5.00; // Costo básico de la pizza
    }
}

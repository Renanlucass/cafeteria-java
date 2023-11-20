public class AcucarDecorator extends IngredienteDecorator {
    public AcucarDecorator(CafeBase cafe) {
        super(cafe);
    }

    @Override
    public double cost() {
        return cafe.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return cafe.getDescription() + ", Açúcar";
    }
}

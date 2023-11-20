public class CremeDecorator extends IngredienteDecorator {
    public CremeDecorator(CafeBase cafe) {
        super(cafe);
    }

    @Override
    public double cost() {
        return cafe.cost() + 1.0;
    }

    @Override
    public String getDescription() {
        return cafe.getDescription() + ", Creme";
    }
}

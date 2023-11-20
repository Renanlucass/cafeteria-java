public class ChocolateDecorator extends IngredienteDecorator {
    public ChocolateDecorator(CafeBase cafe) {
        super(cafe);
    }

    @Override
    public double cost() {
        return cafe.cost() + 1.5;
    }

    @Override
    public String getDescription() {
        return cafe.getDescription() + ", Chocolate";
    }
}

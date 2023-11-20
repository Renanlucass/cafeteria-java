public abstract class IngredienteDecorator implements CafeBase {
    protected CafeBase cafe;

    public IngredienteDecorator(CafeBase cafe) {
        this.cafe = cafe;
    }

    @Override
    public abstract double cost();

    @Override
    public abstract String getDescription();
}

public class Cafe implements CafeBase {
    private double cost = 2.0;

    public Cafe() {
        // Construtor vazio
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Café";
    }
}

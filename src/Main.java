public class Main {
    public static void main(String[] args) {
        // Criando um café
        CafeBase meuCafe = new Cafe();

        // Adicionando ingredientes através dos decoradores
        meuCafe = new CremeDecorator(meuCafe);
        meuCafe = new AcucarDecorator(meuCafe);
        meuCafe = new ChocolateDecorator(meuCafe);

        // Obtendo o custo total e a descrição do café
        double custoTotal = meuCafe.cost();
        String descricao = meuCafe.getDescription();

        // Exibindo o resultado
        System.out.println("Custo Total: $" + custoTotal);
        System.out.println("Descrição: " + descricao);
    }
}

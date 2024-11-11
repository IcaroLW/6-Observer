public class departamentoCompras implements observer {
    @Override
    public void update(String message) {
        System.out.println("Compras: " + message + " Monitorando níveis de estoque.");
    }
}

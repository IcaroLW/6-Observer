public class departamentoVendas implements observer {
    @Override
    public void update(String message) {
        System.out.println("Vendas: " + message + " Atualizando disponibilidade no site.");
    }
}

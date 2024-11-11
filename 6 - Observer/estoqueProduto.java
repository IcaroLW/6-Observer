import java.util.ArrayList;
import java.util.List;

public class estoqueProduto implements estoque {
    private List<observer> observers = new ArrayList<>();
    private String produto;
    private boolean emEstoque;

    public estoqueProduto(String produto) {
        this.produto = produto;
        this.emEstoque = false;
    }

    @Override
    public void registrarObserver(observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (observer observer : observers) {
            observer.update("O produto " + produto + " voltou ao estoque!");
        }
    }

    // Simula o reabastecimento do produto
    public void reabastecerProduto() {
        emEstoque = true;
        System.out.println("Produto " + produto + " foi reabastecido.");
        notificarObservers();
    }
}

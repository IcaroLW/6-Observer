public interface estoque {
    void registrarObserver(observer observer);
    void removerObserver(observer observer);
    void notificarObservers();
}

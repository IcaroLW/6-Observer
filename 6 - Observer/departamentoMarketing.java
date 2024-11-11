public class departamentoMarketing implements observer {
    @Override
    public void update(String message) {
        System.out.println("Marketing: " + message + " Promovendo nas redes sociais.");
    }
}

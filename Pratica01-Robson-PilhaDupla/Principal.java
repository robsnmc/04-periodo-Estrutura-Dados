public class Principal{
    public static void main(String[] args) {
        ListaDupla<Produto> lista = new ListaDupla<Produto>("Produtos");
        
        lista.addInicio(new Produto("Maça", 100));
        lista.addFinal(new Produto("Toalha", 1));
        lista.addMeio(new Produto("Macarrão", 1), 1);
        lista.imprimeLista();
        System.out.println("Produto removido: " + lista.removeMeio(1));
        lista.addInicio(new Produto("Panela", 99));
        lista.addFinal(new Produto("Chocolate", 301));
        lista.imprimeLista();
    }
}
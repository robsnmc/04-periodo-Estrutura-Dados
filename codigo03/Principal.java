public class Principal {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>();

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.imprimePilha();
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Elemento removido: " + pilha.pop());
        pilha.imprimePilha();
        pilha.push("A");
        pilha.push("C");
        System.out.println("Topo: " + pilha.pick());
    }
}
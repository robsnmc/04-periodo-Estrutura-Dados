public class Principal {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>();

        pilha.push("C#");
        pilha.push("JavaScript");
        pilha.push("Ruby");
        pilha.imprimePilha();
        pilha.pop();
        System.out.println("Elemento Topo: " + pilha.pick());
        pilha.push("Python");
        pilha.push("Go");
        pilha.imprimePilha();
    }
}
public class Pilha<T> {
    private String nomePilha;
    private No<T> topo;

    public Pilha() {
        this("");
    }

    public Pilha(String nomePilha) {
        this.nomePilha = nomePilha;
        this.topo = null;
    }

    public void push(T dado) {
        No<T> novoNo = new No<T>(dado);

        novoNo.setNextNo(topo);
        topo = novoNo;
    }

    public T pop() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return null;
        }

        T dado = topo.getDado();
        topo = topo.getNextNo();
        return dado;
    }

    public T pick() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return null;
        }
        T dado = topo.getDado();
        return dado;
    }

    public void imprimePilha() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Dados da Pilha " + getNomePilha());
            No<T> aux = topo;
            while (aux != null) {
                System.out.println(aux.toString());
                aux = aux.getNextNo();
            }
        }
    }

    public void setNomePilha(String nomePilha) {
        this.nomePilha = nomePilha;
    }

    public String getNomePilha() {
        return this.nomePilha;
    }

    public void setTop(No<T> topo) {
        this.topo = topo;
    }

    public No<T> getTopo() {
        return this.topo;
    }
}
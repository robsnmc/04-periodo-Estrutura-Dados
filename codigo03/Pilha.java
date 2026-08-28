public class Pilha<T> {
    private String nomePilha;
    private No<T> topo;

    public Pilha(){
        this("");
    }

    public Pilha(String nomePilha) {
        this.nomePilha = nomePilha;
        this.topo = null;
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
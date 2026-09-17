public class Produto {
    private String Nome;
    private double Preco;

    public Produto() {
        this.Nome = null;
        this.Preco = 0;
    }

    public Produto(String Nome, double Preco) {
        this.Nome = Nome;
        this.Preco = Preco;
    }

    public String getNome() {
        return this.Nome;
    }

    public double getPreco() {
        return this.Preco;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    @Override
     public String toString(){
        return String.format("Produto{Nome: %s, Preço: %f}",getNome(), getPreco());
    }

}
class Pessoa {
    private String nome;
    private int idade;
    private Endereco end = new Endereco();

    public Pessoa() {
        this(null, 0);
    }

    public Pessoa(String nome, int idade) {
        this(nome, idade, null);
    }

    public Pessoa(String nome, int idade, Endereco end) {
        setNome(nome);
        setIdade(idade);
        setEnd(end);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    @Override
    public String toString() {
        return String.format("Pessoa[Nome: %s, Idade: %d]", this.getNome(), this.getIdade());
    }
}
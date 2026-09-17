public class Principal{
    public static void main(String[] args){
        Fila<String> fila = new Fila<String>("Fila nomes");

        fila.enfileirar("Robson");
        fila.enfileirar("Gabriel");
        fila.enfileirar("Lucas");
        fila.imprimeFila();
        fila.desenfileirar();
        System.out.println("Primerio nome: " + fila.getPrimeiroNo().getDado());
        fila.enfileirar("João");
        fila.enfileirar("Pedro");
        fila.imprimeFila();
    }
}
public class Principal{
    public static void main(String[] args){
        Fila<Integer> fila = new Fila<Integer>("Números Inteiros");

        fila.enfileirar(1);
        fila.enfileirar(12);
        fila.enfileirar(122);
        fila.imprimeFila();
        fila.desenfileirar();
        fila.desenfileirar();
        fila.imprimeFila();
        fila.desenfileirar();
        fila.desenfileirar();
        System.out.println(fila.getUltimoNo());

        
    }
}
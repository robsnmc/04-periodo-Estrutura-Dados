public class Principal{
    public static void main(String[] args) {

    /* 
        NoDuplo<String> no1 = new NoDuplo<String>("Rafael");
        NoDuplo<String> no2 = new NoDuplo<String>("Cecília");
        NoDuplo<String> no3 = new NoDuplo<String>("Joaquim");
        NoDuplo<String> no4 = new NoDuplo<String>("Lara");

        no1.setProximoNo(no2);
        no2.setAnteriorNo(no1);
        no1.getProximoNo().getDado();
    */
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
        lista.addInicio("Rafael");
        lista.addInicio("Cecilia");
        lista.addFinal("Joaquim");
        lista.imprimeLista();

        lista.addMeio("Lara", 2);
        lista.imprimeLista();
        System.out.println("Dado: " + lista.removeInicio() + " removido!");
        lista.imprimeLista();
        System.out.println("Dado: " + lista.removeFinal() + " removido!");
        lista.imprimeLista();
    }
}
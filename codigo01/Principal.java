public class Principal {
    public static void main(String[] args) {

        No<String> obj = new No<String>("Robson");
        
        No<Pessoa> objP = new No<Pessoa>("Gabriel", 29);

        obj.setnextNo(new No("Cecilia"));
        obj.getnextNo().setnextNo(new No("Joaquim"));
        
        /* System.out.println(obj.getDado());
        System.out.println(obj.getnextNo().getDado());
        System.out.println(obj.getnextNo().getnextNo().getDado()); */

        No aux = obj;
        while (aux != null) {
            System.out.println(aux.getDado());
            aux = aux.getnextNo();
        }
    }
}
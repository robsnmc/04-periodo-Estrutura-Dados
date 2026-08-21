import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Pessoa> listaP = new ArrayList<>();

        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Robson", 19);
        Pessoa obj3 = new Pessoa();

        System.out.print("Digite o nome: ");
        obj3.setNome(input.nextLine());
        System.out.print("Digite a idade: ");
        obj3.setIdade(input.nextInt());
        /* 
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString()); */
        
        listaP.add(obj1);
        listaP.add(obj2);
        listaP.add(obj3);

        for(Pessoa auxP : listaP) {
            System.out.println(auxP.toString());
        }

        listaP.get(0).setNome("Gabriel");
        listaP.get(0).setIdade(20);
        System.out.println(listaP.get(0).toString());
        System.out.println(listaP.get(1).toString());
        System.out.println(listaP.get(2).toString());

        input.close();
    }
}
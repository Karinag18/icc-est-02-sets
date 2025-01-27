import collections.Sets;
import java.util.Set;
import java.util.TreeSet;
import models.Contacto;
import utils.ContactoComparator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------SETS----------------");
        //runHashSet();
        //runLinkedHashSet();
        //runTreeSet();
       // runConstruirTreeSetConComparador();
        //runEjercicio();
        runEjercicio2();
    }
    private static void runEjercicio() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        Contacto c1 = new Contacto("pedro", "lopez", "123456789");
        Contacto c2 = new Contacto("pedro", "lopez", "123456789");

        System.out.println("Referencia en memoria: ");
        Boolean comparacionReferencia = c1 == c2;
        System.out.println("c1: " + c1 + " == c2: " + c2 + " = " + comparacionReferencia + "\n *******************************");

        System.out.println("Comparacion con equals:");
        boolean comparacionEquals = c1.equals(c2); // Ahora la comparación es con equals()
        System.out.println("c1: " + c1 + " == c2: " + c2 + " = " + comparacionEquals + "\n *******************************");

        System.out.println("comparacion con HashCode: ");
        boolean comparacionHashcode = c1.hashCode() == c2.hashCode();
        System.out.println("c1: " + c1.hashCode() + " == c2: " + c2.hashCode() + " = " + comparacionHashcode + "\n *******************************");
    }
    private static void runEjercicio2(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        agenda.add(new Contacto("pedro", "lopez", "22222222222"));
        agenda.add(new Contacto("luis", "perez", "11111111111"));
        agenda.add(new Contacto("ana", "perez", "9874561230"));
        agenda.add(new Contacto("pedro", "lopez", "0123456789"));

        for (Contacto c: agenda) {
            System.out.println(c);  
        }
    }
}
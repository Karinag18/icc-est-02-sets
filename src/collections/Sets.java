package collections;
import java.util.*;

public class Sets {

    /**
     * Construye un HashSet de tipo string con algunos elementos
     * 
     * @return HashSet<String>con valores de ejemplo
     */

    public Sets(){

    }

    public Set<String> construirHashSet(){
        Set<String> miHashSet = new HashSet<>();

        miHashSet.add("Manzana");
        miHashSet.add("Pera");
        miHashSet.add("Melocoton");
        miHashSet.add("Melon");
        miHashSet.add("Pera");  //elemento repetido, no se añadira de nuevo

        return miHashSet;
    }


    public static Set<String>construirLinkedHashSet(){
        Set<String> miLinkedHasSet = new LinkedHashSet<>();

        miLinkedHasSet.add("Manzana");
        miLinkedHasSet.add("Pera");
        miLinkedHasSet.add("Melocoton");
        miLinkedHasSet.add("Melon");
        miLinkedHasSet.add("Pera");   //elemento repetido, no se añadira de nuevo

        return miLinkedHasSet;

    }

    public static Set<String>construirTreeSet(){
        Set<String> miTreeSet = new TreeSet<>();

        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Melocoton");
        miTreeSet.add("Melon");
        miTreeSet.add("Pera");    //elemento repetido, no se añadira de nuevo

        return miTreeSet;
    }

    // Método para construir un TreeSet con un comparador personalizado
    public Set<String> construirTreeSetConComparador() {
        // Crear un comparador que ordena por longitud y luego alfabéticamente
        Comparator<String> comparadorPorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Primero comparamos la longitud
                int resultado = Integer.compare(s1.length(), s2.length());
                // Si tienen la misma longitud, comparamos alfabéticamente
                if (resultado == 0) {
                    return s1.compareTo(s2);
                }
                return resultado;
            }
        };

        
        Set<String> miTreeSetConComparador = new TreeSet<>(comparadorPorLongitud);
        miTreeSetConComparador.add("Melon");
        miTreeSetConComparador.add("Pera");
        miTreeSetConComparador.add("Manzana");
        miTreeSetConComparador.add("Fresa");
        miTreeSetConComparador.add("Kiwi");
        miTreeSetConComparador.add("Melocoton");
        miTreeSetConComparador.add("Pera"); // Elemento repetido, no se añadira de nuevo

        return miTreeSetConComparador;
    }
}
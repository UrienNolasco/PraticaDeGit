import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(5);
        lista.add(2);
        lista.add(8);
        lista.add(2);
        lista.add(5);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(2);
        lista2.add(5);
        lista2.add(7);
        lista2.add(8);

        Integer elemento = 2;
        int ocorrencias = nOcorrencias(lista, elemento);
        System.out.println("Ocorrências de " + elemento + ": " + ocorrencias);

        ArrayList<Integer> elementosRepetidos = listRepeat(lista);
        System.out.println("Elementos repetidos: " + elementosRepetidos);

        int numeroRepetidos = nroRepeat(lista);
        System.out.println("Número de elementos repetidos: " + numeroRepetidos);

        ArrayList<Integer> intersecao = intersect(lista, lista2);
        System.out.println("Interseção entre lista e lista2: " + intersecao);
    }

    public static int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int count = 0;
        for (Integer num : l) {
            if (num.equals(el)) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> elementosRepetidos = new ArrayList<>();
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (Integer num : l) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > 1) {
                elementosRepetidos.add(entry.getKey());
            }
        }

        return elementosRepetidos;
    }

    public static int nroRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> elementosRepetidos = listRepeat(l);
        return elementosRepetidos.size();
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> intersection = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num : l1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer num : l2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        return intersection;
    }
}

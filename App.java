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

        Integer elemento = 2;
        int ocorrencias = nOcorrencias(lista, elemento);
        System.out.println("Ocorrências de " + elemento + ": " + ocorrencias);

        ArrayList<Integer> elementosRepetidos = listRepeat(lista);
        System.out.println("Elementos repetidos: " + elementosRepetidos);

        int numeroRepetidos = nroRepeat(lista);
        System.out.println("Número de elementos repetidos: " + numeroRepetidos);
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
}

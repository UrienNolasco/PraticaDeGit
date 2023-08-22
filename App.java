import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(5);
        lista.add(2);
        lista.add(8);
        lista.add(2);

        Integer elemento = 2;
        int ocorrencias = nOcorrencias(lista, elemento);
        System.out.println("Ocorrências de " + elemento + ": " + ocorrencias);
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
}
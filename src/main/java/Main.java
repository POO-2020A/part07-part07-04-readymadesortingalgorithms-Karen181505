
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};

    }

    public static void sort(int[] array) {
        int i = 0;
        while (true) {
            int pos = i;
            int a = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < a) {
                    a = array[j];
                    pos = j;
                }
            }
            int aux = array[i];
            array[i] = array[pos];
            array[pos] = aux;
            i++;
            if (i == array.length) {
                break;
            }
        }
    }

    public static void sort(String[] array) {
        int i = 0;
        while (true) {
            int pos = i;
            String c = array[i];
            int auxiliar = 0;
            for (int j = 0; j < c.length(); j++) {
                auxiliar = auxiliar + (int) c.charAt(j);
            }
            for (int j = i + 1; j < array.length; j++) {
                String string = array[j];
                int mayor = 0;
                for (int k = 0; k < string.length(); k++) {
                    mayor = mayor + (int) string.charAt(k);
                }
                if (mayor < auxiliar) {
                    auxiliar = mayor;
                    c = array[j];
                    pos = j;
                }
            }

            String aux = array[i];
            array[i] = array[pos];
            array[pos] = aux;
            i++;
            if (i == array.length) {
                break;
            }
        }
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        int j = 0;
        while (true) {
            int pos = j;
            int a = integers.get(j);
            for (int i = j + 1; i < integers.size(); i++) {
                if (integers.get(i) < a) {
                    a = integers.get(i);
                    pos = i;
                }
            }
            int aux = integers.get(j);
            integers.set(j, integers.get(pos));
            integers.set(pos, aux);
            j++;
            if (j == integers.size()) {
                break;
            }
        }
    }

    public static void sortStrings(ArrayList<String> strings) {
        int i = 0;
        while (true) {
            int pos = i;
            String string = strings.get(i);
            int auxiliar = 0;
            for (int j = 0; j < string.length(); j++) {
                auxiliar = auxiliar + (int) string.charAt(j);
            }
            for (int j = i + 1; j < strings.size(); j++) {
                String d = strings.get(j);
                int mayor = 0;
                for (int m = 0; m < d.length(); m++) {
                    mayor = mayor + (int) d.charAt(m);
                }
                if (mayor < auxiliar) {
                    auxiliar = mayor;
                    string = strings.get(j);
                    pos = j;
                }
            }
            String aux = strings.get(i);
            strings.set(i, strings.get(pos));
            strings.set(pos, aux);
            i++;
            if (i == strings.size()) {
                break;
            }
        }
    }
}

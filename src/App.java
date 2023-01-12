import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> lst1 = Arrays.asList("Morango", "Uva", "Acerola", "Manga");
        List<String> lst2 = Arrays.asList("Pera", "Caju", "Morango", "Kiwi");
        Boolean naoEncontrado = true;
        for (int i = 0; i < lst1.size(); i++) {
            if (lst1.contains(lst2.get(i))) {
                System.out.println("Elemento em comum encontrado: " + lst2.get(i));
                naoEncontrado = false;
            }
        }
        if (Boolean.TRUE.equals(naoEncontrado))
            System.out.println("Não encontramos nenhum elemento em comum");
    }
}

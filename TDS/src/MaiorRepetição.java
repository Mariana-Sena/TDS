import java.util.HashMap;
import java.util.Map;

public class MaiorRepeticao {
    public static int encontraMaiorRepeticao(int[] array) {
        // Crie um mapa para rastrear a contagem de cada elemento
        Map<Integer, Integer> contagem = new HashMap<>();

        // Variáveis para rastrear o elemento com mais repetições e sua contagem
        int elementoMaisRepetido = array[0];
        int maxContagem = 1;

        // Itera pelo array para contar as repetições de cada elemento
        for (int elemento : array) {
            if (contagem.containsKey(elemento)) {
                int novaContagem = contagem.get(elemento) + 1;
                contagem.put(elemento, novaContagem);

                // Atualiza o elemento mais repetido e sua contagem se necessário
                if (novaContagem > maxContagem || (novaContagem == maxContagem && elemento > elementoMaisRepetido)) {
                    elementoMaisRepetido = elemento;
                    maxContagem = novaContagem;
                }
            } else {
                contagem.put(elemento, 1);
            }
        }

        return elementoMaisRepetido;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 4, 2, 3, 3, 1, 2, 4, 2, 3};
        int resultado = encontraMaiorRepeticao(array);
        System.out.println("O elemento com mais repetições é: " + resultado);
    }
}


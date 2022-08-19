package cursojava.executavel;

public class ArrayVetor {
    public static void main(String[] args) {

        String[] items = new String[3];
        items[0] = "string";
        items[1] = "string1";
        items[2] = "string2";

        for (String item : items) {
            System.out.println(item);
        }

        double[] valores = {1, 2, 3};
        for (double valor : valores) {
            System.out.println("VALORES -> "+valor);
        }

        // array sempre deve ter a quantidade de posições definida
        double[] notas = new double[3];
        notas[0] = 9.2;
        notas[1] = 7.6;
        notas[2] = 8.1;

        for (int pos = 0; pos < notas.length; pos++) {
            System.out.println("POSIÇÃO -> "+pos);

        }

        for (int pos = 0; pos < notas.length; pos++) {

            System.out.println("Nota -> "+ (pos + 1)+ " é = "+ notas[pos]);
        }
    }
}

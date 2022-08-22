package cursojava.executavel;

public class Matriz {
    public static void main(String[] args) {

        int notas[][] = new int[2][3];

        notas[0][0] = 80;
        notas[0][1] = 90;
        notas[0][2] = 70;

        notas[1][0] = 97;
        notas[1][1] = 78;
        notas[1][2] = 85;

        System.out.println(notas);

        for (int posLinha = 0; posLinha < notas.length; posLinha++) {
            System.out.println("---------------------------------------------------");
            for (int postColuna = 0; postColuna < notas[posLinha].length ; postColuna++) {
                System.out.println("Matriz: "+ notas[posLinha][postColuna]);
            }
        }
    }
}

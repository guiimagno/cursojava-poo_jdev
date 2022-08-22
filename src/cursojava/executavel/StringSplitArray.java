package cursojava.executavel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplitArray {
    public static void main(String[] args) {

        String text = "guilherme, curso java, 80, 77, 90, 89";

        String[] valoresArray = text.split(",");

        System.out.println("Nome"+valoresArray[0]);
        System.out.println("Curso"+valoresArray[1]);
        System.out.println("Nota1"+valoresArray[2]);
        System.out.println("Nota2"+valoresArray[3]);
        System.out.println("Nota3"+valoresArray[4]);
        System.out.println("Nota4"+valoresArray[5]);

        // convertendo um array em uma lista

        List<String> lista = Arrays.asList(valoresArray);

        for (String s : lista) {
            System.out.println(s);
        }
        //  convertendo lista para array

        String[] conversaoArray = lista.toArray(new String[6]);

        for (int pos=0; pos < conversaoArray.length; pos++){
            System.out.println(conversaoArray[pos]);
        }

    }
}

package cursojava.thread;

public class AulaThreads2 {
    public static void main(String[] args) throws InterruptedException {
       Thread threadNotaFiscal = new Thread(thread1);
        threadNotaFiscal.start();

        Thread threadEmail = new Thread(thread2);
        threadEmail.start();


    }

    private static Runnable thread1 = () -> {

        for (int pos = 0; pos < 10; pos++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Executando rotina -> envio de NOTA FISCAL");
        }

        System.out.println("Fim do código em paralelo (NOTA FISCAL)");
    };

    private static Runnable thread2 = () -> {

        for (int pos = 0; pos < 10; pos++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Executando rotina -> envio de E-MAIL");
        }

        System.out.println("Fim do código em paralelo (E-MAIL)");
    };
}

package cursojava.thread;

public class AulaThreads {
    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> { // executa o que nós queremos
            // código da rotina

            for (int pos = 0; pos < 10; pos++) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Executando rotina -> envio de e-mail");
            }

            System.out.println("Fim do código em thread (e-mail)");

        }).start(); // -> liga a thread que fica processando paralelamente por trás

        new Thread(()->{
            for (int pos = 0; pos < 10; pos++) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Executando rotina -> envio de nota fiscal");
            }

            System.out.println("Fim do código em paralelo (nota fiscal)");
        }).start();
    }

}

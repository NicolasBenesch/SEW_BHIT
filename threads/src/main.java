public class main {

    public static void main(String[] args) {

        DatePrinter d1 = new DatePrinter();
        Thread th1 = new Thread(d1);

        CountPrinter c1 = new CountPrinter();
        Thread th2 = new Thread(c1);

        th1.start();
        th2.start();

    }
}
public class Producer extends Thread {

    Store store;
    int product = 5;

    public Producer(Store store) {
        this.store = store;
    }

    public void run() {
        try {
            while (product > 0) {
                product = product - store.put();
                System.out.println("Ostalos polojit " + product);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

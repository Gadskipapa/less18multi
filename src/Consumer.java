public class Consumer extends Thread {
    int product = 0;
    Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        try {
            while (product < 5) {
                product = product + store.get();
                System.out.println("Kupili " + product);
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
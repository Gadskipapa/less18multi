public class Main {

    public static void main(String[] args) {

        Store store = new Store();
        new Producer(store).start();
        new Consumer(store).start();


//        System.out.println("Main started");
//
//        CommonClass res = new CommonClass();
//
//        for (int i = 1; i < 6; i++) {
//            Thread t = new Thread(new ThreadCount(res));
//            t.setName("Thread " + i);
//            t.start();
//        }


//        MyThread t = new MyThread("MyThread");
//        t.start();
//        try {
//            Thread.sleep(1100);
//            t.disabled();
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//
//            System.out.println("main finished");
//        }
    }
}
public class Store {
    int counter = 0;
    final int N = 5;

    public synchronized int put() {
        if(counter<=N) {
            counter++;
            System.out.println("Na sklade " + counter + " tovara");
            return 1;
        }
        return 0;
    }

    public synchronized int get() {
        if (counter > 0) {
            counter--;
            System.out.println("Sklad imeet " + counter );
            return 1;
        }
        return 0;
    }
}

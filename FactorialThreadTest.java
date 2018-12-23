package ua.i.sonne.homework6;

public class FactorialThreadTest {

    public static void main(String[] args) {

        Thread[] threads= new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new FactorialThread(i));
        }for (int i = 0; i < 100; i++) {
            threads[i].start();
        }
    }
}

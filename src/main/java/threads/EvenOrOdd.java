package threads;

import java.util.ArrayList;
import java.util.List;

public class EvenOrOdd {
    private boolean odd = true;

    public List<Integer> getEvenOdd(int number) {
        // A shared list to store numbers.
        List<Integer> list = new ArrayList<>();

        // Thread for adding odd numbers to the list.
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= number; i += 2) {
                synchronized (this) {
                    if (!odd) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    list.add(i);
                    odd = false;
                    notifyAll();
                }
            }
        });

        // Thread for adding even numbers to the list.
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= number; i += 2) {
                synchronized (this) {
                    if (odd) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    list.add(i);
                    odd = true;
                    notifyAll();
                }
            }
        });

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return list;
    }


}

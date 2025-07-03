import java.util.*;

public class Synchashmap {
    public static void main(String[] args) {
        Map<String, Integer> syncMap = Collections.synchronizedMap(new HashMap<>());
        
        syncMap.put("A", 1);
        syncMap.put("B", 2);
        syncMap.put("C", 3);
        
        System.out.println("Initial Map: " + syncMap);
        
        Runnable writer = () -> {
            for (int i = 0; i < 5; i++) {
                String key = "Thread-" + Thread.currentThread().getId() + "-" + i;
                syncMap.put(key, i);
                System.out.println("Added: " + key);
            }
        };
        
        Runnable reader = () -> {
            synchronized (syncMap) {
                System.out.println("Thread-" + Thread.currentThread().getId() + " reading:");
                for (Map.Entry<String, Integer> entry : syncMap.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        };
        
        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(writer);
        Thread t3 = new Thread(reader);
        
        t1.start();
        t2.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
    }
}
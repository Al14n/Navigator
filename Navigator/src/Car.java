import java.util.Random;
import java.util.concurrent.*;

public class Car implements Callable<Integer> {
    public Integer speed;
    public Integer rasstoyanie;

    public Integer call() throws InterruptedException {
        Thread.sleep(1000);
        Random random = new Random();

        return random.nextInt(30,100);

    }
    public void setSpeed() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();

        Future<Integer> future = service.submit(new Car());
        speed = future.get();

    }

}

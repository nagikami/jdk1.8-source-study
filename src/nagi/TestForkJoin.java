package nagi;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class TestForkJoin {
    public static void main(String[] args) throws Exception {
        ForkJoinTask<Integer> integerForkJoinTask = new RecursiveTask<Integer>() {
            @Override
            protected Integer compute() {
                return 1000;
            }
        };
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(integerForkJoinTask);
        System.out.println(integerForkJoinTask.get());
        forkJoinPool.shutdown();
    }
}

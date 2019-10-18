package com.gupaoedu.vip.pattern.test.container;

import java.util.concurrent.*;

public class ConcurrentExecutor {

    public static void execute(final RunHandler runhandler, int executeCount, int concurrentCount) throws Exception {
        final Semaphore semaphore = new Semaphore(concurrentCount);
        final CountDownLatch countDownLatch = new CountDownLatch(executeCount);

        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < executeCount; i++) {
            executor.execute(() -> {
                try {
                    semaphore.acquire();
                    runhandler.handler();
                    semaphore.release();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executor.shutdown();
    }


    public interface RunHandler{
        void handler();
    }

}

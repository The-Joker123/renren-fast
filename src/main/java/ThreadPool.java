import lombok.SneakyThrows;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author OverChat
 * @date
 */
public class ThreadPool {
    public static void main(String[] args) {

            MyThread myThread1=new MyThread("第"+"1"+"个");
            myThread1.run();
    }

}
     class MyThread implements Runnable {
         private String name;
         private  static int count=1;
         public MyThread(String name){
             this.name=name;
         }

         //随着任务数量不断上升，线程池会不断的创建线程，直到到达核心线程数10，就不创建线程了
         //这时多余的任务通过加入阻塞队列来运行，当超出阻塞队列长度+核心线程数时，
         //这时不得不扩大线程个数来满足当前任务的运行，这时就需要创建新的线程了（最大线程数起作用），上限是最大线程数30
         //那么超出核心线程数10并小于最大线程数30的可能新创建的这20个线程相当于是“借”的，
         //如果这20个线程空闲时间超过keepAliveTime，就会被退出
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                20,
                50,
                3,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(200),
                new ThreadPoolExecutor.DiscardPolicy());

         public static int getCount() {
             return count;
         }


         @SneakyThrows
         @Override
        public void run() {
            for ( int i = 1; i <=100; i++ ) {
                int x = i;
                executor.submit(() -> {
                    try {
                        Thread.sleep(10000);
                        System.out.println(count++);
                        System.out.println(name+"次数"+x+executor.toString());
                        System.out.println("结束"+"次数"+x+executor.toString());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                });
            }
        }

    }



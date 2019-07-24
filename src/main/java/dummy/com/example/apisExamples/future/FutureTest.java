package dummy.com.example.apisExamples.future;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class FutureTest {

    public static void main(String[] args ) {

            try {
                threadTimeTest();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

    }

    static ExecutorService executor = Executors.newFixedThreadPool(5);

    static String response1="asd";
    static String response2="ad";


    public static void threadTimeTest() throws InterruptedException, ExecutionException {
//        IntStream.range(0,3).forEach(x->{
//            executor.submit(()->{
//                System.out.println(LocalDateTime.now() + " - " + x);
//                try {
//                    System.out.println(dateTest(x) + " - " + x);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//        });

      executor.submit(()->response1=response1Fill()).get();
       executor.submit(()->response2=response2Fill()).get();

        System.out.println(response1 + " - " + response2);


    }


    public static String dateTest(long number) throws InterruptedException {
        Thread.sleep(number*1000);
        return ""+LocalDateTime.now();
    }

    public static String response1Fill(){
        return "Response 1 value "+LocalDateTime.now();
    }

    public static String response2Fill(){
        return "Response 2 value"+LocalDateTime.now();
    }


}

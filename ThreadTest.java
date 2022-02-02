public class ThreadTest {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        mt1.start();

        MyThread2 mt2 = new MyThread2();
        Thread thread = new Thread(mt2);
        thread.start();
    }
}

class MyThread1 extends Thread{
    @Override
    public void run(){
        System.out.println("원하는 실행코드");
    }
}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("원하는 실행코드");
    }
}
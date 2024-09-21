class MyThread extends Thread {
    public void run(){
        for (int i=0; i<10;i++){
            System.out.println("Executed by Child Thread");
        }
    }
}

class ThreadTest {
    public static void main(String[] args){
        MyThread mt = new MyThread();
        mt.start();

        for (int i=0; i<10;i++){
            System.out.println("Executed by Main Thread");
        }
    }
}
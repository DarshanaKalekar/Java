package MultiThreading;

class Thread1 extends Thread{
    public void run(){
        for (int i = 0; i<50 ;i++){
            System.out.println("Inside Child Thread");
        }
    }
}

public class CreateThread {
        public static void main(String[] args){
            Thread1 t =new Thread1();
            t.start();

            for (int i = 0; i<50; i++){
                System.out.println("Inside main thread");
            }
        }
}

package simple.thread.interrupt;

public class PrintThread extends Thread {
    @Override 
    public void run() { 
        try { 
            while(true) { 
                System.out.println("실행 중"); 
                Thread.sleep(200); 
            } 
        } catch (InterruptedException e) { 
            System.out.println("interrupted 발생"); 
            e.printStackTrace(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("자원 정리"); 
        System.out.println("실행 종료"); 
    }
}
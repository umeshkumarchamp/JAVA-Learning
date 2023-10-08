package Quiz_March;

class MyThread extends Thread {

public void run() {

try {

sleep(5000);

} catch (InterruptedException e) {

System.out.println("Exception " + e);

}

}

public static void main(String args[]) {

MyThread thread1 = new MyThread();

long startTime = System.currentTimeMillis();

thread1.start();

System.out.print("Time required to execute thread1 is "

+ (System.currentTimeMillis() - startTime));

}

}
package Quiz_March;

public class Concur7 {

public static void main(String ar[]) throws InterruptedException {

String str1 = new String("R1");

String str2 = new String("R2");

MyThrea thrd1 = new MyThrea("Firsr", str1, str2);

MyThrea thrd2 = new MyThrea("Second", str1, str2);

thrd1.start();

thrd1.join();

thrd2.start();

}

}

class MyThrea extends Thread {

private String First;

private String Second;

public MyThrea(String thrdname, String one, String two) {

super(thrdname);

First = one;

Second = two;

}

public void run() {

if (getName().equals("First")) {

synchronized (First) {

try {

Thread.sleep(4000);

} catch (InterruptedException E) {

E.printStackTrace();

}

synchronized (Second) {}

}

}

else {

synchronized (Second) {

try {

Thread.sleep(4000);

} catch (InterruptedException E) {

E.printStackTrace();

}

synchronized (First) {}

}

}

}

}
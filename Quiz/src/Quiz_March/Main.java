package Quiz_March;

class Main implements Runnable {

int k = 0;

public Main(int i) {

this.k = i;

}

public static void main(String[] args)

{

new Main(2).run();

new Main(1).run();

}

public void run() {

for(int i=0; i<k; i++) {

System.out.println("run() method...");

}

}

}
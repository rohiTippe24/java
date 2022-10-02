// Multi Threading in Java

class myClass1 extends Thread {
  // run(); is the abstract method of Thread class
public void run () {
while (true)
System.out.println("myClass ....1.....");
  }
}

class myClass2 implements Runnable {
  // run(); is the abstract method of Runnable interface
public void run () {
while (true)
System.out.println("myClass ....2.....");
  }
}

public class multiThreading {

public static void main (String[] args) {
myClass1 c1 = new myClass1();
myClass2 c2 = new myClass2();
Thread t = new Thread(c2);

// .start(); method is used to run thread method
c1.start(); 
t.start();

  }
}

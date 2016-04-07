package Model;

public class Task implements Runnable {

	   private volatile boolean isRunning = true;

	   public void run() {

	     while (isRunning) {
	         //do work
	     }
	   }

	   public void kill() {
	       isRunning = false;
	   }

}
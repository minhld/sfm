package applications.dummy;

import peerSimEngine.Simulator;

public class initiator extends Thread {
	public void run() {
		new Simulator().main(null);
	}
	
	public static void main(String args[]) {
		new initiator().start();
	}
}

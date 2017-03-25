package peersim;

import peersim.cdsim.CDProtocol;
import peersim.core.Node;
import peersim.vector.SingleValueHolder;

public class newSim extends Thread {
	public void run() {
		
	}
	
	
	class BasicBalance extends SingleValueHolder implements CDProtocol {

		public BasicBalance(String prefix) {
			super(prefix);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void nextCycle(Node node, int protocolID) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String args[]) {
		new newSim().start();
	}
}

package Methods1;

import Methods1.Calculator.cal;

public class Float_mul {

	public int b;
	public int a;

	class mul {
		float a;
		float b;

		void multiplication() {
			float c = a * b;
			System.out.println(c);
		}

		public static void main(String[] args) {
			Float_mul m1 = new Float_mul();
			m1.a = 2;
			m1.b = 6;
			m1.mul();

		}

	}

	public void mul() {
		// TODO Auto-generated method stub

	}
}

/*
 * static class cal { int a; int b;
 * 
 * void add() { int c = a + b; System.out.println(c); } }
 * 
 * public static void main(String[] args) { cal c1 = new cal(); c1.a = 5; //
 * Initialize a with a value c1.b = 10; // Initialize b with a value c1.add(); }
 * 
 * public void mul() { // TODO Auto-generated method stub
 * 
 * } }
 */

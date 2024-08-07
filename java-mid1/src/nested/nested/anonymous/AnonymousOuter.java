package nested.nested.anonymous;

import nested.nested.local.Printer;

public class AnonymousOuter {
	private int outInstanceVar = 3;

	public void process(int paramVar) {
		int localVar = 1;

		Printer printer = new Printer() {
			int value = 0;

			@Override
			public void print() {
				System.out.println("value = " + value);
				System.out.println("localVar = " + localVar);
				System.out.println("paramVar = " + paramVar);
				System.out.println("outInstanceVar = " + outInstanceVar);
			}
		};
		printer.print();
	}

	public static void main(String[] args) {
		AnonymousOuter main = new AnonymousOuter();
		main.process(1);
	}
}

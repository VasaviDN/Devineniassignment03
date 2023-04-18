package demo_Question03;

class Flower {
	public Flower getFlower() {
		System.out.println("Flower is the parent class");
		return new Flower();
	}
}

class Rose extends Flower {
	@Override
	public Rose getFlower() {
		System.out.println("Rose is a subclass of Flower");
		return new Rose();
	}
}

public class CovariantReturntypeDemo {
	public static void main(String[] args) {
		Flower flr = new Flower();
		flr.getFlower();

		Rose rose = new Rose();
		rose.getFlower();
	}
}

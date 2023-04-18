package demo_Question01;

public class GenericClassDemo<T> {
	private T name;

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name= " + name;
	}

	public static void main(String[] args) {
		GenericClassDemo<String> genericclass = new GenericClassDemo<>();
		genericclass.setName("Vasu");
		System.out.println(genericclass);
	}

}

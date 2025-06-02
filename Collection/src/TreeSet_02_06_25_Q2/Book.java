package TreeSet_02_06_25_Q2;

public record Book(String name,String author) implements Comparable<Book> {

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

}

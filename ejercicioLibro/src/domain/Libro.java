package domain;

public class Libro {

	// Atributos
	private Long isbn;
	private String title;
	private String author;
	private Integer nPages;

	// Constructores

	public Libro(Long isbn, String title, String author, Integer nPages) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.nPages = nPages;
	}

	public Libro() {

	}

	// Getters & Setters

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getnPages() {
		return nPages;
	}

	public void setnPages(Integer nPages) {
		this.nPages = nPages;
	}

	// toString

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", title=" + title + ", author=" + author + ", nPages=" + nPages + "]";
	}
	
	public void mostrar() {
		System.out.println("El libro " + title + ", con ISBN: " + isbn + ". Creado por el autor " + author + " tiene " + nPages + " paginas");
		System.out.println("--------------------------------------------------------------------------------------------------------");
	}

}
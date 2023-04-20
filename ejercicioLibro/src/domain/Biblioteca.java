package domain;

import java.util.Arrays;

public class Biblioteca {
	
	// Atributos	
	private Libro stand1 [];
	private Libro stand2 [];
	private Libro stand3 [];
	private Libro stand4 [];
	private Libro stand5 [];

	

	public Biblioteca() {
		this.stand1 = new Libro [10];
		this.stand2 = new Libro [10];
		this.stand3 = new Libro [10];
		this.stand4 = new Libro [10];
		this.stand5 = new Libro [10];
	}

	public Libro[] getstand1() {
		return stand1;
	}

	public void setstand1(Libro[] stand1) {
		this.stand1 = stand1;
	}

	public Libro[] getstand2() {
		return stand2;
	}

	public void setstand2(Libro[] stand2) {
		this.stand2 = stand2;
	}

	public Libro[] getstand3() {
		return stand3;
	}

	public void setstand3(Libro[] stand3) {
		this.stand3 = stand3;
	}

	public Libro[] getstand4() {
		return stand4;
	}

	public void setstand4(Libro[] stand4) {
		this.stand4 = stand4;
	}

	public Libro[] getstand5() {
		return stand5;
	}

	public void setstand5(Libro[] stand5) {
		this.stand5 = stand5;
	}

	@Override
	public String toString() {
		return "Biblioteca [stand1=" + Arrays.toString(stand1) + ", stand2=" + Arrays.toString(stand2)
				+ ", stand3=" + Arrays.toString(stand3) + ", stand4=" + Arrays.toString(stand4) + ", stand5="
				+ Arrays.toString(stand5) + "]";
	}
	
	// Funciones agregar libro a cada Stand
	public void addstand1(Libro libro) {
		for (int i=0; i< stand1.length; i++) {
			if (stand1[i] == null) {
				this.stand1[i] = libro;
				break;
			}
		}		
	}
	
	public void addstand2(Libro libro) {
		for (int i=0; i< stand2.length; i++) {
			if (stand2[i] == null) {
				this.stand2[i] = libro;
				break;
			}
		}		
	}
	
	public void addstand3(Libro libro) {
		for (int i=0; i< stand3.length; i++) {
			if (stand3[i] == null) {
				this.stand3[i] = libro;
				break;
			}
		}		
	}
	
	public void addstand4(Libro libro) {
		for (int i=0; i< stand4.length; i++) {
			if (stand4[i] == null) {
				this.stand4[i] = libro;
				break;
			}
		}		
	}
	
	public void addstand5(Libro libro) {
		for (int i=0; i< stand5.length; i++) {
			if (stand5[i] == null) {
				this.stand5[i] = libro;
				break;
			}
		}		
	}
	
	// Funcion mostrar libro segun el correspondiente stand
	public void showLibro(Long isbn) {
		
		for (int i=0; i< stand1.length; i++) {
			if (stand1[i] != null) {
				if (stand1[i].getIsbn().equals(isbn)) {
					System.out.println("El libro " + stand1[i].getTitle() + " se encuentra en el Stand 1 en la posicion " + i);
					break;
				}
			}
		}
		
		for (int i=0; i< stand2.length; i++) {
			if (stand2[i] != null) {
				if (stand2[i].getIsbn().equals(isbn)) {
					System.out.println("El libro " + stand2[i].getTitle() + " se encuentra en el Stand 2 en la posicion " + i);
					break;
				}
			}
		}
		
		for (int i=0; i< stand3.length; i++) {
			if (stand3[i] != null) {
				if (stand3[i].getIsbn().equals(isbn)) {
					System.out.println("El libro " + stand3[i].getTitle() + " se encuentra en el Stand 3 en la posicion " + i);
					break;
				}
			}
		}
		
		for (int i=0; i< stand4.length; i++) {
			if (stand4[i] != null) {
				if (stand4[i].getIsbn().equals(isbn)) {
					System.out.println("El libro " + stand4[i].getTitle() + " se encuentra en el Stand 4 en la posicion " + i);
					break;
				}
			}
		}
		
		for (int i=0; i< stand5.length; i++) {
			if (stand5[i] != null) {
				if (stand5[i].getIsbn().equals(isbn)) {
					System.out.println("El libro " + stand5[i].getTitle() + " se encuentra en el Stand 5 en la posicion " + i);
					break;
				}
			}
		}
	}
}
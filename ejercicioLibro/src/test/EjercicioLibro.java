package test;

import domain.Libro;
import domain.Biblioteca;
import java.util.Random;

public class EjercicioLibro {
	
	// Funcion genera entero aleatorio de 13 cifras
	
	public static Long randomNumberIsbn() {
		Random random = new Random();
		// International Standard Book Number (ISBN): 13 cifras
		Long randomNumberIsbn = random.nextLong(999999999999L + 1, 9999999999999L);
		return randomNumberIsbn;
	}
	
	// Funcion genera entero aleatorio de 3 cifras
	
	public static Integer randomNumberPages() {
		Random random = new Random();
		Integer randomNumberPages = random.nextInt(100, 999);
		return randomNumberPages;
	}

	public static void main(String[] args) {
		
		// Creacion de objetos

		Libro theHobbit = new Libro(randomNumberIsbn(), "The Hobbit", "J. R. R: Tolkien", randomNumberPages());
		theHobbit.mostrar();
		
		Libro fundacion = new Libro(randomNumberIsbn(), "Fundacion", "Isaac Asimov", randomNumberPages());
		fundacion.mostrar();
		
		Libro solaris = new Libro(randomNumberIsbn(), "Solaris", "Stanislaw Lem", randomNumberPages());
		
		Libro milNovecientosOchentaYCuatro = new Libro(randomNumberIsbn(), "1984", "George Orwell", randomNumberPages());
		
		Libro fahrenheit451 = new Libro(randomNumberIsbn(), "Fahrenheit 451", "Ray Bradbury", randomNumberPages());
		
		Libro dune = new Libro(randomNumberIsbn(), "Dune", "Frank Herbert", randomNumberPages());
		
		Libro unMundoFeliz = new Libro(randomNumberIsbn(), "Un mundo feliz", "Aldous Huxley", randomNumberPages());
		
		Libro yoRobot = new Libro(randomNumberIsbn(), "Yo robot", "Isaac Asimov", randomNumberPages());
		
		Libro elHombreEnElCastillo = new Libro(randomNumberIsbn(), "El hombre en el castillo", "Philip K. Dick", randomNumberPages());
		
		Libro elHombreIlustrado = new Libro(randomNumberIsbn(), "El hombre ilustrado", "Ray Bradbury", randomNumberPages());
		
		Libro elNombreDelViento = new Libro(randomNumberIsbn(), "El nombre del viento", "Patrick Rothfuss", randomNumberPages());
		
		Libro cancionDeHieloYFuego = new Libro(randomNumberIsbn(), "Cancion de hielo y fuego", "George R. R. Martin", randomNumberPages());
		
		Libro elSeñorDeLosAnillos = new Libro(randomNumberIsbn(), "El señor de los anillos", "J. R. R: Tolkien", randomNumberPages());
		
		Libro elTemorDeUnHombreSabio = new Libro(randomNumberIsbn(), "El temor de un hombre sabio", "Patrick Rothfuss", randomNumberPages());
		
		Libro elUltimoDeseo = new Libro(randomNumberIsbn(), "El ultimo deseo", "Andrzej Sapkowski", randomNumberPages());
		
		Biblioteca biblioteca = new Biblioteca();
		
		
		
		// Determinar que objeto tiene mas paginas
		
		if (theHobbit.getnPages() > fundacion.getnPages()) {
			System.out.println(theHobbit.getTitle() + " tiene mas paginas");
		} else if (theHobbit.getnPages() == fundacion.getnPages()){
			System.out.println(theHobbit.getTitle() + " y " + fundacion.getTitle() + " tienen la misma cantidad de paginas");
		} else {
			System.out.println(fundacion.getTitle() + " tiene mas paginas");
		}
		
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		// Agrego libros a estanterias
		
		biblioteca.addstand1(fundacion);
		biblioteca.addstand1(solaris);
		biblioteca.addstand1(milNovecientosOchentaYCuatro);
		biblioteca.addstand1(fahrenheit451);
		biblioteca.addstand1(dune);
		biblioteca.addstand1(unMundoFeliz);
		biblioteca.addstand1(yoRobot);
		biblioteca.addstand1(elHombreEnElCastillo);
		biblioteca.addstand1(elHombreIlustrado);
		biblioteca.addstand2(theHobbit);
		biblioteca.addstand2(elNombreDelViento);
		biblioteca.addstand2(cancionDeHieloYFuego);
		biblioteca.addstand2(elSeñorDeLosAnillos);
		biblioteca.addstand2(elTemorDeUnHombreSabio);
		biblioteca.addstand2(elUltimoDeseo);
		
		
		// Muestro libros por ISBN
		biblioteca.showLibro(fundacion.getIsbn());
		biblioteca.showLibro(solaris.getIsbn());
		biblioteca.showLibro(milNovecientosOchentaYCuatro.getIsbn());
		biblioteca.showLibro(fahrenheit451.getIsbn());
		biblioteca.showLibro(dune.getIsbn());
		biblioteca.showLibro(unMundoFeliz.getIsbn());
		biblioteca.showLibro(yoRobot.getIsbn());
		biblioteca.showLibro(elHombreEnElCastillo.getIsbn());
		biblioteca.showLibro(elHombreIlustrado.getIsbn());
		biblioteca.showLibro(theHobbit.getIsbn());
		biblioteca.showLibro(elNombreDelViento.getIsbn());
		biblioteca.showLibro(cancionDeHieloYFuego.getIsbn());
		biblioteca.showLibro(elSeñorDeLosAnillos.getIsbn());
		biblioteca.showLibro(elTemorDeUnHombreSabio.getIsbn());
		biblioteca.showLibro(elUltimoDeseo.getIsbn());
		
		
		
	}

}
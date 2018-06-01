package Clases;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the libros database table.
 * 
 */
@Entity
@Table(name="libros")

@NamedQueries
({
	@NamedQuery(name="Libro.findAll", query="SELECT l FROM Libro l"),
	@NamedQuery(name="Libro.findByAutor", query="SELECT L FROM Libro L WHERE L.autor = :parametroAutor")
})
public class Libro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=50)
	private String autor;

	@Column(nullable=false)
	private String fecha;

	@Column(nullable=false)
	private double precio;

	@Column(nullable=false, length=50)
	private String titulo;

	public Libro() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
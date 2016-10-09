package mis.middleware.practicas;

import java.math.BigDecimal;

public class Articulo {

	private int idarticulo;
	private String articulo;
	private String categoria;
	private BigDecimal precio;
	
	
	public Articulo(){
		
	}
	
	
	
	public Articulo(int idarticulo, String articulo, String categoria, BigDecimal precio) {
		super();
		this.idarticulo = idarticulo;
		this.articulo = articulo;
		this.categoria = categoria;
		this.precio = precio;
	}



	public int getIdarticulo() {
		return idarticulo;
	}
	public void setIdarticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	
	
}

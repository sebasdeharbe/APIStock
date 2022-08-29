package stock.Modelo;

public class Producto {
	private Integer oID; 
	private String oNombre; 
	private String oDescripcion; 
	private Float oPrecioCosto; 
	private Float oPrecioVenta; 
	
	public Producto(Integer id, String nombre, Float preciocosto) {
		this.oID = id; 
		this.oNombre = nombre;
		this.oPrecioCosto = preciocosto;
		this.oPrecioVenta = 0f; 
	}
	
	///Getters methods
	public Integer getID() {
		return this.oID;
	}
	public String getNombre() {
		return this.oNombre;
	}
	public String getDescripcion() {
		return this.oDescripcion;
	}
	public Float getPrecioCosto() {
		return this.oPrecioCosto;
	}
	public Float getPrecioVenta() {
		return this.oPrecioVenta;
	}
	
	///Setters methods
	public void setID() {
		System.out.println("No se puede modificar id");
	}
	public void setNombre(String nombre) {
		this.oNombre = nombre;
	}
	public void setDescripcion(String descripcion) {
		this.oDescripcion = descripcion;
	}
	public void setPrecioCosto(Float preciocosto) {
		this.oPrecioCosto = preciocosto;
	}
	public void setPrecioVenta(Float precioventa) {
		this.oPrecioVenta = precioventa; 
	}
	
	///methods
	public Boolean equals(Producto p) {
		Boolean retorno = false;
		if(this.oID == p.oID) retorno = true;
		return retorno; 
	}
	
	
	
	
}

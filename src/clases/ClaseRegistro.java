package clases;


public class ClaseRegistro {
	
	private int dni;
	private String nombre;
	private int telefono;
	private String correo;
	private int tipoDeEquipo;
	private int macaDeEquipo;
	private String numeroDeSerie;
	private String fechaDeIngreso;
	private String fechaDeEntrega;
	private double precio;
	
	public static double acumulador=0;
	
	public ClaseRegistro(int dni, String nombre, int telefono, String correo, int tipoDeEquipo, int macaDeEquipo,
			String numeroDeSerie, String fechaDeIngreso, String fechaDeEntrega, double precio) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.tipoDeEquipo = tipoDeEquipo;
		this.macaDeEquipo = macaDeEquipo;
		this.numeroDeSerie = numeroDeSerie;
		this.fechaDeIngreso = fechaDeIngreso;
		this.fechaDeEntrega = fechaDeEntrega;
		this.precio = precio;
	}

	public int getDni() {
		return dni;
	}




	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getTipoDeEquipo() {
		return tipoDeEquipo;
	}

	public void setTipoDeEquipo(int tipoDeEquipo) {
		this.tipoDeEquipo = tipoDeEquipo;
	}

	public int getMacaDeEquipo() {
		return macaDeEquipo;
	}

	public void setMacaDeEquipo(int macaDeEquipo) {
		this.macaDeEquipo = macaDeEquipo;
	}

	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public String getFechaDeEntrega() {
		return fechaDeEntrega;
	}

	public void setFechaDeEntrega(String fechaDeEntrega) {
		this.fechaDeEntrega = fechaDeEntrega;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double totalIngresos() {
		return acumulador;
	}

	
	//metodos
		//equipo
	public String equipoelegido(int x) {
		switch (x) {
		case 0:
			return "Laptop";

		default:
			return "Computadora de escritorio";
		}
	}
	
		//marca
	public String marcaElegida(int y) {
		switch (y) {
		case 0:
			return "HP";
		case 1:
			return "Lenovo";
		case 2:
			return "Asus";
		case 3:
			return "Acer";
		case 4:
			return "MSI";
		default:
			return "Huawei";
		}

	}
} 

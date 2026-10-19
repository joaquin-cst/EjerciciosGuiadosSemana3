package negociosDigitales;

public class Producto {
    private String nombre;
    private double precio;
    private String categoria;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Categoría: "+categoria);
    }

    void mostrarCategoria() {
        System.out.println("La categoría de "+ nombre + " es " + categoria);
    }

    public void mostrarPrecio () {
        System.out.println("El precio de "+ nombre + " es " + categoria);
    }

    public void setNombre (String nombre) {
        if (nombre!=null)
            if (nombre.isBlank()==false)
                this.nombre=nombre;
    }

    public String getNombre () {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio<0)
            precio=0;
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria!=null)
            if (categoria.isBlank()==false)
                this.categoria=categoria;
    }

    public Producto (String nombre, double precio, String categoria) {
        setNombre(nombre);
        setPrecio(precio);
        this.categoria=categoria;

    }


    public Producto () {

    }
}

package ar.com.xeven;

public class Elemento {

    //atributos
    private String nombreProducto;
    private Double precio;
    private Integer cantidad;

    //constructor
    public Elemento(String nombreProducto, Double precio, Integer cantidad) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //getters y setters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    //toString
    @Override
    public String toString() {
        //pvp: precio de venta al publico
        return this.nombreProducto+" PVP "+String.format("%.2f", this.precio)+" - "
                +" Unidades: "+this.cantidad+" - "
                +" Subtotal: "+String.format("%.2f", this.precio*this.cantidad);
    }
}

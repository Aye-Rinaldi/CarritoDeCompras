package ar.com.xeven;
/*
Una empresa de venta por internet de productos electrónicos nos ha encargado
implementar un carrito de la compra. Crea la clase Carrito. Al carrito se le
pueden ir agregando elementos que se guardarán en una lista.
Ademas cuando se intente agregar un elemento al carrito, se debe comprobar si ya existe el producto
y, en tal caso, se incrementa el número de unidades sin añadir un nuevo
elemento.
 */

public class Main {

    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        //agrego elementos al carrito
        carrito.agregarElemento(new Elemento("Tarjeta SD 64Gb",19.95,2));
        carrito.agregarElemento(new Elemento("Canon EOS 2000D",449.00,1));
        //lo muestro
        System.out.println(carrito);

        System.out.println("Hay "+carrito.numeroDeElementos()+" productos en la cesta.");
        System.out.println("El total asciende a: "+String.format("%.2f",carrito.importeTotal())+" $");

        System.out.println("\nContinua la compra...\n");
        carrito.agregarElemento(new Elemento("Samsung Galaxy Tab",199.00,3));
        carrito.agregarElemento(new Elemento("Tarjeta SD 64Gb",19.95,1));
        System.out.println(carrito);
        System.out.println("Ahora hay: "+carrito.numeroDeElementos()+" productos en la cesta");
        System.out.println("El total asciende a "+String.format("%.2f",carrito.importeTotal())+" $");





    }
}

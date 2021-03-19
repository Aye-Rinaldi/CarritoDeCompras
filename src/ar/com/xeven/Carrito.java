package ar.com.xeven;

import java.util.ArrayList;

public class Carrito {

    //atributos
    ArrayList<Elemento> elementos = new ArrayList<Elemento>();

    //metodos
    //agregar elementos al carrito
    public void agregarElemento(Elemento elemento){
        boolean encontrado = false;

        for (Elemento el:elementos){
            if (el.getNombreProducto().equals(elemento.getNombreProducto())){
                el.setCantidad(el.getCantidad() + elemento.getCantidad());
                encontrado = true;
            }
        }
        if (!encontrado)
            elementos.add(elemento);
    }

    public int numeroDeElementos(){
        return elementos.size();
    }

    //metodo que calcula el precio total
    public Double importeTotal(){
        double total = 0.0;
        for (Elemento elemento:elementos)
            total += elemento.getPrecio()*elemento.getCantidad();
        return total;
    }

    //toString
    @Override
    public String toString() {
        String pinta = "Contenido del carrito\n==========================================================================\n";
        for (Elemento elemento:elementos)
            pinta += elemento + "\n";
        return pinta;

    }
}

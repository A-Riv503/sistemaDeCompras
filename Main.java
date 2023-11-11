import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*Enunciado: Crea un sistema de compras en Java. Debes tener una clase Producto con atributos como nombre, precio y cantidad en stock. Luego, crea una clase CarritoDeCompras
     que permita agregar productos, calcular el total de la compra y mostrar los productos en el carrito.*/
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int elegirOpcion, repetirPrograma;
        CarritoDeCompras carrito=new CarritoDeCompras();
        Scanner scan=new Scanner(System.in);
        ArrayList<Producto> informacionProductos=new ArrayList<>();//el lugar donde guardaremos todos los productos
        ArrayList<Producto> canasta=new ArrayList<>();//el lugar donde guardaremos los productos que compraremos




    do{
        System.out.println("Bienvenido al sistema de compra");
        System.out.println("elija una opcion del menu:\n1-agregar productos al stock\n2-agregar productos al carrito\n3-calcular total de compra\n4-mostrar producto");
        elegirOpcion=scan.nextInt();

        switch (elegirOpcion){
            case 1:
                carrito.agregarProducto(informacionProductos);
                break;
            case 2:
                carrito.productoCarrito(informacionProductos,canasta);
                break;

        }

        System.out.println("desea repetir el programa 1-si 2-no");
        repetirPrograma=scan.nextInt();

    }while(repetirPrograma==1);

    }
}
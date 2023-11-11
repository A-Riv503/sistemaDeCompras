import java.util.ArrayList;
import java.util.Scanner;

public class CarritoDeCompras {
    Scanner scan=new Scanner(System.in);
    public void agregarProducto(ArrayList<Producto> informacionProducto){
        int cantidad;//cantidad de productos ha hagarrar
        String nombreProducto;
        int precioProducto,cantidadProductos;

        System.out.println("ingrese la cantidad de productos que desea agregar");
        cantidad=scan.nextInt();
        scan.nextLine();

        for(int i=0;i<cantidad;i++){
            System.out.println("ingrese el nombre de sus productos");
            nombreProducto=scan.nextLine();
            System.out.println("ingrese el precio de ese producto");
            precioProducto=scan.nextInt();
            scan.nextLine();
            System.out.println("ingrese la cantidad de productos que hay en stock");
            cantidadProductos=scan.nextInt();
            scan.nextLine();

            informacionProducto.add(new Producto(nombreProducto,precioProducto,cantidadProductos));
        }
    }

    public void agregarProductoAlCarrito(ArrayList<Producto> informacionProducto,ArrayList<Producto> canasta){
        int agregarOtroProducto; //repetir para agregar otro producto al carrito;
        String nombreDeProducto;
        //Producto data=informacionProducto.get();
        int productoCantidad; // despues preguntaremos la cantidad que quiere agregar a cada producto;


        do {
            System.out.println("que producto desea agregar");
            nombreDeProducto = scan.nextLine();
            int index = 0;

        /*for(int i=0;i<informacionProducto.size();i++){
            Producto data=informacionProducto.get(i);

            System.out.println(data.nombrDelProducto);

            if(data.nombrDelProducto.equals(nombreDeProducto)){//si el producto registrado es igual al que se busca
                System.out.println("tenemos "+data.cantidadDeProductos+" disponibles");//mencionamos la cantidad en stock
                System.out.println("cuantas unidades de este producto desea agregar");
                productoCantidad=scan.nextInt();//guardamos la cantidad de productos que el usuario quiere

                if(productoCantidad>data.cantidadDeProductos){//si la cantidad que ingresa el usuario es mayor a la de stock
                    System.out.println("no hay suficiente producto en stock cambie la cantidad");
                }else{
                    canasta=(ArrayList<Producto>) informacionProducto.clone(); //guardar los productos que el usuario compra en un carrito o canasta
                }


            }else{
                System.out.println("ese producto no existe intentelo nuevamente");
                agregarOtroProducto=1;
            }
        }*/
            Producto data = informacionProducto.get(index);

            System.out.println(data.nombrDelProducto);

            if (data.nombrDelProducto.equals(nombreDeProducto)) {//si el producto registrado es igual al que se busca
                System.out.println("tenemos " + data.cantidadDeProductos + " disponibles");//mencionamos la cantidad en stock
                System.out.println("cuantas unidades de este producto desea agregar");
                productoCantidad = scan.nextInt();//guardamos la cantidad de productos que el usuario quiere

                if (productoCantidad > data.cantidadDeProductos) {//si la cantidad que ingresa el usuario es mayor a la de stock
                    System.out.println("no hay suficiente producto en stock cambie la cantidad");
                } else {
                    canasta = (ArrayList<Producto>) informacionProducto.clone(); //guardar los productos que el usuario compra en un carrito o canasta
                }


            } else {
                System.out.println("ese producto no existe intentelo nuevamente");
                agregarOtroProducto = 1;
            }


            System.out.println("desea agregar otro producto 1-si 2-no");
            agregarOtroProducto = scan.nextInt();

        } while (agregarOtroProducto == 1);

    }


    public void productoCarrito(ArrayList<Producto> informacionProducto,ArrayList<Producto> canasta){
        int agregarOtroProducto; //repetir para agregar otro producto al carrito;
        String productoCanasta;
        //Producto data=informacionProducto.get();
        int productoCantidad; // despues preguntaremos la cantidad que quiere agregar a cada producto;
        int index=0;
        Producto data = informacionProducto.get(index);

     do{
         System.out.println("que producto desea agregar al carrito");
         productoCanasta = scan.nextLine();

        switch (data.nombrDelProducto){
            case productoCanasta:
                System.out.println("tenemos " + data.cantidadDeProductos + " disponibles");//mencionamos la cantidad en stock
                System.out.println("cuantas unidades de este producto desea agregar");
                productoCantidad = scan.nextInt();//guardamos la cantidad de productos que el usuario quiere

                if (productoCantidad > data.cantidadDeProductos) {//si la cantidad que ingresa el usuario es mayor a la de stock
                    System.out.println("no hay suficiente producto en stock cambie la cantidad");
                } else {
                    canasta = (ArrayList<Producto>) informacionProducto.clone(); //guardar los productos que el usuario compra en un carrito o canasta
                }
            break;
        }

         System.out.println("desea agregar otro producto 1-si 2-no");
         agregarOtroProducto = scan.nextInt();
         scan.nextLine();

     }while(agregarOtroProducto==1);


    }
}

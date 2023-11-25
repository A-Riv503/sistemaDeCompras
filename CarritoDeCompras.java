import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class CarritoDeCompras {

      List <Stock> addProductToShopCar=new ArrayList<>();

      public void addToShopCar(Stock product){
          addProductToShopCar.add(product);
      }

    public void showAllProduct() {
        for (Stock product : addProductToShopCar) {
            System.out.println(product);
        }
    }
    /*public void addProduct(ArrayList<Producto> informationProducts){
        int amount;//cantidad de productos ha hagarrar
        String productName;
        int productPrice,productQuantity;

        System.out.println("ingrese la cantidad de productos que desea agregar");
        amount=scan.nextInt();
        scan.nextLine();

        for(int i=0;i<amount;i++){
            System.out.println("ingrese el nombre de sus productos");
            productName=scan.nextLine();
            System.out.println("ingrese el precio de ese producto");
            productPrice=scan.nextInt();
            scan.nextLine();
            System.out.println("ingrese la cantidad de productos que hay en stock");
            productQuantity=scan.nextInt();
            scan.nextLine();

            informationProducts.add(new Producto(productName,productPrice,productQuantity));
        }
    }

    public void productBasket(ArrayList<Producto> informationProducts, ArrayList<Producto> basket){
        int addAnotherProduct; //repetir para agregar otro producto al carrito;
        String productoCanasta;
        //Producto data=informacionProducto.get();
        int productQuantity; // despues preguntaremos la cantidad que quiere agregar a cada producto;
        int index=0;
        Producto data = informationProducts.get(index);

        do {
            System.out.println("Que producto desea agregar al carrito");
            productoCanasta = scan.nextLine();

            for (Producto producto : informationProducts) {
                if (producto.productName.equals(productoCanasta)) {
                    System.out.println("Tenemos " + producto.productQuantity + " disponibles");
                    System.out.println("Cuantas unidades de este producto desea agregar");
                    productQuantity = scan.nextInt();

                    if (productQuantity > producto.productQuantity) {
                        System.out.println("No hay suficiente producto en stock, cambie la cantidad");
                    } else {
                        // Agregar el producto al carrito solo si la cantidad es suficiente
                        basket.add(new Producto(producto.productName, producto.productPrice, productQuantity));//eleccion de productos del usuario
                        producto.productQuantity -= productQuantity; // Actualizar la cantidad en stock
                    }
                    break; // Salir del bucle for una vez que se ha encontrado el producto
                }
            }

            System.out.println("Desea agregar otro producto 1-Si 2-No");
            addAnotherProduct = scan.nextInt();
            scan.nextLine();

        } while (addAnotherProduct == 1);


    }

    public void shoppingReceipt(ArrayList<Producto> basket){
        Producto finishPrice;
        for(Producto producto : basket){
            basket.get(producto.productPrice);

        }
        //System.out.println("el precio final es "+finishPrice);
    }*/
}

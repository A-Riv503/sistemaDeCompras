import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*Enunciado: Crea un sistema de compras en Java. Debes tener una clase Producto con atributos como nombre, precio y cantidad en stock. Luego, crea una clase CarritoDeCompras
     que permita agregar productos, calcular el total de la compra y mostrar los productos en el carrito.*/

    /* */
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int chooseOption, repeatProgram;
        CarritoDeCompras shoppingCar=new CarritoDeCompras();//acceder a carrito de compras
        Scanner scan=new Scanner(System.in);
        ArrayList<Producto> informationProducts=new ArrayList<>();//el lugar donde guardaremos todos los productos
        ArrayList<Producto> basket=new ArrayList<>();//el lugar donde guardaremos los productos que compraremos

        SistemaStock Stocksystem=new SistemaStock();
        Stock stock;
        String productName;;
        int productPrice;
        int productQuantity;




    do{
        System.out.println("Bienvenido al sistema de compra");
        chooseOption=scan.nextInt();
        scan.nextLine();

        switch (chooseOption){
            case 1:
                System.out.println("ingrese el nombre");
                productName=scan.nextLine();
                System.out.println("ingrese el precio");
                productPrice=scan.nextInt();
                System.out.println("ingrese la cantidad");
                productQuantity=scan.nextInt();
                scan.nextLine();
                stock=new Stock(productName,productPrice,productQuantity);
                Stocksystem.addToStock(stock);
                break;
            case 2:
                Stocksystem.showAllProduct();
                break;
            case 3:
                deleteProduct();
                break;
        }

        System.out.println("desea repetir el programa 1-si 2-no");
        repeatProgram=scan.nextInt();

    }while(repeatProgram==1);

    }

    public static void deleteProduct(){
        int selectTypeDelete;
        String nameDelete;
        SistemaStock stockSistem=new SistemaStock();

        Scanner scan=new Scanner(System.in);

        System.out.println("Elija de que manera quiere eliminar productos de stock 1-eliminar producto por nombre 2-eliminar toda la stock");
        selectTypeDelete=scan.nextInt();
        scan.nextLine();

        switch (selectTypeDelete){
            case 1:
                System.out.println("ingrese el nombre del producto que desea eliminar ");
                nameDelete=scan.nextLine();
                System.out.println(stockSistem.addProductToStock);

            for(Stock stock: stockSistem.addProductToStock){



                /*if(stockSistem.addProductToStock.equals(nameDelete)){
                    for(Stock stock: stockSistem.addProductToStock){
                        stockSistem.addProductToStock.remove(stock);
                    }
                }else{
                    System.out.println("el producto ingresado no se encuentra en stock");
                }*/

            }

            break;
        }
    }
}
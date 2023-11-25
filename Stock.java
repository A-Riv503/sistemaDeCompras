public class Stock {

    String productName;;
    int productPrice;
    int productQuantity;

    public Stock(String productName,int productPrice,int productQuantity){
        this.productName=productName;
        this.productPrice=productPrice;
        this.productQuantity =productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Stock\nnombre: "+productName+"\nprecio: "+productPrice+"\ncantidad: "+productQuantity;
    }
}

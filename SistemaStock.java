import java.util.ArrayList;
import java.util.List;

public class SistemaStock {
    List<Stock> addProductToStock=new ArrayList<>();
    public void addToStock(Stock stock){
        addProductToStock.add(stock);
        System.out.println(addProductToStock);

    }

    public void showAllProduct(){
        for(Stock stock: addProductToStock){
            System.out.println(stock);
        }
    }

    public Stock searchProduct(String nameProduct){

        for(Stock stock: addProductToStock){
            if(stock.productName.equals(nameProduct)){
                return stock;
            }
        }
        return null;
    }
}

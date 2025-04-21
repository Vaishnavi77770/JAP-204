import java.util.Vector;
class product{
    String name;
    int price;
    String category;
    public product(String name,int price,String category){
        this.name=name;
        this.price=price;
        this.category=category;
    }
}

public class Onlineproductmanager {
    private Vector<product> inventory;
    public Onlineproductmanager(){
        inventory=new Vector<>();

    }
    public void addproduct(String name,int price,String category){
        product product=new product(name,price,category);
        inventory.add(product);

    }
    public void removeproduct(String name){
        for(int i=0;i< inventory.size();i++){
            if(inventory.get(i).name.equalsIgnoreCase(name)){
                inventory.remove(i);
                break;
            }
        }
    }
    public void displayInventory(){
        System.out.println("inventory");
        for(product product:inventory){
            System.out.println("name :"+product.name+"price:"+product.price+"category:"+product.category);
        }
    }
    public static void main(String[] args){
        Onlineproductmanager manager= new Onlineproductmanager();
        manager.addproduct("shirt,", 50,"clothing,");
        manager.addproduct("phone,",1000000,"electronics,");
        manager.displayInventory();
        manager.removeproduct("shirt");
        manager.displayInventory();
    }
}

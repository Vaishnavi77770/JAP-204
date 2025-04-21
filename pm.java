import java.util.*;

class Pharmacy {
    int id;
    String name;
    boolean quantityInStock;
    int price;

    public Pharmacy(int id, String name, boolean quantityInStock, int price) {
        this.id = id;
        this.name = name;
        this.quantityInStock = true;
        this.price = price;
    }
}

public class pm {
    private ArrayList<Pharmacy> invt;

    public pm() {
        this.invt = new ArrayList<>();
    }

    void adds(int id, String name, boolean quantityInStock, int price) {
        Pharmacy pro = new Pharmacy(id, name, quantityInStock, price);
        invt.add(pro);
    }

    void display() {
        System.out.println("ID\tName\tIn Stock\tPrice");
        for (Pharmacy i : invt) {
            System.out.println(i.id + "\t" + i.name + "\t" + i.quantityInStock + "\t\t" + i.price);
        }
    }

    void delete(String name) {
        for (int i = 0; i < invt.size(); i++) {
            if (invt.get(i).name.equalsIgnoreCase(name)) {
                invt.remove(i);
                break;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        pm o = new pm();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter product details: id, name, quantity in stock (true/false), price");
            int id = sc.nextInt();
            String name = sc.next();
            boolean quantityInStock = sc.nextBoolean();
            int price = sc.nextInt();
            o.adds(id, name, quantityInStock, price);
        }

        System.out.println("Enter name of product to delete:");
        String delName = sc.next();
        o.delete(delName);

        System.out.println("\nInventory:");
        o.display();
    }
}

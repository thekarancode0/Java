package inventory.management;

public class Main {
    public static void main(String[] args) {
        Inventory owner = new Inventory("Karan Kumar", "Gopalganj");
        owner.addItem("Paper",25000);
        owner.addItem("MatchBox",1000);
        owner.addItem("Pen",1000);
        owner.addItem("Chair",400);
        owner.listAllItems();
        owner.checkStock("Pen");
        owner.checkStock("Pencil");
        System.out.println("-------------------------");
        try{
            owner.removeItem("MatchBox",00);

        }catch (ItemNotFoundException | InvalidQuantityException e){
            System.out.println("Error: " + e.getMessage());
        }
        owner.listAllItems();
    }
}

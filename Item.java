public class Item {
    private String item;

    private String itemDescription;

    public Item(String item, String ItemDespription){
        this.item = item;
        this.itemDescription = ItemDespription;
    }
    public Item (){
        Item item1 = new Item ("waterbottle", "Take the waterbottle");
        Item item2 = new Item ("lamp", "Take the lamp");
        Item item3 = new Item ("key", "Take the key");
        Item item4 = new Item ("sword", "Take the sword");
        Item item5 = new Item ("plate", "Take the plate");
        Item item6 = new Item ("book", "Take the book");
        Item item7 = new Item ("remote", "Take the remote");
        Item item8 = new Item ("towel", "Take the towel");
        Item item9 = new Item ("pilow", "Take the pillow");

    }
public String getItem(){
        return item;
}
public String getItemDespription(){
        return itemDescription;
}
}

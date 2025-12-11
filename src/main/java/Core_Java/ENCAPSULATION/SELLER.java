package Core_Java.ENCAPSULATION;
class products{
    private int product_code;
    private String product_name;
    private int quantity;
    private float price;

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
public class SELLER {
    public static void main(String[] args) {
        products pp=new products();
        pp.setProduct_code(1010);
        pp.setProduct_name("Wheat");
        pp.setQuantity(150);
        pp.setPrice(150.5f);
        System.out.println(
                "PRODUCT CODE "+pp.getProduct_code()+"\n"+
                "PRODUCT NAME"+pp.getProduct_name()+"\n"+
                        "PRODUCT QUANTITY"+pp.getQuantity()+"\n"+
                        "PRODUCT PRICE"+pp.getPrice()


        );

    }
}

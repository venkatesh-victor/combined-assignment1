public class Product {

    String productName;
    int quantity;
    boolean isLarge;
    float exactWeight;
    char brandLetter;

    public static void main(String[] args) {

        Product prod1 = new Product();
        System.out.println(prod1.productName);
        System.out.println(prod1.quantity);
        System.out.println(prod1.isLarge);
        System.out.println(prod1.exactWeight);
        System.out.println(prod1.brandLetter);

    }
    
}

public class Main {

    private static Product expensiveItem( Product p1, Product p2){
        return p1.getPrice() > p2.getPrice() ? p1 : p2;
    }

    private static Product biggestQuantity(Product p1, Product p2){
        return (p1.getQuantity() > p2.getQuantity()) ? p1 : p2;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Apple", 10, 5);
        Product product2 = new Product("Banana", 30, 10);
        Product product3 = new Product("Potato", 5, 50);
        Product product4 = new Product("Watermelon", 5, 20);

        Product expensiveproduct = expensiveItem(product1, expensiveItem(product2, expensiveItem(product3, product4)));
        System.out.println("The most expensive item: "+expensiveproduct.getName()+" "+expensiveproduct.getQuantity());

        Product biggestquantityproduct = biggestQuantity(product1, biggestQuantity(product2, biggestQuantity(product3, product4)));
        System.out.println("The biggest quantity item: "+biggestquantityproduct.getName());
    }
}

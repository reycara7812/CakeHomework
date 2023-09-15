package hw2;

public class Tester {
    public static void main(String[] args) {
        WeddingCake makailasWedding = new WeddingCake("vallilla");
        makailasWedding.setTiers(5);




       makailasWedding.setPrice(49.95);
        System.out.println("Birthday cake flavor: " + makailasWedding.getFlavor());
        System.out.println("Birthday cake price: " + makailasWedding.getPrice());




    }
}

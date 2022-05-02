import java.time.LocalDateTime;

public class Invoice {
    String partNumber;
    String description;
    int quantity;
    double price;

    // constructor
    public Invoice(String partNumber, String description, int quantity, double price){
        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotal() {
        return this.quantity * this.price;
    }

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println("\n\t\t\t\t\t\tINVOICE\n\n\t\tAuthor:\t\tLISSU, PHILIPO JULIUS\n\t\tService:\tBM MINI-MARKET");
        System.out.println("\t\tDue Date:\t" + date);
        System.out.println("\n\t\tInvoice For:\tALEX SANCHEZ\n========================================================================\n");

        Invoice chocolate = new Invoice("1046", "KitKat Chocolate", 3, 3.1);
        Invoice spray = new Invoice("1047", "Body Spray: Dark Temptation", 2, 4.8);
        System.out.println("\t\tPartNumber\t\t\tDescription\t\t\tPrice\t\t\tTotal");
        System.out.println("\t--------------------------------------------------------------------");
        System.out.println("\t\t" + chocolate.partNumber + "\t\t\t\t\t" + chocolate.description + "\t\t\t" + chocolate.price + "\t\t\t" + chocolate.getTotal());
        System.out.println("\t\t" + spray.partNumber + "\t\t\t\t\t" + spray.description + "\t\t\t" + spray.price + "\t\t\t" + spray.getTotal());
    }
}

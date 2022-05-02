public class Pencil {
    //instance variables
    String color = "Red";
    int length = 5;
    double price = 50;

    //method to display
    void display(){
        System.out.println("The color of the pencil is : " + color);
        System.out.println("The Length of the pencil is : " + length + "cm");
        System.out.println("The Price of the pencil is : " + price + "$");
    }

    public static void main(String[] args){
        Pencil Hb = new Pencil();
        Hb.display();
    }
}

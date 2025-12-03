package OOP;

public class oop {
    public static void main(String[] args) {        
        Book book = new Book();
        book.name = "Java Programming";
        House house = new House(); 
        house.name = "My House"; 
        Tree tree = new Tree();
        tree.name = "Oak Tree";
        book.info();
        System.out.println("Book Name: " + book.name);
        house.info();
        System.out.println("House Name: " + house.name);
        tree.info();
        System.out.println("Tree Name: " + tree.name);
    }    

}

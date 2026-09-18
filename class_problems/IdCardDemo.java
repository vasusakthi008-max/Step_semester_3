package class_problems;
class IdCard {
    String name;
    int booksIssued;

    // Constructor
    IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
}

public class IdCardDemo {
    public static void main(String[] args) {

        // First object
        IdCard ravi = new IdCard("Ravi", 0);

        // Second variable points to the same object
        IdCard duplicate = ravi;

        // Change through second variable
        duplicate.booksIssued = 3;

        // Third separate object
        IdCard separate = new IdCard("Ravi", 3);

        // Output
        System.out.println("Ravi's booksIssued (via first variable): "
                + ravi.booksIssued);

        System.out.println("duplicate == ravi: "
                + (duplicate == ravi));

        System.out.println("separate == ravi: "
                + (separate == ravi));
    }
}
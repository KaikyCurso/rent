import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rent[] rents = new Rent[10];

        int n;
        while (true) {
            System.out.print("How many rooms will be rented? ");
            n = input.nextInt();

            if (n < 1 || n > rents.length){
                System.out.printf("Room %d does not exist", n);
                continue;
            }
            break;
        }

        for (int i = 0; i < n; i++){
            System.out.println("\nRent #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = input.nextLine();
            input.nextLine(); //Cleaning buffer

            System.out.print("Email: ");
            String email = input.nextLine();

            while (true){
                System.out.print("Room: ");
                int room = input.nextInt();

                if (room < 0 || room >= rents.length) {
                    System.out.printf("Room %d does not exist", n);
                }
                else if (rents[room] != null){
                    System.out.println("This room is occupied");
                }
                else{
                    rents[room] = new Rent(name, email, room);
                    break;
                }
            }
        }

        System.out.println("\nBusy rooms: ");
        for (Rent rent : rents){
            if (rent != null) {
                System.out.println(rent);
            }
        }

        input.close();
    }
}
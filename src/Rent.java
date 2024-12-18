public class Rent {
    String name;
    String email;
    final int room;

    public Rent(String name, String email, int room){
        this.name = name;
        this.email = email;
        this.room = room;
    }

    @Override
    public String toString() {
        return String.format("%d: %s, %s", this.room, this.name, this.email);
    }
}

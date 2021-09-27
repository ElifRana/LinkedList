import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> name = new LinkedList<>();

        name.add("Elif");
        name.add("Rana");
        name.addFirst("Taha");
        name.addLast("Gülsena");

        System.out.println("LinkedList: " + name);
        System.out.println("İLk deger: " + name.getFirst());
        System.out.println("Son deger: " + name.getLast());
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author storm1 = new Author("Александр ", " Островский");
        Author warAndPeace1 = new Author("Лев", "Толстой");

        Book storm = new Book("Гроза", 1859, "Островский");
        Book warAndPeace = new Book("Война и мир", 1867, "Толстой");
        storm.setDate(1860);
    }
}


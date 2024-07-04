//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Book storm = new Book("Гроза", 1859, "Островский");
            Book warAndPeace = new Book("Война и мир", 1867, "Толстой");
            storm.nameBook = "Гроза";
            storm.date = 1859;
            storm.author = "Островский";
            warAndPeace.nameBook = "Война и мир";
            warAndPeace.date = 1867;
            warAndPeace.author = "Толстой";
            System.out.println("Название: " + storm.nameBook + ", год написания - " + storm.date + ", автор: " + storm.author);
            System.out.println("Название: " + warAndPeace.nameBook + ", год написания - " + warAndPeace.date + ", автор: " + warAndPeace.author);
            storm.setDate(1860);
            System.out.println("storm.getDate() = " + storm.getDate());

            Author storm1 = new Author("Александр ", " Островский");
            Author warAndPeace1 = new Author("Лев", "Толстой");
            storm1.NameAuthor = "Александр";
            storm1.FamousAuthor = "Островский";
            System.out.println("Автор: " + storm1.NameAuthor + " " + storm1.FamousAuthor);
            System.out.println("Автор: " + warAndPeace1.NameAuthor + " " + warAndPeace1.FamousAuthor);
            warAndPeace1.NameAuthor = "Лев";
            warAndPeace1.FamousAuthor = "Толстой";
        }
}

public class Main {
    public static void main(String[] args) {
        //Задание №1 (1-7 пункт)
        System.out.println("Задание №1 (1-7 пункт)");
        Author author = new Author("Александр", "Пушкин");
        Author author2 = new Author("Уильям", "Шекспира");
        Book book = new Book("Капитанская Дочка", 1836, author);
        Book book2 = new Book("Ромео и Джульетта", 1597, author2);
        Book book3 = new Book("Ромео и Джульетта", 1598, author2);
        System.out.println(author.getfirstName() + " " + author.getsecondName() + " - ''" + book.getName() + "'' "  + book.getpublicationYear() + " год.");
        System.out.println(author2.getfirstName() + " " + author2.getsecondName() + " - ''" + book2.getName() + "'' "  + book2.getpublicationYear() + " год.");
        ////////////////////////
        System.out.println(2);
        System.out.println("\nСравниваем книги book2 & book3");
        System.out.println("hashCode book2 = " + book2.hashCode());
        System.out.println("hashCode book3 = " + book3.hashCode());
        System.out.println("Результат сравнения equals: " + book2.equals(book3));
        book2.setpublicationYear(1598);
        System.out.println("\nЭту книгу переиздали, теперь:");
        System.out.println(book2);
        System.out.println("Сравниваем книги book2 & book3");
        System.out.println("hashCode book2 = " + book2.hashCode());
        System.out.println("hashCode book3 = " + book3.hashCode());
        System.out.println("Результат сравнения equals: " + book2.equals(book3));
    }

}
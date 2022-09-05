public class Main {
    public static void main(String[] args) {
        var author1 = new Author("Иван", "Тургенев");
        var author2 = new Author("Михаил", "Лермонтов");
        Book one = new Book("Муму", author1, 1852);
        Book two = new Book("Бородино", author2, 1837);
        one.setYear(1909);
        two.setYear(1959);
        System.out.println(one);
    }

}
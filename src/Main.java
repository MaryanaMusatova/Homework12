public class Main {
    public static void main(String[] args) {
        Author antonChehov = new Author("Антон", "Чехов");
        System.out.print(antonChehov.getFirstName() + " ");
        System.out.println(antonChehov.getLastName());

        Book gull = new Book("Чайка", 1895, antonChehov);
        gull.setPublicationYear(1896);
        System.out.println(gull.getName());
        System.out.println(gull.getPublicationYear());

        Author mikhailBulgakov = new Author("Михаил", "Булгаков");
        System.out.print(mikhailBulgakov.getFirstName() + " ");
        System.out.println(mikhailBulgakov.getLastName());

        Book dogHeart = new Book("Собачье сердце", 1925, mikhailBulgakov);
        System.out.println(dogHeart.getName());
        System.out.println(dogHeart.getPublicationYear());
    }
}
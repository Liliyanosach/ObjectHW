package lessonObject;

public class Main {
    public static void main(String[] args) {
        Author polevoy = new Author("Борис", "Полевой");
        Author dovlatov = new Author("Сергей", "Довлатов");
        Book story = new Book("Повесть о настоящем человеке", polevoy, 2020);
        Book suitcase1 = new Book("Чемодан", dovlatov, 2007);
        Book suitcase2 = new Book("Чемодан", dovlatov, 2007);

        System.out.println(story);
        System.out.println(suitcase1);

        System.out.println(story.equals(suitcase1));
        System.out.println(suitcase1.equals(suitcase2));

        System.out.println(story.hashCode());
        System.out.println(suitcase1.hashCode());
        System.out.println(suitcase2.hashCode());
    }
}
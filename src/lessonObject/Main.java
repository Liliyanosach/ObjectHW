package lessonObject;

public class Main {
    public static void main(String[] args) {
        Author polevoy = new Author("Борис", "Полевой");
        Author dovlatov = new Author("Сергей", "Довлатов");
        Book story = new Book("Повесть о настоящем человеке", polevoy, 2020);
        Book suitcase = new Book("Чемодан", dovlatov, 2007);

        System.out.println("Книга - " + story.getName());
        System.out.println("Автор - " + polevoy.getName() + " " +  polevoy.getSurname());
        System.out.println("Год публикации - " + story.getPublishingYear());

        System.out.println("Книга - " + suitcase.getName());
        System.out.println("Автор - " + dovlatov.getName() + " " +  dovlatov.getSurname());
        System.out.println("Год публикации - " + suitcase.getPublishingYear());

    }
}
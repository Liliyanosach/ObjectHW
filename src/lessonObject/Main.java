package lessonObject;

public class Main {
    public static void main(String[] args) {
        Author polevoy = new Author("Борис", "Полевой");
        Author dovlatov = new Author("Сергей", "Довлатов");
        Book story = new Book("Повесть о настоящем человеке", polevoy, 2020);
        Book suitcase = new Book("Чемодан", dovlatov, 2007);

        System.out.println("Книга - " + story.getName());
        System.out.println("Автор - " + story.getFullName());
        System.out.println("Год публикации - " + story.getPublishingYear());

        System.out.println("Книга - " + suitcase.getName());
        System.out.println("Автор - " + suitcase.getFullName());
        System.out.println("Год публикации - " + suitcase.getPublishingYear());

        story.setPublishingYear(2022);
        System.out.println("story.getPublishingYear() = " + story.getPublishingYear());
    }
}
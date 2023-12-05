package lesson19;

//Задача 4: Управление доступом к ресурсам Задание: Создайте класс ResourceManager, который имеет статическое свойство access.
//
//   Помимо этого есть приватное свойство message, которое заполняется через конструктор. Если свойство access true,
//   метод getMessage возвращает message, если false, то возвращает "permission denied".

public class ResourceManager {
    private static boolean access;
    private String message;

    public ResourceManager(String message) {
        this.message = message;
    }

    public static void toggleAccess() {
        ResourceManager.access = !ResourceManager.access;
    }

    public String getMessage() {
        return ResourceManager.access ? message : "permission denied";
    }
}

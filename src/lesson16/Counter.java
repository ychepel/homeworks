package lesson16;

//Задача 7: Счётчик Создайте класс Counter, который имеет свойство count (счётчик), конструктор для его инициализации,
// и методы increment и decrement, увеличивающие и уменьшающие значение счётчика соответственно.

public class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public Counter increment() {
        count++;
        return this;
    }

    public Counter decrement() {
        count--;
        return this;
    }

    public int getCount() {
        return count;
    }
}

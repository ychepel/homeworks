1. Напишите программу, используя HashMap, чтобы подсчитать частоту каждого символа в строке. Метод получает строку в качестве аргумента и возвращает HashMap где в качестве ключа символ, а в качестве значения - кол-во повторений.
####
1. Создайте класс CachingSqrt. Этот класс имеет статический метод sqrt, который получает в качестве аргумента число и возвращает квадрат этого числа. Помимо этого должно быть статическое свойство cache, которое хранит все значения, с которыми был вызван sqrt и все результаты.
####
1. Добавьте к классу CachingSqrt метод cacheSqrt который при вызове проверяет, есть ли в кеше соответствующее значение, если есть, то не высчитывает квадрат, а возвращает результат из кеша.
# Library Registry

## Описание проекта

Данный проект реализует библиотечный реестр, который используется для описания библиотечного фонда муниципалитета. Реестр позволяет хранить различные объекты, такие как книги, журналы, письма и микрофильмы, а также искать их по инвентарному номеру и/или автору.

### Основные концепции
- **Наследование**: Общие характеристики и поведение объектов библиотеки выделены в абстрактном классе `LibraryItem`, от которого наследуются `Book` и `Magazine`.
- **Полиморфизм**: Метод `getDescription` реализован по-разному для книг и журналов.
- **Инкапсуляция**: Поля и методы объектов защищены от прямого доступа извне.

### Структура проекта
```
library-registry/ 
├── src/ 
│ ├── main/ 
│ │ └── java/ 
│ │ └── library/ 
│ │ ├── LibraryItem.java # Абстрактный класс для всех объектов 
│ │ ├── Book.java # Класс книги 
│ │ ├── Magazine.java # Класс журнала 
│ │ ├── LibraryRegistry.java # Реестр библиотеки 
│ │ └── Main.java # Точка входа в приложение 
│ └── test/
└── pom.xml # Конфигурация Maven
```
## Реализованные классы

- **`LibraryItem`**  
  Абстрактный базовый класс, содержащий общие поля и методы для всех объектов библиотеки.

- **`Book`**  
  Наследует `LibraryItem`, добавляет поле `title` и реализует метод `getDescription`.

- **`Magazine`**  
  Наследует `LibraryItem`, добавляет поле `title` и реализует метод `getDescription`.

- **`LibraryRegistry`**  
  Хранит объекты библиотеки и предоставляет методы для поиска по автору и инвентарному номеру.

- **`Main`**  
  Генерирует объекты, инициализирует реестр и демонстрирует работу поиска.


## Зависимости
Для запуска и тестирования проекта необходимо иметь установленную Java (версия 8 или выше).

## Как запустить
1. Склонируйте репозиторий на вашу локальную машину.
2. Скомпилируйте проект с помощью Maven:
```
mvn install
```
3. Запустите программу:
```
mvn exec:java
```

## Пример вывода программы
```
Search by Author 'J.K. Rowling':
Book: Harry Potter by J.K. Rowling

Search by Inventory Number 'INV001':
Book: Harry Potter by J.K. Rowling
```
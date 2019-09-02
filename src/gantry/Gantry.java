package gantry;


public class Gantry {
    private double capacity;
    private Scope scope;
    private String material;
    private Books[] booksInside;


    public Gantry (double capacity, double lgth, double depth, int weight, String material, int numberOfPlaces) {
        this.capacity = capacity;
        this.scope = new Scope(lgth, depth, weight);
        this.material = material;
        if (numberOfPlaces <= 0){
            numberOfPlaces = 1;}
        this.booksInside = new Books [numberOfPlaces];
    }

    public Gantry (int numberOfPlaces) {
        this.capacity = 4*numberOfPlaces;
        this.scope = new Scope(numberOfPlaces * 4, 2, 3);
        this.material = "Plastic";
        this.booksInside = new Books[numberOfPlaces];
    }

    public double getCapacity() {
        return capacity;}

    public Scope getScope() {
        return scope;}

    public String getMaterial() {
        return material;}

    public void putBooksOnPlace(Books books, int place) {
        if (this.booksInside[place] == null) {
            this.booksInside[place] = books;
            System.out.printf("Мы положили %s на %d полку\n", books, place);
        } else {
            System.out.printf("Не могу положить %s! Полка %d занята книгами %s\n", books, place, booksInside[place]);
        }
    }

    // метод заберет с полки с номером shelve одежду, если она там есть
    public Books getBooksFromPlace(int place) {
        Books result = null;
        // если на полке есть одежда
        if (booksInside[place] != null) {
            result = booksInside[place]; // присваиваем переменной result ссылку на эту одежду
            booksInside[place] = null;    // "очищаем" полку, присваиваем ссылке пустое значение
        }
        return result;
    }

    // метод пытается запихнуть одежду в шкаф на первую попавшуюся свободную полку, если таковой нет - выводит сообщение
    public void throwBooksIntoGantry(Books books) {
        // цикл будет работать, пока не найдет свободную полку. Если такая полка найдена - на нее кладется одежда, выводится сообщение,
        // и с помощью return мы завершаем работу всего метода, выходим обратно в ту точку программы, откуда мы этот метод вызывали
        for (int i = 0; i < booksInside.length; i++) {
            if (booksInside[i] == null) {
                booksInside[i] = books;
                System.out.printf("Положили книгу %s на %d место в полке\n", books, i);
                return;
            }
        }

        // сообщение о нехватке места будет выведено только в случае,
        // когда цикл полностью отработал и не было найдено ни одного свободного места
        System.out.printf("Невозможно положить %s! На полке нет места!", books);
    }

    // метод выводит список того, что лежит в шкафу, отсортирован по полкам
    public void lookOnGantry() {
        System.out.println("↓↓↓----------------↓↓↓");
        for (int place = 0; place <  booksInside.length; place++) {
            Books books =  booksInside[place];
            System.out.printf("%2d: %s\n", place, books != null ? books : "-пусто-");
        }
        System.out.println("↑↑↑----------------↑↑↑");
    }

}

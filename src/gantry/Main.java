package gantry;


public class Main {
    public static void main(String[] args) {

        Gantry gantry1 = new Gantry (4, 16, 2, 3, "Plastic", 4);
        System.out.printf("Размеры полки: %s , материал: %s\n", gantry1.getScope(), gantry1.getMaterial());
        gantry1.lookOnGantry(); // заглядываем в шкаф, убеждаемся, что все полки пусты

        Books Encyclopedia = new Books("Энциклопедия");
        Books Potter = new Books("Гарри Поттер");
        Books Atlas = new Books("Облачный Атлас");
        Books Bible = new Books("Библия");
        Books Seneca = new Books("Сенека");
        Books History = new Books("История");

        gantry1.putBooksOnPlace(Encyclopedia, 0);
        gantry1.putBooksOnPlace (Potter, 2);
        gantry1.throwBooksIntoGantry (Atlas);
        gantry1.putBooksOnPlace(Bible, 2);
        gantry1.throwBooksIntoGantry(Seneca);
        gantry1.putBooksOnPlace(History, 3);
        gantry1.lookOnGantry();

        Books someBooksFromGantry = gantry1.getBooksFromPlace(0);
        System.out.println("Мы держим в руках " + someBooksFromGantry);
        gantry1.lookOnGantry();

        gantry1.throwBooksIntoGantry(Atlas);
        gantry1.lookOnGantry();
    }
}

package cartask;

public class Point {
    public int x; //местоположение

    public int d; //для расчета пройденной  дистанции

    public Point (int x) {
        this.x = x;}

    Point р1 = new Point(0); //стартовое положение машины
    Point p2 = new Point(10); //следующее положение

    public void changingPlace () {
        return ++p2; //изменение далее положения
    }

    public void distance () {
    d = p2 - p1;
}










    }
}

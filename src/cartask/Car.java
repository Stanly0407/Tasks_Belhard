package cartask;

public class Car {
       public String title;

       public Car (String title) {
               this.title = title;}

        @Override
        public String toString () {
               return "Название машины: " + title;
        }


}

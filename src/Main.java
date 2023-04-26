public class Main {
    public static void main(String[] args) {
        //Условие задачи
        //Написать интерфейс «птица», с методами сесть и взлететь.
        // Сделать наследников - зяблика и ласточку, реализовать у них методы с консольным выводом.
        Zyablik zyablik = new Zyablik();
        zyablik.move();
        Lastochka lastochka = new Lastochka();
        lastochka.move();
    }
}
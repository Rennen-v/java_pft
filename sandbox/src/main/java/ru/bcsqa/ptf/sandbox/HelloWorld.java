package ru.bcsqa.ptf.sandbox;

public class HelloWorld {



    public static void main(String[] args) {
        hello();
    }
    public static void  hello(){
        System.out.println("Hello world!");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " +s.l+ "=" +s.area());

        Rectangle r = new Rectangle(4 , 6);
        r.a = 4;
        r.b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + r.a+ " и " +r.b+ " = " +r.area());
    }
}
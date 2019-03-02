import Eletronics.Radio;

public class Program {
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("Hello, World!");
        System.out.println();

        var radio = new Radio();

        radio.charge();

        radio.broadcast("Is anyone out there??");

        radio.broadcast("I need help to write tests!");

        radio.receive();

        System.out.println();
        System.out.println("=======================");
        System.out.println("bye bye, World!");
    }

}

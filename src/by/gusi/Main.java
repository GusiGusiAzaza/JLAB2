package by.gusi;

import by.belstu.it.harevich.TextClass;
//TODO method 0
public class Main {

    public static void main(String[] args) {
        //TODO new method 1
        ShoutHello("Hello World 2");

        TextClass text1 = new TextClass();
        ShoutHello(text1.Hello());
        Counter(10);
    }


    private static void ShoutHello(String hello) {
        System.out.println(hello);

    }

    private static void Counter(int count)
    {
        for(int i = 0; i < count; i++) {
            System.out.println("i = " + i);
        }
    }
}

package by.belstu.it.harevich;

public class TextClass {
    public TextClass() {
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    String str;

    @Override
    public String toString() {
        return "I am the TextClass instance";
    }

    public String Hello()
    {
        return "Hello from first project!!";
    }
}

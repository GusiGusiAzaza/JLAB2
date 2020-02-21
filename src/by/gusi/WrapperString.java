package by.gusi;

import java.util.Objects;

public class WrapperString {

    public void replace (char oldchar, char newchar)
    {
        str = str.replace(oldchar,newchar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(str, that.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str);
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public String str;

    @Override
    public String toString() {
        return "WrapperString{}";
    }

    public WrapperString(String s) {
        str = s;
    }
}

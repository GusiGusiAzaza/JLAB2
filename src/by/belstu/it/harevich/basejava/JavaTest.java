package by.belstu.it.harevich.basejava;
import by.gusi.WrapperString;

import java.util.Arrays;

import static java.lang.Math.*;

/**
 * @author Kirill
 * @version 11.0.2
 */
public class JavaTest {
    static int sint;
    final int FI = 0;
    public final int PFI = 0;
    /**
     * {@value}
     * @see
     */
    public static final int PSFI = 0;

    /**
     * @param args
     * @return void
     * @throws Exception
     */
    public static void main(String[] args) {
        char ch1 = 'h';
        int i1 = 15125;
        short sh1 = 144;
        double d1 = 999999999;
        byte byte1 = 4;
        long l1 = 1900090000;
        boolean bool1 = true;

        System.out.println("Hi" + i1);
        System.out.println("Hi" + ch1);
        byte byte2 = (byte) (byte1 + i1);
        System.out.println("byte = byte + int: " + byte2);
        int i2 = (int) (d1 + l1);
        System.out.println("double +long: " + i2);
        long l2 = (long)i1 + 2147483647;
        System.out.println("int + max: " + l2);
        System.out.println(sint);
        System.out.println(true && false);
        System.out.println(true ^ false);
        long long1 = 9223372036854775807L;
        long long2 = 0x7fff_ffff_fffL;
        char ch2 = 'a';
        char ch3 = '\u0061';
        char ch4 = 97;
        System.out.println("char sum: " + ch2+ch3+ch4);
        System.out.println(3.45 % 2.4);
        System.out.println(1.0/0);
        System.out.println(0.0/0.0);
        System.out.println(Math.log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));

        System.out.println("PI = " + PI + "\nE = " + E);
        System.out.println(round(PI) + round(E));
        System.out.println("rounded PI or E min: " + min(round(PI), round(E)));
        System.out.println("rand [0,1) = " + random());

        Boolean a = true;
        Boolean b = false;
        System.out.println(b || a);
        Integer integer = -15;
        System.out.println(integer >> 2);
        System.out.println(integer >>> 3);
        System.out.println(~integer);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        int inte = 15;
        byte byt = 6;
        Object o = inte;
        int inteo = inte;
        System.out.println(inteo);
        o = byt;
        byte byto = (byte)o;
        System.out.println(byto);
        System.out.println(Integer.parseInt("2446"));
        System.out.println(Integer.toHexString(11259375));
        System.out.println(Integer.bitCount(255));
        String istr = " 1338 ";
        int i3 = Integer.valueOf(istr.trim());
        i3 = Integer.parseInt(istr.trim());

        byte[] barr = istr.getBytes();
        String s = new String (barr);
        System.out.println(s);

        String value = "tRuE";
        boolean boo1 = Boolean.parseBoolean(value);
        boolean boo2 = Boolean.valueOf(value);
        System.out.println(boo1);
        System.out.println(boo2);

        String str1 = new String("HELLO");
        String str2 = new String("HELLO");
        System.out.println("String compares:");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));

        int length = 10;
        int[][] c1 = new int[length][length];
        int[] c2[] = new int[length][length];
        int c3[][] = new int[length][length];
        for (int i = 0;i<10;i++) {
            for (int j = 0; j < 10; j++) {
                c1[i][j] = i + j;
                c2[i][j] = i + j;
                c3[i][j] = i + j;
            }
        }
        System.out.println(Arrays.deepToString(c1));
        System.out.println(Arrays.deepToString(c2));
        c3 = c2;
        System.out.println(Arrays.deepToString(c3));

        System.out.println(c2 == c3);

        int[][]	jagged = new int[3][];
        jagged[0] = new int[4];
        jagged[1] = new int[3];
        jagged[2] = new int[5];

        WrapperString ws = new WrapperString("Hello");
        ws.replace('l','y');
        System.out.println(ws.str);
        WrapperString anonWs = new WrapperString("Hello") {
            public void delete(String str){
                str.replace(str, "");
            }

            @Override
            public void replace(char oldchar, char newchar) {
                System.out.println("Типа поменяли что-то");
            }
        };

        anonWs.replace('l','y');
        System.out.println(anonWs.str);
    }
}

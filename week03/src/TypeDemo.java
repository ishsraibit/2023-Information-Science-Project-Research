public class TypeDemo {
    public static void main(String[] args) {
        char c = '\uAC00';
        System.out.println(c);
        System.out.println((int)c);
        System.out.println(0.1 + 0.2);

        int intValue = 10;
        //byte byteValue = intValue;
        byte byteValue = (byte)intValue;
        System.out.println(byteValue);
        //intValue = 127;
        intValue = 128;  // -128 ~ +127
        byteValue = (byte) intValue;
        System.out.println(byteValue);
        // 0000 0000(2)  0(10)
        // 0000 0001(2)  1(10)
        // ...
        // 0111 1111(2)  127(10)   +
        // 1000 0000(2) -128(10)   -
        // 1000 0001(2) -127(10)
        // ...
        // 1111 1111(2)  -1(10)

        // AC
        // 1010 1100
        // 0101 0011  // 1's complement
        //+        1  // 2's complement
        // 0101 0100(2)
        // 64 + 16 + 4  == 84
        // 1010 1100(2) == -84 , byte
    }
}

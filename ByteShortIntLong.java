/**
 * ByteShortIntLong
 */
public class ByteShortIntLong {

    public static void main(String[] args) {
        int myValues = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        //Overflow!!
        System.out.println("Busted = " + (myMaxIntValue+1));
        System.out.println("Busted = " + (myMinIntValue-1));
        
        byte myByteMin = Byte.MIN_VALUE;
        byte myByteMax = Byte.MAX_VALUE;

        System.out.println("Byte Min Value = " + myByteMin);
        System.out.println("Byte Max Value = " + myByteMax);

        short myShortMin = Short.MIN_VALUE;
        short myShortMax = Short.MAX_VALUE;

        System.out.println("short Min Value = " + myShortMin);
        System.out.println("short Max Value = " + myShortMax);

        //Harus pake "L" di belakang
        long myLongValue = 9223372036854775807L;

        long myLongMin = Long.MIN_VALUE;
        long myLongMax = Long.MAX_VALUE;

        System.out.println("Long Min Value = " + myLongMin);
        System.out.println("Long Max Value = " + myLongMax);
        
        int myTotal = (myMinIntValue/2);

        //Karena defaultnya java adalah int, walaupun angkanya fit di byte, tapi dia masi
        //kira itu int. Pake casting (byte)0
        byte myNewByteValue =(byte) (myByteMin/2);


    }
}
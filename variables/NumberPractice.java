public class NumberPractice {
   public static void main(String[] args) {
     byte aByte = 64;
     short aShort = 1024;
     int anInt = 2_500_000;

     long aLong = 50000L + 10L * (aByte + aShort + anInt);
     short secondShort = (short) (1000 * (aByte + aShort));
     System.out.println(aLong);
     System.out.println(secondShort);
   }
}

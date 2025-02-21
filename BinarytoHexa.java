import java.util.Scanner;
import java.lang.Math;

//Comentari que no serveix per res//

public class BinarytoHexa {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Input binary number");
        long binary = input.nextLong();
        int decimal = 0;

        for (int i = 0; binary > 0; i++){
            long binarynibble = binary % 10;
            decimal += binarynibble * Math.pow(2,i);
            binary /= 10;
        }

        System.out.printf("Decimal number %d",decimal);

        String hexadecimaldigits = "0123456789ABCDEF";
        StringBuilder hexa = new StringBuilder();


        while (decimal > 0){
            int decimalnibble = decimal % 16;
            hexa.insert(0,hexadecimaldigits.charAt(decimalnibble));
            decimal /= 16;
        }

        System.out.printf("\n Hexadecimal number %s", hexa);

        input.close();
    }
}

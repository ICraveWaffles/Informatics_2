import java.util.Scanner;
import java.text.Normalizer;

public class CuentaAs {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.printf("Write Word");
        String oldword = input.nextLine();
        oldword = oldword.toLowerCase();
        String word = Normalizer.normalize(oldword, Normalizer.Form.NFD);

        int x = word.length()-1;
        int n = 0;
        System.out.printf("There are %d As in %s",CuentaAs(word,x,n),oldword);

        input.close();
    }
    public static int CuentaAs(String word, int x, int n){
        if (word.charAt(x)== 'a') {n++;}
        if (x == 0) {return n; } else { return CuentaAs(word,x-1, n);}
    }
}
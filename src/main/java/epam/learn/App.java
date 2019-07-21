package epam.learn;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class App
{
   static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args )
    {
        String name;

        //task1-1
//        System.out.println( "Enter name:" );
//        name=scanner.next();
//        System.out.println( "Hello "+name );
        //task1-2
//        int quantityNumber;
//        int[] arrays;
//        System.out.println( "Enter quantity Numbers:" );
//        quantityNumber=scanner.nextInt();
//        arrays =new int[quantityNumber];
//        for (int i=0; i<quantityNumber;i++) {
//            System.out.print( "Enter Numbers #"+(i+1)+" " );
//            arrays[i]=scanner.nextInt();
//              }
//        System.out.println( Arrays.toString(arrays) );
//
//        for (int i=0; i<arrays.length;i++) {
//            System.out.print(arrays[arrays.length-(i+1)]+" " );
//
//        }
        //task1-3

        Random random = new Random();
        int[] arraysNumber;
        int sizeArray;
        System.out.println( "Enter quantity Numbers:" );
        sizeArray=scanner.nextInt();
        arraysNumber=new int[sizeArray];
        for (int i = 0; i <arraysNumber.length ; i++) {
            arraysNumber[i]=random.nextInt(); 
        }
        for (int i = 0; i < ; i++) {
            
        }
        










    }
}

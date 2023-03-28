package utilities;

import java.util.Arrays;

public class ArraysUtility {
    public static int[] merge(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        int k = 0;
        for (int i = 0; i < a.length; i++, k++) {
            result[k] = a[i];
        }
        for (int i = 0; i < b.length; i++, k++) {
            result[k] = b[i];
        }

        return result;
    }

    public static double[] merge(double[] a, double[] b) {

        double[] result = new double[a.length + b.length];

        int k = 0;
        for (int i = 0; i < a.length; i++, k++) {
            result[k] = a[i];
        }
        for (int i = 0; i < b.length; i++, k++) {
            result[k] = b[i];
        }

        return result;
    }

    public static char[] merge(char[] a, char[] b) {

        char[] result = new char[a.length + b.length];

        int k = 0;
        for (int i = 0; i < a.length; i++, k++) {
            result[k] = a[i];
        }
        for (int i = 0; i < b.length; i++, k++) {
            result[k] = b[i];
        }

        return result;
    }

    public static String[] merge(String[] a, String[] b) {

        String[] result = new String[a.length + b.length];

        int k = 0;
        for (int i = 0; i < a.length; i++, k++) {
            result[k] = a[i];
        }
        for (int i = 0; i < b.length; i++, k++) {
            result[k] = b[i];
        }

        return result;
    }

    public static double[] reverse(double[] array) {
        double[] reverse= new double[array.length];

        for (int i = array.length-1,j=0; i >=0; i--,j++) {
            reverse[j]=array[i];
        }

        return reverse;
    }

    public static int[] reverse(int[] array) {
        int[] reverse= new int[array.length];

        for (int i = array.length-1,j=0; i >=0; i--,j++) {
            reverse[j]=array[i];
        }

        return reverse;
    }
    public static String[] reverse(String[] array) {
        String[] reverse= new String[array.length];

        for (int i = array.length-1,j=0; i >=0; i--,j++) {
            reverse[j]=array[i];
        }

        return reverse;
    }
    public static char[] reverse(char[] array) {
        char[] reverse= new char[array.length];

        for (int i = array.length-1,j=0; i >=0; i--,j++) {
            reverse[j]=array[i];
        }

        return reverse;
    }

    public static int[] addElement(int[] array,int element){

        int[] new_array= Arrays.copyOf(array,array.length+1);

        new_array[new_array.length-1]=element;

        return new_array;
    }
    public static String[] addElement(String[] array,String element){

        String[] new_array= Arrays.copyOf(array,array.length+1);

        new_array[new_array.length-1]=element;

        return new_array;
    }
    public static double[] addElement(double[] array,double element){

        double[] new_array= Arrays.copyOf(array,array.length+1);

        new_array[new_array.length-1]=element;

        return new_array;
    }
    public static char[] addElement(char[] array,char element){

        char[] new_array= Arrays.copyOf(array,array.length+1);

        new_array[new_array.length-1]=element;

        return new_array;
    }

    public static boolean contains(int[]array, int element){

        for (int num : array) {
            if(num==element){
                return true;
            }else{
                return false;
            }
        }
return true;

    }

}

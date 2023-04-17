package daily_lessons.day_21_multi_dimensional_array;

public class Array4DPractise {
    public static void main(String[] args) {
        int[][][] arr3D1 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };
        int[][][] arr3D2 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };
        int[][][] arr3D3 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };

        int [][][][] arr4D= {arr3D1,arr3D2,arr3D3};

        for (int[][][] arr3d : arr4D) {
            for (int[][] arr2d : arr3d) {
                for (int[] arr : arr2d) {
                    for (int eachElement : arr) {
                        System.out.println(eachElement);
                    }
                }
            }
        }
    }
}

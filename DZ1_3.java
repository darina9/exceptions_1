public class DZ1_3 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 1, 2, 3, 4, 5, 8, 11 };
        if (checkDiff(arr1, arr2))
            System.out.println("Массивы не одинаковы");
        for (int item : diffArray(arr1, arr2))
            System.out.println(item);
    }

    public static boolean checkDiff(int[] arr1, int[] arr2) {
        return arr1.length != arr2.length;
    }

    public static int[] diffArray(int[] arr1, int[] arr2) {
        int lenght = 0;
        if (arr1.length <= arr2.length)
            lenght = arr1.length;
        else
            lenght = arr2.length;

        int[] temp = new int[lenght];
        for (int i = 0; i < lenght; i++)
            temp[i] = arr1[i] - arr2[i];
        return temp;
    }
}
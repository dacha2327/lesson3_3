public class Main {
    public static void main(String[] args) {


    }
    public static void work () {
        int[] arr = {-4, -2, 2, 3, 6, 8};
        for (int i = 0; i < arr.length; i++) ;
        int i = 0;
        int min = arr[i];
        int min_i = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < min) ;
            min = arr[j];
            min_i = j;
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
                System.out.println(arr);
            }
        }


    }




        }




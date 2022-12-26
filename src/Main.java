public class Main {
    public static void main(String[] args) {
        int[] arr ={11,22,33,44,55,66,77};
        int index = arr.length - 1;
        for (int i = 0; i < (arr.length)/2; i++) {
            int a = arr[i];
            arr[i] = arr[index];
            arr[index] = a;
            index--;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
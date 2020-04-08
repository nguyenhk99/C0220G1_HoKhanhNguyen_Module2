package MangVaPhuongThuc.ThucHanh;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        int[] arr = {1, 5, 20, 100, 10};
        int temp;
        int j = arr.length-1;
        for (int i = 0; i < arr.length/2; i++,j--) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

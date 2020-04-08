package MangVaPhuongThuc.BaiTap;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = {1,5,4,3,2};
        int[] arr2 = {7,10};
        int[] arr3 = new int[arr1.length + arr2.length];
        int x =0;
        for(int i = 0;i<arr1.length;i++){
            arr3[i] = arr1[i];
        }
        for(int j = arr1.length;j<arr3.length;j++){
            arr3[j] = arr2[x];
            x++;
        }
        for(int i = 0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}

package MangVaPhuongThuc.ThucHanh;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        int[] arr = {1,5,22,25,55,100,2};
        int max = arr[0];

        for(int i =0;i<arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

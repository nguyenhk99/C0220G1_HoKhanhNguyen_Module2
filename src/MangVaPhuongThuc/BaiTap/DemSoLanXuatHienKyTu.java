package MangVaPhuongThuc.BaiTap;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        String string = "Toi La Ho Khanh Nguyen";
        int count = 0;

        for(int i =0;i < string.length();i++){
            if (string.charAt(i) == 'h'){
                count++;
            }
        }
        System.out.println(count);
    }
}

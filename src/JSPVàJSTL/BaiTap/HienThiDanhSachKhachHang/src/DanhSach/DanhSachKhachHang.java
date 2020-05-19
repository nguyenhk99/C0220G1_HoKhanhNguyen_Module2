package DanhSach;


public class DanhSachKhachHang {
    private String ten = "";
    private String ngaySinh;
    private String diaChi = "";
    private String img = "";

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public DanhSachKhachHang(String ten, String ngaySinh, String diaChi, String img) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.img = img;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}

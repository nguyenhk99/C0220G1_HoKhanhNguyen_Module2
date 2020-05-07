update khachhang set khachhang.IDLoaiKhach = '5'
where khachhang.IDKhachHang in (
select a.IDKhachHang
from
(select khachhang.IDKhachHang
from khachhang
join loaikhach on loaikhach.IDLoaiKhach = khachhang.IDKhachHang
join hopdong on hopdong.IDKhachHang = khachhang.IDKhachHang
group by khachhang.IDKhachHang
having sum(hopdong.TongTien) > 10000000)as a)  and khachhang.IDLoaiKhach = '3'
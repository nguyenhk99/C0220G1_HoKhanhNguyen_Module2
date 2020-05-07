select khachhang.HoTen,hopdong.NgayLamHopDong ,sum(hopdong.TongTien)
from hopdong
join khachhang on khachhang.IDKhachHang = hopdong.IDKhachHang
where year(hopdong.NgayLamHopDong) = 2019
group by month(hopdong.NgayLamHopDong)
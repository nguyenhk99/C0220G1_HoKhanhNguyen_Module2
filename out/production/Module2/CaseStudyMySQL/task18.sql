delete khachhang
from khachhang
join hopdong on hopdong.IDKhachHang = khachhang.IDKhachHang
where year(hopdong.NgayLamHopDong) in(
select a.NamLamHopDong
from
(select year(hopdong.NgayLamHopDong) as NamLamHopDong
from khachhang
join hopdong on hopdong.IDKhachHang = khachhang.IDKhachHang
where year(hopdong.NgayLamHopDong) <2016
group by khachhang.IDKhachHang) as a)
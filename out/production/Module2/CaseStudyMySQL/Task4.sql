select khachhang.HoTen, count(hopdong.IDHopDong) as SoLanDat
from khachhang
left join hopdong on khachhang.IDKhachHang = hopdong.IDKhachHang
left join loaikhach on loaikhach.IDLoaiKhach = khachhang.IDLoaiKhach
where loaikhach.TenLoaiKhach = 'Diamond'
group by khachhang.HoTen
order by count(hopdong.IDHopDong) asc;
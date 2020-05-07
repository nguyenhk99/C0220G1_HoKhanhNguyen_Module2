select khachhang.IDKhachHang, khachhang.HoTen,loaikhach.TenLoaiKhach,hopdong.IDHopDong,dichvu.TenDichVu,hopdong.NgayLamHopDong,hopdong.NgayKetThuc,dichvu.ChiPhiThue+dichvudikem.DonVi*dichvudikem.Gia as TongTien
from khachhang
left join hopdong on hopdong.IDKhachHang = khachhang.IDKhachHang
left join loaikhach on loaikhach.IDLoaiKhach = khachhang.IDLoaiKhach
left join dichvu on hopdong.IDDichVu = dichvu.IDDichVu
left join hopdongchitiet on hopdongchitiet.IDHopDong = hopdong.IDHopDong
left join dichvudikem on dichvudikem.IDDichVuDiKem = hopdongchitiet.IDDichVuDiKem
group by hopdong.IDHopDong
order by khachhang.IDKhachHang
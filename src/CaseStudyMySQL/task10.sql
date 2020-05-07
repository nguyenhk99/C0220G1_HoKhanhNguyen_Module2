select hopdong.IDHopDong, hopdong.NgayLamHopDong,hopdong.NgayKetThuc,hopdong.TienDatCoc,count(hopdongchitiet.IDHopDongChiTiet) as SoLuongDichVuDiKem
from hopdong
join hopdongchitiet on hopdongchitiet.IDHopDong = hopdong.IDHopDong
group by hopdongchitiet.IDHopDongChiTiet
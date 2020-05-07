select hopdong.IDHopDong,loaidichvu.TenLoaiDichVu,dichvudikem.TenDichVuDiKem,hopdongchitiet.SoLuong as SoLanSuDung
from hopdong
join dichvu on dichvu.IDDichVu = hopdong.IDDichVu
join loaidichvu on loaidichvu.IDLoaiDichVu = dichvu.IDLoaiDichVu
join hopdongchitiet on hopdongchitiet.IDHopDong = hopdong.IDHopDong
join dichvudikem on dichvudikem.IDDichVuDiKem = hopdongchitiet.IDDichVuDiKem
where hopdongchitiet.SoLuong = 1
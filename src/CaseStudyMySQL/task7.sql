select dichvu.IDDichVu,dichvu.TenDichVu,dichvu.DienTich,dichvu.SoNguoiToiDa,dichvu.ChiPhiThue,dichvu.TenDichVu
from dichvu
join hopdong on hopdong.IDDichVu = dichvu.IDDichVu
where dichvu.IDDichVu in(select hopdong.IDDichVu from hopdong) and year(hopdong.NgayLamHopDong) >= 2018 and year(hopdong.NgayKetThuc) < 2019;
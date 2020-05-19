select dichvu.IDDichVu,dichvu.TenDichVu,dichvu.DienTich,dichvu.ChiPhiThue,dichvu.TenDichVu
from dichvu
where dichvu.IDDichVu not in(select hopdong.IDDichVu from hopdong);
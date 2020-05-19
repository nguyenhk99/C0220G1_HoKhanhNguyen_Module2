create database furama;

create table loaidichvu(
	IDLoaiDichVu int primary key,
    TenLoaiDichVu varchar(45)
);

create table kieuthue(
	IDKieuThue int primary key,
    TenKieuThue varchar(45),
    Gia int
);

create table dichvu(
	IDDichVu int primary key,
    TenDichVu varchar(45),
    DienTich int,
    SoTang int,
    SoNguoiToiDa varchar(45),
    ChiPhiThuc varchar(45),
    TrangThai varchar(45),
	IDKieuThue int,
	IDLoaiDichVu int,
    foreign key (IDKieuThue) references kieuthue(IDKieuThue),
    foreign key (IDLoaiDichVu) references loaidichvu(IDLoaiDichVu)
);

create table trinhdo(
	IDTrinhDo int primary key,
    TrinhDo varchar(45)
);

create table vitri(
	IDViTri int primary key,
    TenViTri varchar(45)
);

create table bophan(
	IDBoPhan int primary key,
    TenBoPhan varchar(45)
);


create table nhanvien(
	IDNhanVien int primary key,
    HoTen varchar(45) not null,
	NgaySinh date,
    SoCMND varchar(45),
    SoDienThoai varchar(45),
    Luong varchar(45),
	Email varchar(45),
    IDTrinhDo int,
    IDBoPhan int,
    IDViTri int,
    foreign key (IDTrinhDo) references trinhdo(IDTrinhDo),
    foreign key (IDBoPhan) references bophan(IDBoPhan),
    foreign key (IDViTri) references vitri(IDViTri)
);

create table loaikhach(
	IDLoaiKhach int primary key,
	TenLoaiKhach varchar(45)
);

create table khachhang(
	IDKhachHang int not null primary key,
	IDLoaiKhach int,
	HoTen varchar(45) not null,
	NgaySinh date,
    GioiTinh varchar(45),
    SoCMND varchar(45),
    SoDienThoai varchar(45),
    Email varchar(45),
    DiaChi varchar(45),
    foreign key (IDLoaiKhach) references loaikhach(IDLoaiKhach)
);

create table hopdong(
	IDHopDong int not null primary key,
    IDNhanVien int,
    IDKhachHang int,
    IDDichVu int,
    NgayLamHopDong date,
    NgayKetThuc date,
    TienDatCoc int,
    TongTien int,
    foreign key (IDNhanVien) references nhanvien(IDNhanVien),
    foreign key (IDKhachHang) references khachhang(IDKhachHang),
    foreign key (IDDichVu) references dichvu(IDDichVu)
);

create table dichvudikem(
	IDDichVuDiKem int not null primary key,
    TenDichVuDiKem varchar(45),
    Gia int,
    DonVi int,
    TrangThaiKhaDung varchar(45)
);

create table hopdongchitiet(
	IDHopDongChiTiet int not null primary key,
    IDHopDong int,
    IDDichVuDiKem int,
    SoLuong int,
    foreign key (IDHopDong) references hopdong(IDHopDong),
    foreign key (IDDichVuDiKem) references dichvudikem(IDDichVuDiKem)
);

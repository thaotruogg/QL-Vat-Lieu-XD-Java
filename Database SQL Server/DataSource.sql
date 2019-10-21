
										--------------------------- Vật liệu xây dựng -------------------------------
-- Create a new database called 'DatabaseVLXD'
-- Connect to the 'master' database to run this snippet
USE master
GO
-- Create the new database if it does not exist already
IF NOT EXISTS (
	SELECT name
		FROM sys.databases
		WHERE name = N'DatabaseVLXD'
)
CREATE DATABASE DatabaseVLXD

GO

use DatabaseVLXD

GO

SET DATEFORMAT DMY

GO 

CREATE TABLE LOAISANPHAM --
(
	maLoaiSanPham VARCHAR(10) NOT NULL,
	tenLoaiSanPham NVARCHAR(100) NOT NULL,
	PRIMARY KEY(maLoaiSanPham)
)

GO	

CREATE TABLE KHACHHANG --
(
	maKhachHang VARCHAR(10) NOT NULL,
	tenKhachHang NVARCHAR(100) NOT NULL,
	diaChi NVARCHAR(100) NULL DEFAULT N'Địa chỉ không xác định',
	soDienThoai VARCHAR(10) CHECK(soDienThoai  LIKE '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'
								OR soDienThoai LIKE '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'
								OR soDienThoai LIKE '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'
								OR soDienThoai IS NULL) NOT NULL,
	noDauKi FLOAT CHECK(noDauKi >= 0) NULL DEFAULT 0,
	noHienTai FLOAT CHECK(noHienTai >= 0) NULL DEFAULT 0,
	PRIMARY KEY(maKhachHang)
)

GO	

CREATE TABLE SANPHAM
(
	maSanPham VARCHAR(10) NOT NULL,
	tenSanPham NVARCHAR(50) NOT NULL,
	nhaSanXuat NVARCHAR(100) NULL DEFAULT N'Nhà sản xuất không xác định',
	maLoaiSanPham VARCHAR(10) NOT NULL,
	PRIMARY KEY(maSanPham),
	FOREIGN KEY(maLoaiSanPham) REFERENCES dbo.LOAISANPHAM(maLoaiSanPham) ON UPDATE CASCADE
)

GO	

CREATE TABLE THANHTOAN
(
	soPhieu VARCHAR(10) NOT NULL,
	ngayPhieu DATE CHECK(ngayPhieu <= GETDATE()) NOT NULL,
	soTien FLOAT CHECK(soTien >= 0) NOT NULL,
	maKhachHang VARCHAR(10) NOT NULL,
	PRIMARY KEY(soPhieu),
	FOREIGN KEY(maKhachHang) REFERENCES dbo.KHACHHANG(maKhachHang) ON UPDATE CASCADE
)

GO

CREATE TABLE HOADON
(
	soHoaDon VARCHAR(10) NOT NULL,
	maKhachHang VARCHAR(10) NOT NULL,
	ngayHoaDon DATETIME CHECK(ngayHoaDon <= GETDATE()) NOT NULL,
	PRIMARY KEY(soHoaDon),
	FOREIGN KEY(maKhachHang) REFERENCES dbo.KHACHHANG(maKhachHang) ON UPDATE CASCADE
)

GO

CREATE TABLE CHITIETHOADON
(
	maHoaDon VARCHAR(10) NOT NULL,
	maSanPham VARCHAR(10) NOT NULL,
	soLuong INT CHECK(soLuong >= 0) NOT NULL,
	donGia FLOAT CHECK(donGia >= 0) NOT NULL,
	PRIMARY KEY(maHoaDon, maSanPham),
	FOREIGN KEY(maSanPham) REFERENCES dbo.SANPHAM(maSanPham)ON UPDATE CASCADE,
	FOREIGN KEY(maHoaDon) REFERENCES dbo.HOADON(soHoaDon) ON UPDATE CASCADE
)

CREATE TABLE ACCOUNT
(
	id INT IDENTITY,
	usernameAcc VARCHAR(50) NOT NULL,
	nameDisplay VARCHAR(50) NOT NULL,
	passwordAcc VARCHAR(10) NOT NULL,
	typeAcc INT NOT NULL DEFAULT 1,
	PRIMARY KEY(usernameAcc)
)

							------------------------------------- Tạo xong rồi nha  ----------------------------------------
							-- Có nhiêu đó cũng quên!!! ĐM -_- Mày tạo hơn 7 lần rồi đó thằng óc ****

----------------------------------------------------------- Delete Table ------------------------------------------------------------------

DROP TABLE dbo.ACCOUNT
--GO 
--DROP TABLE dbo.CHITIETHOADON
--GO 
--DROP TABLE dbo.HOADON
--GO 
--DROP TABLE dbo.KHACHHANG
--GO 
--DROP TABLE dbo.SANPHAM
--GO 
--DROP TABLE dbo.LOAISANPHAM

-------------------------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------ Dữ liệu nhập -----------------------------------------------------------------
GO 

INSERT dbo.ACCOUNT VALUES ('admin', 'admin', '123456', 1)
INSERT dbo.ACCOUNT VALUES ('staff', 'staff', '321', 0)
INSERT dbo.ACCOUNT VALUES ('staff2', 'Thor', '456', 0)

INSERT dbo.LOAISANPHAM VALUES ('VL10', N'Xi măng')
INSERT dbo.LOAISANPHAM VALUES ('VL11', N'Gạch')
INSERT dbo.LOAISANPHAM VALUES ('VL12', N'Sắt')
INSERT dbo.LOAISANPHAM VALUES ('VL13', N'Nhựa')
INSERT dbo.LOAISANPHAM VALUES ('VL14', N'Cát')
INSERT dbo.LOAISANPHAM VALUES ('VL15', N'Vàng')

INSERT dbo.SANPHAM VALUES ('SP001', N'Xi măng Python', N'Python', 'VL10')
INSERT dbo.SANPHAM VALUES ('SP002', N'Gạch lát tường', N'Java', 'VL11')
INSERT dbo.SANPHAM VALUES ('SP003', N'Gạch lát nền', N'Java', 'VL11')
INSERT dbo.SANPHAM VALUES ('SP004', N'Sắt dây', N'Kotlin', 'VL12')
INSERT dbo.SANPHAM VALUES ('SP005', N'Sắt ống', N'Kotlin', 'VL12')
INSERT dbo.SANPHAM VALUES ('SP006', N'Sắt trụ', N'Kotlin', 'VL12')
INSERT dbo.SANPHAM VALUES ('SP007', N'Ống nước', N'C plus plus', 'VL13')
INSERT dbo.SANPHAM VALUES ('SP008', N'Cát trắng', N'Python', 'VL14')
INSERT dbo.SANPHAM VALUES ('SP009', N'Cát vàng', N'Python', 'VL14')
INSERT dbo.SANPHAM VALUES ('SP010', N'Vàng 24K', N'Dubai', 'VL15')
INSERT dbo.SANPHAM VALUES ('SP011', N'Vàng giả', N'Dubai', 'VL15')
INSERT dbo.SANPHAM VALUES ('', N'', N'', '')

INSERT dbo.HOADON VALUES ('HD001', 'KH001', GETDATE())
INSERT dbo.HOADON VALUES ('HD002', 'KH005', GETDATE())
INSERT dbo.HOADON VALUES ('HD003', 'KH005', GETDATE())
INSERT dbo.HOADON VALUES ('HD004', 'KH002', GETDATE())
INSERT dbo.HOADON VALUES ('', '', GETDATE())
SELECT * FROM dbo.HOADON
--------------------------------------------------------
INSERT dbo.CHITIETHOADON VALUES ('HD001', 'SP003', 2, 100)
INSERT dbo.CHITIETHOADON VALUES ('HD002', 'SP003', 5, 200)
INSERT dbo.CHITIETHOADON VALUES ('HD001', 'SP001', 10, 2000)
INSERT dbo.CHITIETHOADON VALUES ('HD003', 'SP001', 4, 50)
INSERT dbo.CHITIETHOADON VALUES ('HD003', 'SP005', 3, 150)
INSERT dbo.CHITIETHOADON VALUES ('HD004', 'SP005', 3, 100)
SELECT * FROM dbo.CHITIETHOADON
				------------------------------ Có đứa bảo Dev NHẠT VL :)))))) ------------------------------

INSERT dbo.KHACHHANG(maKhachHang, tenKhachHang, diaChi, soDienThoai, noDauKi, noHienTai) VALUES ( 'KH001', N'Coca Cola', N'Quận 9 nha', '0387342288', 0, 0)
INSERT dbo.KHACHHANG VALUES ( 'KH002', N'Yasuo', N'Cư dân lang thang', '0123456789', 0, 0)
INSERT dbo.KHACHHANG VALUES ( 'KH003', N'Ngộ không', N'Hoa quả sơn', '0912341424', 0, 0)
INSERT dbo.KHACHHANG VALUES ( 'KH004', N'Ant-man', N'Tổ kiến', '0730000000', 0, 5000000)
INSERT dbo.KHACHHANG VALUES ( 'KH005', N'Spider-man', N'Mạng nhện', '0808008800', 300000, 0)
INSERT dbo.KHACHHANG VALUES ( 'KH006', N'Thor', N'Cư dân lang thang', '0706776622', 300000, 350000)
INSERT dbo.KHACHHANG VALUES ( 'KH007', N'Hulk', N'Ở chung với Thor', '0706776622', 0, 0)
GO
-------------------------------------------------------------------------------------------------------------------------------------------

--------------------------------------------------------------- Query ---------------------------------------------------------------------
GO 
SELECT hd.soHoaDon, kh.tenKhachHang, hd.ngayHoaDon 
FROM dbo.HOADON hd, dbo.KHACHHANG kh
WHERE hd.soHoaDon='HD001' AND hd.maKhachHang = kh.maKhachHang
GO	
-- query show khach hang
SELECT maKhachHang AS [Mã khách hàng], tenKhachHang AS [Tên khách hàng], diaChi AS [Địa chỉ], soDienThoai AS [Số điện thoại], noDauKi AS [Nợ đầu kì], noHienTai AS [Nợ hiện tại] FROM dbo.KHACHHANG
-- query show san pham
SELECT s.maSanPham AS [Mã sản phẩm], s.tenSanPham AS [Tên sản phẩm], s.nhaSanXuat AS [Nhà sản xuất], l.tenLoaiSanPham AS [Loại sản phẩm] FROM dbo.LOAISANPHAM AS l, dbo.SANPHAM AS s WHERE l.maLoaiSanPham = s.maLoaiSanPham
-- query show hoa don
SELECT h.soHoaDon [Số hóa đơn], k.tenKhachHang [Tên khách hàng], CONVERT(NVARCHAR(100), h.ngayHoaDon, 105) [Ngày hóa đơn], s.tenSanPham [Tên sản phẩm], ct.soLuong [Số lượng], ct.donGia [Đơn giá] FROM dbo.HOADON h, dbo.CHITIETHOADON ct, dbo.KHACHHANG k, dbo.SANPHAM s WHERE h.maKhachHang = k.maKhachHang AND ct.maSanPham = s.maSanPham AND ct.maHoaDon = h.soHoaDon GROUP BY h.soHoaDon, k.tenKhachHang, h.ngayHoaDon, s.tenSanPham, ct.soLuong, ct.donGia
-- query show loai san pham
SELECT maLoaiSanPham AS [Mã loại sản phẩm], tenLoaiSanPham AS [Tên loại sản phẩm] FROM dbo.LOAISANPHAM

SELECT COUNT(*) FROM dbo.ACCOUNT WHERE usernameAcc = 'admin' AND passwordAcc = '123456789'
					-------------------------------------------------------------- Query Proc -----------------------------------------------------------------
GO
--Check điều kiện đăng nhập:
CREATE PROC USER_Login
@userName varchar(50), @passWord varchar(50)
AS
BEGIN
	SELECT * FROM dbo.ACCOUNT WHERE usernameAcc = @userName AND passwordAcc = @passWord
END
GO	
SELECT * FROM dbo.KHACHHANG WHERE maKhachHang = ''
go
--Show table khách hàng
ALTER PROC SHOW_KhachHang
AS
BEGIN
	SELECT maKhachHang AS [Mã khách hàng], tenKhachHang AS [Tên khách hàng], soDienThoai AS [Số điện thoại]
	FROM dbo.KHACHHANG
END
GO
EXEC dbo.SHOW_KhachHang
GO
--Show table Sản phẩm
CREATE PROC SHOW_SanPham
AS
BEGIN
	SELECT s.maSanPham AS [Mã sản phẩm], s.tenSanPham AS [Tên sản phẩm], s.nhaSanXuat AS [Nhà sản xuất], l.maLoaiSanPham AS [Mã loại sản phẩm] -- l.tenLoaiSanPham AS [Loại sản phẩm]
	FROM dbo.LOAISANPHAM AS l, dbo.SANPHAM AS s
	WHERE l.maLoaiSanPham = s.maLoaiSanPham
END
GO
--Show table Hóa đơn
CREATE PROC SHOW_HoaDon
AS
BEGIN
	SELECT h.soHoaDon [Số hóa đơn], k.maKhachHang [Mã khách hàng], CONVERT(NVARCHAR(100), h.ngayHoaDon, 105) [Ngày hóa đơn], ct.maHoaDon [Mã hóa đơn], s.maSanPham [Mã sản phẩm], ct.soLuong [Số lượng], ct.donGia [Đơn giá] 
	FROM dbo.HOADON h, dbo.CHITIETHOADON ct, dbo.KHACHHANG k, dbo.SANPHAM s 
	WHERE h.maKhachHang = k.maKhachHang AND ct.maSanPham = s.maSanPham AND ct.maHoaDon = h.soHoaDon 
	GROUP BY h.soHoaDon, k.maKhachHang, h.ngayHoaDon, ct.maHoaDon, s.maSanPham, ct.soLuong, ct.donGia
	ORDER BY ct.maHoaDon
END
GO
EXEC dbo.SHOW_HoaDon
GO
--Show table Số Hóa Đơn
CREATE PROC Show_SoHoaDon
AS
BEGIN
    SELECT soHoaDon [Số hóa đơn], maKhachHang [Mã khách hàng], ngayHoaDon [Ngày hóa đơn] 
	FROM dbo.HOADON
END
GO
CREATE PROC Show_SoHoaDon2 (@maHD VARCHAR(10))
AS
BEGIN
    SELECT hd.soHoaDon, hd.maKhachHang, kh.tenKhachHang, hd.ngayHoaDon 
	FROM dbo.HOADON hd, dbo.KHACHHANG kh
	WHERE hd.soHoaDon=@maHD AND hd.maKhachHang = kh.maKhachHang
END
GO
EXEC dbo.Show_SoHoaDon2 @maHD = '' -- varchar(10)
SELECT maSanPham, tenSanPham FROM dbo.SANPHAM WHERE maSanPham='SP001'
GO
--Show table Mã Chi Tiết Hóa Đơn
CREATE PROC Show_CTHD
AS
BEGIN
    SELECT maHoaDon [Mã hóa đơn], maSanPham [Mã sản phẩm], soLuong [Số lượng], donGia [Đơn giá] FROM dbo.CHITIETHOADON
END
GO
EXEC dbo.Show_CTHD
GO 
--Show table Loại sản phẩm
CREATE PROC SHOW_LoaiSanPham
AS
BEGIN
	SELECT maLoaiSanPham AS [Mã loại sản phẩm], tenLoaiSanPham AS [Tên loại sản phẩm] 
	FROM dbo.LOAISANPHAM
END	
GO

EXEC dbo.SHOW_LoaiSanPham
GO
EXEC dbo.SHOW_SanPham
GO

--KHÁCH HÀNG
	-- Thêm Khách Hàng
	CREATE PROC USP_InsertKhachHang (@maKhachHang VARCHAR(10), @tenKhachHang NVARCHAR(100), @diaChi NVARCHAR(100), @soDienThoai VARCHAR(10), @noDauKi FLOAT, @noHienTai FLOAT)
	AS
    BEGIN
		INSERT dbo.KHACHHANG (maKhachHang, tenKhachHang, diaChi, soDienThoai, noDauKi, noHienTai) 
		VALUES (@maKhachHang, @tenKhachHang, @diaChi, @soDienThoai, @noDauKi, @noHienTai)
	END
	GO
	-->
	EXEC dbo.USP_InsertKhachHang @maKhachHang = '', @tenKhachHang = N'', @diaChi = N'', @soDienThoai = '', @noDauKi = 0.0, @noHienTai = 0.0
	GO

    -- Sửa Khách hàng
	ALTER PROC USP_UpdateKhachHang (@maKhachHang VARCHAR(10), @tenKhachHang NVARCHAR(100), @diaChi NVARCHAR(100), @soDienThoai VARCHAR(10), @noDauKi FLOAT, @noHienTai FLOAT)
	AS
    BEGIN
		UPDATE dbo.KHACHHANG SET tenKhachHang = @tenKhachHang, diaChi = @diaChi, soDienThoai = @soDienThoai, noDauKi = @noDauKi, noHienTai = @noHienTai WHERE maKhachHang = @maKhachHang
	END
    GO
	-->
	EXEC dbo.USP_UpdateKhachHang @maKhachHang = '{0}', @tenKhachHang = N'{1}', @diaChi = N'{2}', @soDienThoai = '{3}', @noDauKi = 0, @noHienTai = 0
	GO

	-- Xóa Khách Hàng
	CREATE PROC USP_DeleteKhachHang (@maKhachHang VARCHAR(10))
	AS
    BEGIN
        DELETE dbo.KHACHHANG WHERE maKhachHang = @maKhachHang
    END
	GO
    -->
	EXEC dbo.USP_DeleteKhachHang @maKhachHang = '' -- varchar(10)
	GO 

--LOẠI SẢN PHẨM
	-- Thêm Loại Sản Phẩm
	ALTER PROC USP_InsertLoaiSP (@maLoaiSanPham VARCHAR(10), @tenLoaiSanPham NVARCHAR(100))
	AS
    BEGIN
		INSERT dbo.LOAISANPHAM (maLoaiSanPham, tenLoaiSanPham) VALUES (@maLoaiSanPham, @tenLoaiSanPham)
	END
	GO
	-->
	EXEC dbo.USP_InsertLoaiSP @maLoaiSanPham = '{0}', @tenLoaiSanPham = N'{1}'
	GO

	-- Sửa Loại Sản Phẩm
	ALTER PROC USP_UpdateLoaiSP (@maLoaiSanPham VARCHAR(10), @tenLoaiSanPham NVARCHAR(100))
	AS
    BEGIN
		UPDATE dbo.LOAISANPHAM SET tenLoaiSanPham = @tenLoaiSanPham WHERE maLoaiSanPham = @maLoaiSanPham
	END
	GO
	-->
	EXEC dbo.USP_UpdateLoaiSP @maLoaiSanPham = '{0}', @tenLoaiSanPham = N'{2}'
	GO
    
	-- Xóa Loại Sản Phẩm
	ALTER PROC USP_DeleteLoaiSP (@maLoaiSanPham VARCHAR(10))
	AS
    BEGIN
		DELETE dbo.LOAISANPHAM WHERE maLoaiSanPham = @maLoaiSanPham 
    END
	GO
	-->
	EXEC dbo.USP_DeleteLoaiSP @maLoaiSanPham = 'VL15'
	GO

-- SẢN PHẨM
	-- Thêm Sản phẩm
	CREATE PROC USP_InsertSanPham (@maSanPham VARCHAR(10), @tenSanPham NVARCHAR(50), @nhaSanXuat NVARCHAR(100), @maLoaiSP VARCHAR(10))
	AS
    BEGIN
        INSERT dbo.SANPHAM (maSanPham, tenSanPham, nhaSanXuat, maLoaiSanPham) VALUES
        (   @maSanPham,  -- maSanPham - varchar(10)
            @tenSanPham, -- tenSanPham - nvarchar(50)
            @nhaSanXuat, -- nhaSanXuat - nvarchar(100)
            @maLoaiSP   -- maLoaiSanPham - varchar(10)
            )
    END
	GO
	-->
	EXEC dbo.USP_InsertSanPham @maSanPham = '', @tenSanPham = N'', @nhaSanXuat = N'', @maLoaiSP = ''
	GO

	-- Sửa Sản Phẩm
	CREATE PROC USP_UpdateSanPham (@maSanPham VARCHAR(10), @tenSanPham NVARCHAR(50), @nhaSanXuat NVARCHAR(100), @maLoaiSP VARCHAR(10))
	AS
    BEGIN
        UPDATE dbo.SANPHAM SET tenSanPham = @tenSanPham, nhaSanXuat = @nhaSanXuat, maLoaiSanPham = @maLoaiSP WHERE maSanPham = @maSanPham
    END
	GO
	-->
	EXEC dbo.USP_UpdateSanPham @maSanPham = '', @tenSanPham = N'', @nhaSanXuat = N'', @maLoaiSP = ''
	GO
    
	-- Xoá Sản Phẩm
	CREATE PROC USP_DeleteSanPham (@maSanPham VARCHAR(10))
	AS
    BEGIN
        DELETE dbo.SANPHAM WHERE maSanPham = @maSanPham
    END
	GO
	-->
	EXEC dbo.USP_DeleteSanPham @maSanPham = ''
	GO	

-- HÓA ĐƠN & CHI TIẾT HÓA ĐƠN
	-- Thêm Hóa Đơn & Chi tiết Hóa Đơn
	CREATE PROC USP_InsertHoaDon (@soHoaDon VARCHAR(10), @maKhachHang VARCHAR(10), @ngayHoaDon DATETIME)
	AS
    BEGIN
        INSERT dbo.HOADON (soHoaDon, maKhachHang, ngayHoaDon)
        VALUES
        (   @soHoaDon,       -- soHoaDon - varchar(10)
            @maKhachHang,       -- maKhachHang - varchar(10)
            @ngayHoaDon -- ngayHoaDon - datetime
            )
    END
	GO
    
	CREATE PROC USP_InsertChiTietHoaDon (@maHoaDon VARCHAR(10), @maSanPham VARCHAR(10), @soLuong INT, @donGia FLOAT)
	AS
    BEGIN
        INSERT dbo.CHITIETHOADON (maHoaDon, maSanPham, soLuong, donGia)
        VALUES
        (   @maHoaDon, -- maHoaDon - varchar(10)
            @maSanPham, -- maSanPham - varchar(10)
            @soLuong,  -- soLuong - int
            @donGia -- donGia - float
            )
    END
	GO 
	-->
	EXEC dbo.USP_InsertHoaDon @soHoaDon = '', @maKhachHang = '', @ngayHoaDon = '2018-12-20 18:37:36'
	EXEC dbo.USP_InsertChiTietHoaDon @maHoaDon = '', @maSanPham = '', @soLuong = 0, @donGia = 0.0
	GO
    
	-- Sửa Hóa Đơn & Chi tiết Hóa Đơn
	CREATE PROC USP_UpdateHoaDon (@soHoaDon VARCHAR(10), @maKhachHang VARCHAR(10), @ngayHoaDon DATETIME)
	AS
    BEGIN
        UPDATE dbo.HOADON SET maKhachHang = @maKhachHang, ngayHoaDon = @ngayHoaDon WHERE soHoaDon = @soHoaDon
    END
	GO 

	CREATE PROC USP_UpdateChiTietHoaDon (@maHoaDon VARCHAR(10), @maSanPham VARCHAR(10), @soLuong INT, @donGia FLOAT)
	AS
	BEGIN
	    UPDATE dbo.CHITIETHOADON SET maSanPham = @maSanPham, soLuong = @soLuong, donGia = @donGia WHERE maHoaDon = @maHoaDon
	END
	GO 
	-->
	EXEC dbo.USP_UpdateHoaDon @soHoaDon = '', @maKhachHang = '', @ngayHoaDon = '2018-12-20 18:45:25'
	EXEC dbo.USP_UpdateChiTietHoaDon @maHoaDon = '', @maSanPham = '', @soLuong = 0, @donGia = 0.0
	GO
	
	-- Xóa Hóa Đơn & Chi tiết Hóa Đơn
	CREATE PROC USP_DeleteHoaDon (@soHoaDon VARCHAR(10))
	AS
    BEGIN
        DELETE dbo.HOADON WHERE soHoaDon = @soHoaDon
    END
	GO
    
	CREATE PROC USP_DeleteChiTietHonDon (@maHoaDon VARCHAR(10))
	AS
    BEGIN
        DELETE dbo.CHITIETHOADON WHERE maHoaDon = @maHoaDon
    END
	GO 
	-->
	EXEC dbo.USP_DeleteHoaDon @soHoaDon = '' -- varchar(10)
	EXEC dbo.USP_DeleteChiTietHonDon @maHoaDon = '' -- varchar(10)
	GO 

-- THANH TOÁN
	-- Thêm Thanh Toán
	CREATE PROC USP_InsertThanhToan (@soPhieu VARCHAR(10), @ngayPhieu DATETIME, @soTien FLOAT, @maKhachHang VARCHAR(10))
	AS
    BEGIN
        INSERT dbo.THANHTOAN (soPhieu, ngayPhieu, soTien, maKhachHang)
        VALUES
        (   @soPhieu,        -- soPhieu - varchar(10)
            @ngayPhieu, -- ngayPhieu - date
            @soTien,       -- soTien - float
            @maKhachHang         -- maKhachHang - varchar(10)
            )
    END
	GO

	EXEC dbo.USP_InsertThanhToan @soPhieu = '', @ngayPhieu = '2018-12-20 18:52:05', @soTien = 0.0, @maKhachHang = ''
	GO

	-- Sửa Thanh Toán
	CREATE PROC USP_UpdateThanhToan (@soPhieu VARCHAR(10), @ngayPhieu DATETIME, @soTien FLOAT, @maKhachHang VARCHAR(10))
	AS
    BEGIN
        UPDATE dbo.THANHTOAN SET ngayPhieu = @ngayPhieu, soTien = @soTien, maKhachHang = @maKhachHang WHERE soPhieu = @soPhieu
    END
	GO
    
	EXEC dbo.USP_UpdateThanhToan @soPhieu = '', @ngayPhieu = '2018-12-20 18:55:03', @soTien = 0.0, @maKhachHang = ''
	GO	

    -- Xóa Thanh Toán
	CREATE PROC USP_DeleteThanhToan (@soPhieu VARCHAR(10))
	AS
	BEGIN
	    DELETE dbo.THANHTOAN WHERE soPhieu = @soPhieu
	END
	GO

	EXEC dbo.USP_DeleteThanhToan @soPhieu = '' -- varchar(10)
	GO
    
    SELECT maKhachHang AS [Mã khách hàng], tenKhachHang AS [Tên khách hàng] FROM dbo.KHACHHANG
	DELETE dbo.SANPHAM WHERE maLoaiSanPham = 'VL15'
	SELECT * FROM dbo.LOAISANPHAM WHERE maLoaiSanPham = ''
				-------------------------------------------------------------------------------------------------------------------------------------------

package model;

import java.sql.Date;

public class KhachHang {
	private String id;
	private String hovaTen;
	private Date ngaySinh;
	private String diaChi;
	public KhachHang() {
		super();
	}
	public KhachHang(String id, String hovaTen, Date ngaySinh, String diaChi) {
		super();
		this.id = id;
		this.hovaTen = hovaTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHovaTen() {
		return hovaTen;
	}
	public void setHovaTen(String hovaTen) {
		this.hovaTen = hovaTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return "KhachHang [id=" + id + ", hovaTen=" + hovaTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + "]";
	}
	
	
}

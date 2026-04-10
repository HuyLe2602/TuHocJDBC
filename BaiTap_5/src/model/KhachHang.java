package model;

import java.sql.Date;

public class KhachHang {
	private int Id;
	private String hovaTen;
	private Date ngaySinh;
	private String diaChi;
	public KhachHang() {
		super();
	}
	public KhachHang(int id, String hovaTen, Date ngaySinh, String diaChi) {
		super();
		Id = id;
		this.hovaTen = hovaTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	
	
}

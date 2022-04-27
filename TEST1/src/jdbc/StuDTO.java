package jdbc;

public class StuDTO {
	private String num;
	private String depart;
	private String dname;
	private String address;
	private String phone;
	public String getNum() {
		return num;
	}
	public String getDepart() {
		return depart;
	}
	public String getDname() {
		return dname;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public StuDTO(String num, String depart, String dname, String address, String phone) {
		super();
		this.num = num;
		this.depart = depart;
		this.dname = dname;
		this.address = address;
		this.phone = phone;
	}
	
}

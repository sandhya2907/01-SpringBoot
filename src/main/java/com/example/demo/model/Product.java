package com.example.demo.model;

public class Product {
	private Integer pid;
	private String pname;
	private String Category;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", Category=" + Category + "]";
	}

}

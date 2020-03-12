package com.vue.cms.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Article {
	public Article(BigDecimal id, String title, String department, Date postDate) {
		super();
		this.id = id;
		this.title = title;
		this.department = department;
		this.postDate = postDate;
	}

	private BigDecimal id;

	private String title;

	private String department;

	private String author = "Summer";

	private Date postDate;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

}

package com.example.app.entity;

import java.util.Date;

public class Notice {
	
	private String title;
	private int id;
	private String writerid;
	private Date regDate;
	private String content;
	private int hit;
	private String files;
	
	public Notice() {
		
	}
	
	
	public Notice(String title, int id, String writerid, Date regDate, String content, int hit, String files) {
	
		this.title = title;
		this.id = id;
		this.writerid = writerid;
		this.regDate = regDate;
		this.content = content;
		this.hit = hit;
		this.files = files;
	}







	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWriterid() {
		return writerid;
	}
	public void setWriterid(String writerid) {
		this.writerid = writerid;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}
	
	
	

}

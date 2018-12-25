package com.example.readinglist;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="book")
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@XmlElement(name = "id")
	private Long id;
	
	@Column(name="isbn")
	@XmlElement(name = "isbn")
	private String isbn;
	
	@Column(name="title")
	@XmlElement(name = "title")
	private String title;
	
	@Column(name="author")
	@XmlElement(name = "author")
	private String author;
	
	@Column(name="description")
	@XmlElement(name = "description")
	private String description;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	} 
}
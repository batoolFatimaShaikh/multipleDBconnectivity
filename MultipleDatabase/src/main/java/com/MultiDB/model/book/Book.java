package com.MultiDB.model.book;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data

public class Book {
 
	 @Id
	 private int Id;
	 private String name;
	public Book() {
		super();
	}
	public Book(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [Id=" + Id + ", name=" + name + "]";
	}
	 
	 
	 
	 
	 
}

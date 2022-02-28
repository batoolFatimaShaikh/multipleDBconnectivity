package com.MultiDB.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="UserTB")
public class User {
	
	@Id
	private int Id;
	private String username;
	public User() {
		super();
	}
	public User(int id, String username) {
		super();
		Id = id;
		this.username = username;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", username=" + username + "]";
	}
	
	

}

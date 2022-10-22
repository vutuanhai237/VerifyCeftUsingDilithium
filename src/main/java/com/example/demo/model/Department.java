package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;


@Entity
@Table(name = "Department")
@Component
public class Department {
	@Id
	@GeneratedValue
	@Column(name = "departmentID")
	private Long departmentID;
	@Column(name = "name")
	private String name;

	public Department() {
		this.name = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return this.departmentID;
	}

	public void setId(long id) {
		this.departmentID = id;
	}

}


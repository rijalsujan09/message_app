package com.projectzero.app.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "emails")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Email {

	@Id
	private String id;
	private String email;
	private String subject;
	private String message;

}
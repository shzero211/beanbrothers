package com.sh.beanbrothers.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sh.beanbrothers.constant.Gender;
import com.sh.beanbrothers.constant.Role;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false)
private String userName;

@Column(nullable = false)
private String password;

@Column(nullable = false)
private String email;

@Column(nullable = false)
private String phoneNum;

@Enumerated(EnumType.STRING)
@Column(nullable = false)
private Gender gender;

@Enumerated(EnumType.STRING)
@Column(nullable = false)
private Role userRole;

@Column(nullable = false)
private LocalDateTime birthday;

private String recomUser;

}

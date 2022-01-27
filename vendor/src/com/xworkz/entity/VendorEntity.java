package com.xworkz.entity;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

@Entity
@Table(name = "vendor_details")
public class VendorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "v_id")
	private int id;
	@Column(name = "v_name")
	private String name;
	@Column(name = "v_email")
	private String email;
	@Column(name = "v_loginName")
	private String loginName;
	@Column(name = "v_password")
	private String password;
	@Column(name = "v_address")
	private String address;
	@Column(name = "v_gstNumber")
	private String gstNumber;
	@Column(name = "v_createdBy")
	private String createdBy;
	@Column(name = "v_createdAt")
	private LocalDateTime createdAt;
	@Column(name = "v_updatedBy")
	private String updatedBy;
	@Column(name = "v_updatedAt")
	private LocalDateTime updatedAt;
	public VendorEntity(String name, String email, String loginName, String password, String address, String gstNumber,
			String createdBy, LocalDateTime createdAt, String updatedBy, LocalDateTime updatedAt) {
		super();
		this.name = name;
		this.email = email;
		this.loginName = loginName;
		this.password = password;
		this.address = address;
		this.gstNumber = gstNumber;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
	}
}

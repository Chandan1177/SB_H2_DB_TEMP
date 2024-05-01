package com.asr.sb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	private Integer pid;
	private String pname;
	private Double price;
}

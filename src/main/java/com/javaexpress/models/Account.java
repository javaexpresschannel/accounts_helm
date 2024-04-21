package com.javaexpress.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountNumber;
	private int customerId;
	private String accountType;
	private String branchAddress;
	private LocalDate createDt;
}

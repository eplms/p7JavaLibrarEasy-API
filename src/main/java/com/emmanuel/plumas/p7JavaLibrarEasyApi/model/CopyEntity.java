package com.emmanuel.plumas.p7JavaLibrarEasyApi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="copy")
public class CopyEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long copyId;
	
	@ManyToOne
	@JoinColumn(name="book_id")
	private BookEntity bookEntity;
}

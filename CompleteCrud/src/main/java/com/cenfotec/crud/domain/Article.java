package com.cenfotec.crud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Article {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	private String name;
	
	@ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
	private Antology anthology;
	
}

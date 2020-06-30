package com.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "VECHILE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Vechile {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "VECHILE_ID")
	private int vechileId;
	
	@Column(name="VECHILE_NAME")
	private String vechileName;

	public int getVechileId() {
		return vechileId;
	}

	public void setVechileId(int vechileId) {
		this.vechileId = vechileId;
	}

	public String getVechileName() {
		return vechileName;
	}

	public void setVechileName(String vechileName) {
		this.vechileName = vechileName;
	}
	
	
	
	
	
	
}

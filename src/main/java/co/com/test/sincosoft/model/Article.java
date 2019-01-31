package co.com.test.sincosoft.model;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Article extends AbstractPersistable<Long>{

	private static final long serialVersionUID = 1L;
	private String nameArt;
	private String codeArt;
	
	public String getNameArt() {
		return nameArt;
	}
	public void setNameArt(String nameArt) {
		this.nameArt = nameArt;
	}
	public String getCodeArt() {
		return codeArt;
	}
	public void setCodeArt(String codeArt) {
		this.codeArt = codeArt;
	}
	
	
}

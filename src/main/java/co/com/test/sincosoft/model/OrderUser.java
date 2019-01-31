package co.com.test.sincosoft.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class OrderUser extends AbstractPersistable<Long> {

	
	private static final long serialVersionUID = 1L;
	private String nameOrder;
	private String codeOrder;
	private Date dateOrder;
	private Integer count;
	private boolean complete;
	@ManyToOne
	private User user;
	@ManyToOne
	private Article article;
	
	
	public Date getDateOrder() {
		return dateOrder;
	}
	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public String getNameOrder() {
		return nameOrder;
	}
	public void setNameOrder(String nameOrder) {
		this.nameOrder = nameOrder;
	}
	public String getCoderOrder() {
		return codeOrder;
	}
	public void setCoderOrder(String coderOrder) {
		this.codeOrder = coderOrder;
	}
	
	

}

package com.netflixshowsreview;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OrderBy;

@Entity
public class NetflixShow {

	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	private String imageUrl;
	private int year;
	private String creators;
	private String stars;

	@ManyToOne
	@OrderBy("categoryName")
	private Category category;
	
	@Lob
	private String description;
		
	@Lob
	private String review;

	public NetflixShow(String title, String imageUrl, String creators, int year, Category category, String stars, String description, String review) {
		this.title = title;
		this.imageUrl = imageUrl;
		this.creators = creators;
		this.year = year;
		this.category = category;
		this.stars = stars;
		this.description = description;
		this.review = review;
	}
	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}

	public int getYear() {
		return year;
	}

	public Category getCategory() {
		return category;
	}

	public String getDirector() {
		return creators;
	}

	public String getStars() {
		return stars;
	}

	public String getDescription() {
		return description;
	}

	public String getReview() {
		return review;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setCreators(String creators) {
		this.creators = creators;
	}

	public void setStars(String stars) {
		this.stars = stars;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return (title + creators + year + category + stars + description + review);
	}

	public NetflixShow() {

	}

}

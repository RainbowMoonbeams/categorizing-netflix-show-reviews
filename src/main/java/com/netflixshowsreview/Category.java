package com.netflixshowsreview;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;
	private String categoryName;

	@OneToMany(mappedBy = "category")
	@OrderBy("title")
	private Set<NetflixShow> showsSet;

	public Set<NetflixShow> getShowsSet() {
		return showsSet;
	}

	public Long getId() {
		return id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	@Override
	public String toString() {
		return categoryName;
	}

	public Category(String categoryName) {
		this.categoryName = categoryName;
	}

	public Category() {

	}

}

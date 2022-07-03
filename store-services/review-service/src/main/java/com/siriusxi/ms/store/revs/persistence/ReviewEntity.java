package com.siriusxi.ms.store.revs.persistence;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "review", indexes = {
		@Index(name = "review_unique_idx", unique = true, columnList = "productId, reviewId") })
@NoArgsConstructor
@RequiredArgsConstructor
public class ReviewEntity {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;

	@Version
	private int version;

	@NonNull
	private int productId;
	@NonNull
	private int reviewId;
	@NonNull
	@NotBlank
	@Size(min = 6, max = 50)
	private String author;
	@NonNull
	@NotBlank
	private String subject;
	@NonNull
	@NotBlank
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}

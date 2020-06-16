package com.example.reviewsite.demo;

public class Review {

    private long id;
    private String reviewTitle;
    private String imageUrl;
    private String reviewCategory;
    private String reviewContent;

    public Review(Long id, String reviewTitle, String imageUrl, String reviewCategory, String reviewContent){
        this.id = id;
        this.reviewTitle = reviewTitle;
        this.imageUrl = imageUrl;
        this.reviewCategory = reviewCategory;
        this.reviewContent = reviewContent;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public void setReviewCategory(String reviewCategory) {
        this.reviewCategory = reviewCategory;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

}
package com.hello.demo.vo;






public class ProductVO {

    private String productId;

   // @NotNull(message = "productName should not be null!")
 //   @NotEmpty(message = "productName should not be empty!")
    private String productName;
    private String description;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableItemCount() {
        return availableItemCount;
    }

    public void setAvailableItemCount(int availableItemCount) {
        this.availableItemCount = availableItemCount;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    //   @Min(value = 0)
    private double price;
    private int availableItemCount;
    private String imageId;

  //  @NotNull(message = "productCategoryId should not be null!")
 //   @NotEmpty(message = "productCategoryId should not be empty!")
    private String productCategoryId;
    private String productCategoryName;
}

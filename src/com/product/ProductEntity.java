package com.product;

public class ProductEntity {

	private int productId;
	private String ProductName;
	private int ProducQty;
	private double productPrize;
	private String mfgDate;
	private String expdDate;

	public ProductEntity() {
		// TODO Auto-generated constructor stub
	}

	public ProductEntity(int productId, String productName, int producQty, double productPrize, String mfgDate,
			String expdDate) {
		this.productId = productId;
		ProductName = productName;
		ProducQty = producQty;
		this.productPrize = productPrize;
		this.mfgDate = mfgDate;
		this.expdDate = expdDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getProducQty() {
		return ProducQty;
	}

	public void setProducQty(int producQty) {
		ProducQty = producQty;
	}

	public double getProductPrize() {
		return productPrize;
	}

	public void setProductPrize(double productPrize) {
		this.productPrize = productPrize;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getExpdDate() {
		return expdDate;
	}

	public void setExpdDate(String expdDate) {
		this.expdDate = expdDate;
	}

}

package com.inventory.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class InventoryItem {

	 @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
	    private String productCode;
	    private Integer availableQuantity ;
		
		public InventoryItem(String string, int i) {
			
			this.productCode=string;
			this.availableQuantity=i;
			
			
		}
		public InventoryItem() {
			super();
			// TODO Auto-generated constructor stub
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getProductCode() {
			return productCode;
		}
		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
		public Integer getAvailableQuantity() {
			return availableQuantity;
		}
		public void setAvailableQuantity(Integer availableQuantity) {
			this.availableQuantity = availableQuantity;
		}
		
		
		
	

}

package com.inventory.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.demo.entities.InventoryItem;

@Repository
public interface InventoryServiceDao extends JpaRepository<InventoryItem,Long>{
	
	 InventoryItem getInventoryItemByProductCode(String productCode);
	
	

}

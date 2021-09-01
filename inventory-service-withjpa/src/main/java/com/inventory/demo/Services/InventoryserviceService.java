package com.inventory.demo.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.demo.dao.InventoryServiceDao;
import com.inventory.demo.entities.InventoryItem;
@Service
public class InventoryserviceService implements InventoryserviceServiceInterface{
	
	@Autowired
	private InventoryServiceDao inventoryserviceDao;
	
	
	
	public InventoryItem findInventoryByProductCode(String pcode ) {
		
		return inventoryserviceDao.getInventoryItemByProductCode(pcode);
		
	}
	 public ArrayList<InventoryItem> getInventory() {
	        return (ArrayList<InventoryItem>) inventoryserviceDao.findAll();
	        
	        
	    }
	 
	 
	 public InventoryItem insertInventoryItem(InventoryItem inventoryItem) {
	        return inventoryserviceDao.save(inventoryItem);
	    }
	

	

}

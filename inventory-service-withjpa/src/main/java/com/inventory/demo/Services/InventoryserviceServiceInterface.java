package com.inventory.demo.Services;

import java.util.ArrayList;

import com.inventory.demo.entities.InventoryItem;

public interface InventoryserviceServiceInterface {
	
	
	InventoryItem findInventoryByProductCode(String pcode );
	ArrayList<InventoryItem> getInventory();
	InventoryItem insertInventoryItem(InventoryItem inventoryItem);

}

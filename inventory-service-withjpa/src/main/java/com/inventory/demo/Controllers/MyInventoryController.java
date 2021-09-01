package com.inventory.demo.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.demo.Services.InventoryserviceService;
import com.inventory.demo.entities.InventoryItem;

@RestController
public class MyInventoryController {
	
	@Autowired
	InventoryserviceService inventoryService;
	
	
	@GetMapping("/inventories")
	public ArrayList<InventoryItem> getInventory(){
		
		return inventoryService.getInventory();
		
		
	}
	

	
	@GetMapping("/inventory/code/{pcode}")
	public InventoryItem findInventoryByProductCode(@PathVariable String pcode) {
		
		return inventoryService.findInventoryByProductCode(pcode);
		
		
	}
	
	
	
	
	

}

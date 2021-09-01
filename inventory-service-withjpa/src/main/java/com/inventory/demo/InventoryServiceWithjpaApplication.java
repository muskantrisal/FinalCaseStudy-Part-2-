package com.inventory.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.inventory.demo.Services.InventoryserviceService;
import com.inventory.demo.entities.InventoryItem;

@SpringBootApplication(scanBasePackages = "com.inventory")
@EnableJpaRepositories(basePackages = "com.inventory.demo.dao")
@EntityScan(basePackages = "com.inventory.demo.entities")

public class InventoryServiceWithjpaApplication implements CommandLineRunner{
	
	 @Autowired
	 InventoryserviceService inventoryService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceWithjpaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		 inventoryService.insertInventoryItem(new InventoryItem("P10",7));
	     inventoryService.insertInventoryItem(new InventoryItem("P20",4));
	     inventoryService.insertInventoryItem(new InventoryItem("P30",5));
	     inventoryService.insertInventoryItem(new InventoryItem("P40",2));
	     inventoryService.insertInventoryItem(new InventoryItem("P50",7));
	     inventoryService.insertInventoryItem(new InventoryItem("P60",8));
		
	}

}

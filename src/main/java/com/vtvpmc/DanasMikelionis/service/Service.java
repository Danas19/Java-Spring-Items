package com.vtvpmc.DanasMikelionis.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vtvpmc.DanasMikelionis.Application;
import com.vtvpmc.DanasMikelionis.CreateItemCommand;
import com.vtvpmc.DanasMikelionis.model.Item;
import com.vtvpmc.DanasMikelionis.repository.ItemRepository;

public class Service {
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static Collection<Item> getItems(ItemRepository itemRepository) {
		log.info("getItems(ItemRepository)"
				+ " from the class Service was used. Returning collection: "
					+ itemRepository.findAll() + "\n");
		return itemRepository.findAll();
	}
	
	public static Item getItem(ItemRepository itemRepository, long id) {
		Item item = itemRepository.findById(id).orElse(null);
		log.info("getItem(ItemRepository, long) method from class Service "
				+ "was used. Returning item: " + item + "\n");
		return item;
	}
	
	public static String createItem(ItemRepository itemRepository,
			 CreateItemCommand createItemCommand) {
		Item item = new Item(createItemCommand.getName(),
				createItemCommand.getPriceEuros(), createItemCommand.getPriceCents());
		itemRepository.save(item);
		log.info("createItem(ItemRepository , CreateItemCommand) method from class "
				+ "Service was used. Returning String: " + "Created item: " + item + "\n");
		return "Created item: " + item;
	}
	
	public static String deleteItem(ItemRepository itemRepository, long id) {
		Item item = itemRepository.findById(id).orElse(null);
		
		log.info("deleteItem(ItemRepository, long) from class Service was "
				+ "used. returning String: ");
		if (item != null) {
			itemRepository.deleteById(id);
			log.info(item.toString() + "\n");
			return item.toString();
		} else {
			log.info("No item deleted. There is no item with id: " + id + "\n");
			return "No item deleted. There is no item with id: " + id + "\n";
		}
	}
}

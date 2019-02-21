package com.vtvpmc.DanasMikelionis.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vtvpmc.DanasMikelionis.CreateItemCommand;
import com.vtvpmc.DanasMikelionis.model.Item;
import com.vtvpmc.DanasMikelionis.repository.ItemRepository;

public class Service {
	private static final Logger log = LoggerFactory.getLogger(Service.class);
	
	public static Collection<Item> getItems(ItemRepository itemRepository) {
		log.info("getItems(ItemRepository) method was used \n\tpassing: "
				+ itemRepository + ".\n\tReturning collection: "
					+ itemRepository.findAll() + "\n");
		return itemRepository.findAll();
	}
	
	public static Item getItem(ItemRepository itemRepository, long id) {
		Item item = itemRepository.findById(id).orElse(null);
		log.info("getItem(ItemRepository, long) method "
				+ "was used \n\tpassing: " + id + "L.\n\tReturning item: " + item + "\n");
		return item;
	}
	
	public static String createItem(ItemRepository itemRepository,
			 CreateItemCommand createItemCommand) {
		Item item = new Item(createItemCommand.getName(),
				createItemCommand.getPriceEuros(), createItemCommand.getPriceCents());
		itemRepository.save(item);
		log.info("createItem(ItemRepository, CreateItemCommand) method was "
				+ "used \n\tpassing: " + itemRepository + ", " + createItemCommand + 
					".\n\tReturning String: " + "\"Created item: " + item + "\"\n");
		return "Created item: " + item;
	}
	
	public static String deleteItem(ItemRepository itemRepository, long id) {
		Item item = itemRepository.findById(id).orElse(null);
		
		log.info("deleteItem(ItemRepository, long) method was used \n\tpassing: "
				+ itemRepository + ", " + id + "L.\n\tReturning String: \"");
		if (item != null) {
			itemRepository.deleteById(id);
			log.info(item.toString() + "\"\n");
			return item.toString();
		} else {
			log.info("No item deleted. There is no item with id: " + id + "\"\n");
			return "No item deleted. There is no item with id: " + id + "\n";
		}
	}
}

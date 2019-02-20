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
		if (itemRepository.findAll().size() == 0) {
			log.info("! Returning empty list");
		} else {
			log.info("Returning list");
		}
		return itemRepository.findAll();
	}
	
	public static Item getItem(ItemRepository itemRepository, long id) {
		Item item = itemRepository.findById(id).orElse(null);
		if (item != null) {
			log.info("Returning item: " + item);
		} else {
			log.info("! Returning null. No item with id: '" + id + "' was found.");
		}
		return item;
	}
	
	public static String createItem(ItemRepository itemRepository,
			 CreateItemCommand createItemCommand) {
		Item item = new Item(createItemCommand.getName(),
				createItemCommand.getPriceEuros(), createItemCommand.getPriceCents());
		itemRepository.save(item);
		log.info("Creatied item: " + item);
		return "Created item: " + item;
	}
	
	public static String deleteItem(ItemRepository itemRepository, long id) {
		Item item = itemRepository.findById(id).orElse(null);
		if (item != null) {
			itemRepository.deleteById(id);
			log.info("Deleting item: " + item);
			return "Deleted item: " + item;
		} else {
			log.info("! Item with id: '" + id + "' was NOT deleted. "
					+ "There is no item with that id");
			return "! Item with id: '" + id + "' was NOT deleted. "
					+ "There is no item with that id";
		}
	}
}

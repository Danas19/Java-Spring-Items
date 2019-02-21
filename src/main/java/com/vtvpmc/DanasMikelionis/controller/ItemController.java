package com.vtvpmc.DanasMikelionis.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vtvpmc.DanasMikelionis.CreateItemCommand;
import com.vtvpmc.DanasMikelionis.model.Item;
import com.vtvpmc.DanasMikelionis.repository.ItemRepository;
import com.vtvpmc.DanasMikelionis.service.Service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "item")
@RequestMapping(value = "api/items")
public class ItemController {
	private static final Logger log = LoggerFactory.getLogger(ItemController.class);
	
	@Autowired
	ItemRepository itemRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get items", notes = "Returns regsitered items.")
	public Collection<Item> getItems() {
		log.info("getItems() method was used \n\tpassing nothing.\n\t"
				+ "Returning collection: " + Service.getItems(itemRepository) + ".\n");
		return Service.getItems(itemRepository);
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get item", notes = "Returns item by id")
	public Item getItem(@PathVariable final long id) {
		Item itemToBeReturned = Service.getItem(itemRepository, id);
		log.info("getItem(@PathVariable final long) method was used \n\tpassing: "
		+ id + "L.\n\tReturning Item: " + itemToBeReturned);
		return itemToBeReturned;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String createItem(@RequestBody @Valid
			CreateItemCommand createItemCommand) {
		String createItemString = Service.createItem(itemRepository, createItemCommand);
		log.info("createItem(@RequestBody @Valid CreateItemCommand) method was used \n\tpassing: " 
				+ createItemCommand + ".\n\tReturning String: \"" + createItemString + "\"\n");
		return createItemString;
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
		public String deleteItem(@PathVariable final long id) {
			String deleteItemString = Service.deleteItem(itemRepository, id);
			log.info("deleteItem(@PathVariable final long) method was used \n\tpassing: "
					+ id + "L.\n\tReturning String: \"" + deleteItemString + "\"\n");
			return deleteItemString;
		}
}

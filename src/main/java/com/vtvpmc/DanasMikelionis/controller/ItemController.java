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

import com.vtvpmc.DanasMikelionis.Application;
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
		return Service.getItems(itemRepository);
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get item", notes = "Returns item by id")
	public Item getItem(@PathVariable final long id) {
		return Service.getItem(itemRepository, id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String createItem(@RequestBody @Valid
			CreateItemCommand createItemCommand) {
		return Service.createItem(itemRepository, createItemCommand);
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
		public String deleteItem(@PathVariable final long id) {
			
			return Service.deleteItem(itemRepository, id);
		}
}

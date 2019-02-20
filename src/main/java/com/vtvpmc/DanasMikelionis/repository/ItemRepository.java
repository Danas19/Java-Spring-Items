package com.vtvpmc.DanasMikelionis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vtvpmc.DanasMikelionis.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
//	Set<Item> items = new TreeSet<>((i1, i2) -> {
//		if (i1.getId() > i2.getId()) {
//			return 1;
//			} else if (i1.getId() < i2.getId()) {
//				return -1;
//			} else {
//				return 0;
//			}
//	});
}

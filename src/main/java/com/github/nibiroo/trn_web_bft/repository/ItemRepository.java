package com.github.nibiroo.trn_web_bft.repository;

import com.github.nibiroo.trn_web_bft.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

package com.hwl.springmvc.pojo;

import java.util.List;

public class QueryVo {

	
	//商品
	private Items items;

	private Integer[] ids;

	private List<Items> itemsList;
	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	public List<Items> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<Items> itemsList) {
		this.itemsList = itemsList;
	}
}

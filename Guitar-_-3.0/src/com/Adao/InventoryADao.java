package com.Adao;

import java.util.List;

import model.Guitar;

public interface InventoryADao {
	public List<Guitar> loaddata() throws Exception;
}

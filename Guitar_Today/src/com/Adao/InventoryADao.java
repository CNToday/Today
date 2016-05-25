package com.Adao;

import java.util.List;

import model.Guitar;

public interface InventoryADao {
	public boolean addGuitar() throws Exception;	
	public boolean updateGuitar() throws Exception;
	public boolean deleteGuitar() throws Exception;
	public List<Guitar> searchGuitar(Guitar  Guitar) throws Exception;
}

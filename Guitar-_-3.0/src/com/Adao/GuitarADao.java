package com.Adao;
import model.Guitar;
public interface GuitarADao {
	public boolean addGuitar(Guitar guitar) throws Exception;
	public boolean updateGuitar(Guitar guitar) throws Exception;
	public boolean deleteGuitar(int id) throws Exception;
}

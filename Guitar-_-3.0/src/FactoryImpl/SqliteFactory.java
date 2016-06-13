package FactoryImpl;

import com.Adao.GuitarADao;
import com.Adao.InventoryADao;
import com.DaoImpl.SqliteGuitarDaoImpl;
import com.DaoImpl.SqliteInventoryDaoImpl;

import IFactory.IDaoFactory;
import model.Guitar;

public class SqliteFactory implements IDaoFactory {

	@Override
	public GuitarADao GetGuitarInstance() throws Exception {
		// TODO Auto-generated method stub
		return new SqliteGuitarDaoImpl();
	}

	@Override
	public InventoryADao GetInventoryInstance() throws Exception {
		// TODO Auto-generated method stub
		return new SqliteInventoryDaoImpl();
	}

}

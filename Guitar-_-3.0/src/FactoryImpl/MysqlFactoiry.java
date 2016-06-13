package FactoryImpl;

import com.Adao.GuitarADao;
import com.Adao.InventoryADao;
import com.DaoImpl.MysqlGuitarDaoImpl;
import com.DaoImpl.MysqlInventoryDaoImpl;

import IFactory.IDaoFactory;

public class MysqlFactoiry  implements IDaoFactory {
	
	@Override
	public GuitarADao GetGuitarInstance() throws Exception {
		// TODO Auto-generated method stub
		return new MysqlGuitarDaoImpl();
	}
	@Override
	public InventoryADao GetInventoryInstance() throws Exception {
		// TODO Auto-generated method stub
		return new MysqlInventoryDaoImpl();
	}

}

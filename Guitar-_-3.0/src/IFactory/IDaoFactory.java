package IFactory;

import com.Adao.GuitarADao;
import com.Adao.InventoryADao;
import com.DaoImpl.SqliteGuitarDaoImpl;
import com.DaoImpl.SqliteInventoryDaoImpl;
public interface IDaoFactory {
public  GuitarADao GetGuitarInstance() throws Exception;
public  InventoryADao GetInventoryInstance() throws Exception;
}




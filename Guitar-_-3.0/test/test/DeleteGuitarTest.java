package test;

import FactoryImpl.MysqlFactoiry;
import IFactory.IDaoFactory;
import model.Guitar;

public class DeleteGuitarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//根据需要调换数据库
			IDaoFactory iDaoFactory=new  MysqlFactoiry();
			try {
				boolean a=iDaoFactory.GetGuitarInstance().deleteGuitar(1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
	}


package test;

import FactoryImpl.SqliteFactory;
import FactoryImpl.MysqlFactoiry;
import IFactory.IDaoFactory;
import model.Guitar;

public class AddsGuitarTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Guitar guitar=new Guitar(); 		
	guitar.setPrice(2.22);	
	guitar.setSerialNumber("664546");	
	//根据需要调换数据库
	IDaoFactory iDaoFactory=new  MysqlFactoiry();
	try {
		boolean a=iDaoFactory.GetGuitarInstance().addGuitar(guitar);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}

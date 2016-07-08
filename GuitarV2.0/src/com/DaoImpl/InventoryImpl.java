package com.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Idao.InventoryIDao;

import allenum.Builder;
import allenum.Type;
import allenum.Wood;
import model.Inventory;
import model.Guitar;
import model.GuitarSpec;
import util_connection.DataConnection;

public class InventoryImpl implements InventoryIDao  {
	
	public  List<Guitar> searchGuitar() throws Exception {
		return null;
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean updateGuitar() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteGuitar() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<Guitar> searchGuitar(Guitar Guitar) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean addGuitar(Guitar guitar) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean findAll() throws Exception {
		// TODO Auto-generated method stub
		String sql = "select * from guitar where 1=1 ";
		Connection conn=DataConnection.getConnection();
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ResultSet rs = ptmt.executeQuery();
		Inventory inventory=new Inventory();
		while (rs.next()) {
			System.out.println(rs.getDouble("price"));
				inventory.addGuitar(rs.getString("serialNumber"),rs.getDouble("price"), 
					new GuitarSpec(Builder.valueOf(rs.getString("builder")), rs.getString("model"), Type.valueOf(rs.getString("type")),rs.getInt("numStrings"), 
				                     Wood.valueOf(rs.getString("backwood")), Wood.valueOf(rs.getString("topwood")))
										);
					}
		ptmt.close();
		return true;
	}
}

package com.favourable.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.favourable.domain.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDao {
	
	private Connection connection;
	private String marketTable;
	
	//构造函数包括数据库连接、超市ID
	public ItemDao(Connection connection,int marketTable){
		this.connection = connection;
		this.marketTable = String.valueOf(marketTable);
	}
	
	//根据商品ID查询商品
	public Item getItemByItemID(int itemID)throws SQLException{
		String sql = "select * from ? where itemID=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, marketTable);
		preparedStatement.setInt(2, itemID);
		ResultSet resultSet = preparedStatement.executeQuery();
		Item item = null;
		while(resultSet.next()){
			item = new Item();
			item.setItemID(resultSet.getInt("itemID"));
			item.setItemName(resultSet.getString("itemName"));
			item.setOriginalPrice(resultSet.getString("originalPrice"));
			item.setCurrentPrice(resultSet.getString("currentPrice"));
			item.setDiscount(resultSet.getFloat("discount"));
			item.setProduct(resultSet.getString("product"));
			item.setMarketID(resultSet.getInt("marketID"));
			item.setCatagory(resultSet.getString("catagory"));
			item.setItemPicture(resultSet.getString("itemPicture"));	
		}
		return item;
	}
	
	//查询超市内所有商品
	public List<Item> getMarketItem()throws SQLException{
		String sql = "select * from ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, marketTable);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Item> itemList = new ArrayList<Item>();
		while(resultSet.next()){
			Item item = new Item();
			item.setItemID(resultSet.getInt("itemID"));
			item.setItemName(resultSet.getString("itemName"));
			item.setOriginalPrice(resultSet.getString("originalPrice"));
			item.setCurrentPrice(resultSet.getString("currentPrice"));
			item.setDiscount(resultSet.getFloat("discount"));
			item.setProduct(resultSet.getString("product"));
			item.setMarketID(resultSet.getInt("marketID"));
			item.setCatagory(resultSet.getString("catagory"));
			item.setItemPicture(resultSet.getString("itemPicture"));
			itemList.add(item);
		}
		return itemList;
	}
	
	//根据商品名称模糊查询
	public List<Item> getItemByItemName(String itemName)throws SQLException{
		String sql = "select * from ? where itemName like '%?%'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, marketTable);
		preparedStatement.setString(2, itemName);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Item> itemList = new ArrayList<Item>();
		while(resultSet.next()){
			Item item = new Item();
			item.setItemID(resultSet.getInt("itemID"));
			item.setItemName(resultSet.getString("itemName"));
			item.setOriginalPrice(resultSet.getString("originalPrice"));
			item.setCurrentPrice(resultSet.getString("currentPrice"));
			item.setDiscount(resultSet.getFloat("discount"));
			item.setProduct(resultSet.getString("product"));
			item.setMarketID(resultSet.getInt("marketID"));
			item.setCatagory(resultSet.getString("catagory"));
			item.setItemPicture(resultSet.getString("itemPicture"));
			itemList.add(item);
		}
		return itemList;
	}
	

}

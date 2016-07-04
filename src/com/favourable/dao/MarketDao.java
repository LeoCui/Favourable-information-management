package com.favourable.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;


import com.favourable.domain.Market;

public class MarketDao {
	
	Connection connection = null;
	
	public MarketDao(Connection connection){
		this.connection = connection;
	}
	
	//���ݳ���ID��ѯ
	public Market getMarketByMarketID(int marketID) throws SQLException{
		String sql = "select * from marketinfo where marketID=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, marketID);
		ResultSet resultSet = preparedStatement.executeQuery();
		Market market = null;
		while(resultSet.next()){
			market = new Market();
			market.setMarketID(resultSet.getInt("marketID"));
			market.setMarketName(resultSet.getString("marketName"));
			market.setMarketLicense(resultSet.getString("marketLicense"));
			market.setMarketCity(resultSet.getString("marketCity"));
			market.setMarketAreaID(resultSet.getInt("marketAreaID"));
			market.setMarketBlock(resultSet.getString("marketBlock"));
			market.setMarketPicture(resultSet.getString("marketPicture"));
		}		
		return market;
	}
	
	//���ݵ���ID��ѯ
	public List<Market> getMarketByAreaID(int areaID) throws SQLException{
		String sql = "select * from marketinfo where areaID=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, areaID);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Market> marketList = new ArrayList<Market>();
		while(resultSet.next()){
			Market market = new Market();
			market.setMarketID(resultSet.getInt("marketID"));
			market.setMarketName(resultSet.getString("marketName"));
			market.setMarketLicense(resultSet.getString("marketLicense"));
			market.setMarketCity(resultSet.getString("marketCity"));
			market.setMarketAreaID(resultSet.getInt("marketAreaID"));
			market.setMarketBlock(resultSet.getString("marketBlock"));
			market.setMarketPicture(resultSet.getString("marketPicture"));
			marketList.add(market);		
		}		
		return marketList;
	}
	
	//���ݳ�������ģ����ѯ
	public List<Market> getMarketByMarketName(String marketName) throws SQLException{
		String sql = "select * from marketinfo where marketName like '%?%'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, marketName);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Market> marketList = new ArrayList<Market>();
		while(resultSet.next()){
			Market market = new Market();
			market.setMarketID(resultSet.getInt("marketID"));
			market.setMarketName(resultSet.getString("marketName"));
			market.setMarketLicense(resultSet.getString("marketLicense"));
			market.setMarketCity(resultSet.getString("marketCity"));
			market.setMarketAreaID(resultSet.getInt("marketAreaID"));
			market.setMarketBlock(resultSet.getString("marketBlock"));
			market.setMarketPicture(resultSet.getString("marketPicture"));
			marketList.add(market);		
		}		
		return marketList;
	}
	
	//��ѯ���г���
	public List<Market> getAllMarket() throws SQLException{
		String sql = "select * from marketinfo";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Market> marketList = new ArrayList<Market>();
		while(resultSet.next()){
			Market market = new Market();
			market.setMarketID(resultSet.getInt("marketID"));
			market.setMarketName(resultSet.getString("marketName"));
			market.setMarketLicense(resultSet.getString("marketLicense"));
			market.setMarketCity(resultSet.getString("marketCity"));
			market.setMarketAreaID(resultSet.getInt("marketAreaID"));
			market.setMarketBlock(resultSet.getString("marketBlock"));
			market.setMarketPicture(resultSet.getString("marketPicture"));
			marketList.add(market);		
		}		
		return marketList;
	}
	

}

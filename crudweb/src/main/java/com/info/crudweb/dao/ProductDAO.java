package com.info.crudweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.info.crudweb.model.Product;
import com.info.crudweb.util.DatabaseConnection;

public class ProductDAO {
	public static boolean remove(int id) {
		try (Connection con = DatabaseConnection.getConnection();) {
			String sql = "delete from product where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			if (ps.executeUpdate() != 0)
				return true;
			return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static ArrayList<Product> getProductList() {
		ArrayList<Product> list = new ArrayList<Product>();
		try (Connection con = DatabaseConnection.getConnection();) {
			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String title = rs.getString(2);
				int price = rs.getInt(3);
				String brand = rs.getString(4);

				Product p = new Product();
				p.setBrand(brand);
				p.setId(id);
				p.setPrice(price);
				p.setTitle(title);
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static boolean persist(Product p) {
		try (Connection con = DatabaseConnection.getConnection();) {
			String sql = "insert into product(title,price,brand) values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, p.getTitle());
			ps.setInt(2, p.getPrice());
			ps.setString(3, p.getBrand());
			if (ps.executeUpdate() != 0)
				return true;
			return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}

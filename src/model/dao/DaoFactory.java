package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

//classe responsável por instanciar os DAOs
public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}

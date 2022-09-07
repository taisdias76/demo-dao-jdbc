package model.dao;

import model.dao.impl.SellerDaoJDBC;

//classe respons�vel por instanciar os DAOs
public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}

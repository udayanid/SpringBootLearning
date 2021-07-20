package com.udayan.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MySqlDaoImpl implements ReportDao {

	@Override
	public String generateReport() {
		return "mysql report is generated.....";
	}

}

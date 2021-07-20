package com.udayan.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udayan.dao.ReportDao;

@Service
public class ReportService {

	@Autowired
	ReportDao reportDao;
	
	public void printReport() {
		System.out.println(reportDao.generateReport());
	}
}

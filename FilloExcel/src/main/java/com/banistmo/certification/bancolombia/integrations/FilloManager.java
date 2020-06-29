package com.banistmo.certification.bancolombia.integrations;

import java.util.ArrayList;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FilloManager {

	public static ArrayList<String> getData() {
		ArrayList<String> filloData = new ArrayList<>();
		Fillo fillo = new Fillo();
		Connection connection;
		try {
			connection = fillo.getConnection("src/test/resources/download/Fillo.xlsx");
			String strQuery = "Select * from Datos";
			Recordset recordset = connection.executeQuery(strQuery);
			while (recordset.next()) {
				filloData.add(recordset.getField("idType"));
				filloData.add(recordset.getField("idNumber"));
				filloData.add(recordset.getField("cellphone"));
				filloData.add(recordset.getField("email"));
			}

			recordset.close();
			connection.close();

		} catch (FilloException e) {
			e.printStackTrace();
		}

		return filloData;
	}

}

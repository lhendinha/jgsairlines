package com.jgsairlines;

import java.util.List;

import com.jgsairlines.dao.AviaoDAO;
import com.jgsairlines.model.Aviao;

public class AppMain {

	public static void main(String[] args) {

//		System.out.println("\n=======CREATE RECORDS=======\n");
//		DbOperations.createRecord("pedro", "rg", 52);

//		System.out.println("\n=======READ RECORDS=======\n");
//		List<Funcionario> viewEmployee = FuncionarioDAO.displayRecords();
//		if (viewEmployee != null & viewEmployee.size() > 0) {
//			for (Funcionario employeeObj : viewEmployee) {
//				System.out.println(employeeObj.toString());
//			}
//		}
//
//		System.out.println("\n=======READ RECORDS=======\n");
//		List<Cliente> viewClients = ClienteDAO.displayRecords();
//		if (viewClients != null & viewClients.size() > 0) {
//			for (Cliente clientObj : viewClients) {
//				System.out.println(clientObj.toString());
//			}
//		}

		System.out.println("\n=======READ RECORDS=======\n");
		List<Aviao> viewAirplane = AviaoDAO.displayRecords();
		if (viewAirplane != null & viewAirplane.size() > 0) {
			for (Aviao airplaneObj : viewAirplane) {
				System.out.println(airplaneObj.toString());
			}
		}

//		System.out.println("\n=======UPDATE RECORDS=======\n");
//		int updateId = 1;
//		DbOperations.updateRecord(updateId, "nome", "rg", 52);
//		System.out.println("\n=======READ RECORDS AFTER UPDATION=======\n");
//		List<Funcionario> updateStudent = DbOperations.displayRecords();
//		if(updateStudent != null & updateStudent.size() > 0) {
//			for(Funcionario studentObj : updateStudent) {
//				System.out.println(studentObj.toString());
//			}
//		}

//		System.out.println("\n=======DELETE RECORD=======\n");
//		int deleteId = 5;
//		DbOperations.deleteRecord(deleteId);
//		System.out.println("\n=======READ RECORDS AFTER DELETION=======\n");
//		List<Funcionario> deleteStudentRecord = DbOperations.displayRecords();
//		for(Funcionario studentObj : deleteStudentRecord) {
//			System.out.println(studentObj.toString());
//		}

//		System.out.println("\n=======DELETE ALL RECORDS=======\n");
//		DbOperations.deleteAllRecords();
//		System.out.println("\n=======READ RECORDS AFTER ALL RECORDS DELETION=======");
//		List<Funcionario> deleteAll = DbOperations.displayRecords();
//		if(deleteAll.size() == 0) {
//			System.out.println("\nNo Records Are Present In The Database Table!\n");
//		}		

		System.exit(0);
	}
}

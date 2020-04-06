package com.dsegall.javaspringpointproject;

import org.javatuples.Quintet;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.javatuples.Triplet;

@SpringBootApplication
public class JavaSpringPointProjectApplication {

	public static void main(String[] args) {

//		A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.
//		A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction
//		(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).
//		Given a record of every transaction during a three-month period, calculate the reward points earned for each customer per month and total.
//
//			·        Make up a data set to best demonstrate your solution
//
//          ·        Make in Java and Spring
//
//          ·        Check solution into GitHub

//		************************** Test Data ******************************************************************************
		Triplet<String, String, Double> sale1 = new Triplet<String, String, Double>("01/02/2020", "John Coltrane", 250.05);
		Triplet<String, String, Double> sale2 = new Triplet<String, String, Double>("01/13/2020", "Miles Davis", 100.05);
		Triplet<String, String, Double> sale3 = new Triplet<String, String, Double>("01/16/2020", "Thelonius Monk", 50.99);
		Triplet<String, String, Double> sale4 = new Triplet<String, String, Double>("01/22/2020", "John Coltrane", 25.50);
		Triplet<String, String, Double> sale5 = new Triplet<String, String, Double>("01/23/2020", "Thelonius Monk", 250.05);
		Triplet<String, String, Double> sale6 = new Triplet<String, String, Double>("01/23/2020", "Thelonius Monk", 200.80);
		Triplet<String, String, Double> sale7 = new Triplet<String, String, Double>("02/02/2020", "John Coltrane", 49.75);
		Triplet<String, String, Double> sale8 = new Triplet<String, String, Double>("02/02/2020", "Louis Armstrong", 125.99);
		Triplet<String, String, Double> sale9 = new Triplet<String, String, Double>("03/02/2020", "John Coltrane", 250.05);
		Triplet<String, String, Double> sale10 = new Triplet<String, String, Double>("03/06/2020", "John Coltrane", 300.65);
		Triplet<String, String, Double> sale11 = new Triplet<String, String, Double>("03/15/2020", "Cannonball Adderley", 250.05);
		Triplet<String, String, Double> sale12 = new Triplet<String, String, Double>("03/16/2020", "Miles Davis", 199.25);
		Triplet<String, String, Double> sale13 = new Triplet<String, String, Double>("03/22/2020", "Thelonius Monk", 99.95);
		Triplet<String, String, Double> sale14 = new Triplet<String, String, Double>("03/23/2020", "Louis Armstrong", 1000.95);
		Triplet<String, String, Double> sale15 = new Triplet<String, String, Double>("03/26/2020", "Miles Davis", 100.05);
		Triplet<String, String, Double> sale16 = new Triplet<String, String, Double>("01/06/2020", "John Coltrane", 199.05);
		Triplet<String, String, Double> sale17 = new Triplet<String, String, Double>("02/06/2020", "Louis Armstrong", 299.05);
		Triplet<String, String, Double> sale18 = new Triplet<String, String, Double>("02/20/2020", "Benny Goodman", 357.50);
		Triplet<String, String, Double> sale19 = new Triplet<String, String, Double>("03/29/2020", "Django Reinhardt", 29.99);
		Triplet<String, String, Double> sale20 = new Triplet<String, String, Double>("03/30/2020", "Miles Davis", 60.65);

		ArrayList<Triplet<String, String, Double>> dataSet1 = new ArrayList<Triplet<String, String, Double>>();
		dataSet1.add(sale1);
		dataSet1.add(sale2);
		dataSet1.add(sale3);
		dataSet1.add(sale4);
		dataSet1.add(sale5);
		dataSet1.add(sale6);

		ArrayList<Triplet<String, String, Double>> dataSet2 = new ArrayList<Triplet<String, String, Double>>();
		dataSet2.add(sale7);
		dataSet2.add(sale8);
		dataSet2.add(sale9);
		dataSet2.add(sale10);
		dataSet2.add(sale11);
		dataSet2.add(sale12);

		ArrayList<Triplet<String, String, Double>> dataSet3 = new ArrayList<Triplet<String, String, Double>>();
		dataSet3.add(sale13);
		dataSet3.add(sale14);
		dataSet3.add(sale15);
		dataSet3.add(sale16);
		dataSet3.add(sale17);
		dataSet3.add(sale18);

		ArrayList<Triplet<String, String, Double>> dataSet4 = new ArrayList<Triplet<String, String, Double>>();
		dataSet4.add(sale1);
		dataSet4.add(sale2);
		dataSet4.add(sale3);
		dataSet4.add(sale4);
		dataSet4.add(sale5);
		dataSet4.add(sale6);
		dataSet4.add(sale7);
		dataSet4.add(sale8);
		dataSet4.add(sale9);
		dataSet4.add(sale10);
		dataSet4.add(sale11);
		dataSet4.add(sale12);
		dataSet4.add(sale13);
		dataSet4.add(sale14);
		dataSet4.add(sale15);
		dataSet4.add(sale16);
		dataSet4.add(sale17);
		dataSet4.add(sale18);
		dataSet4.add(sale19);
		dataSet4.add(sale20);
// ************************************************************************************
	for (Quintet<String, Integer, Integer, Integer, Integer>answerSet : calculatePoints(dataSet1) ){
		String newline = System.lineSeparator();
		System.out.println(newline + "DATA SET 1" + newline);
		System.out.println("Customer Name: " + answerSet.getValue0() + newline + "Points earned in January 2020: "
			+ answerSet.getValue1() + newline + "Points earned in February 2020: " + answerSet.getValue2() + newline
			+ "Points earned in March 2020: " + answerSet.getValue3() + newline + "Points earned in the first three months of 2020: " + answerSet.getValue4() + newline);
	}
	for (Quintet<String, Integer, Integer, Integer, Integer>answerSet : calculatePoints(dataSet2) ){
		String newline = System.lineSeparator();
		System.out.println(newline + "DATA SET 2" + newline);
		System.out.println("Customer Name: " + answerSet.getValue0() + newline + "Points earned in January 2020: "
			+ answerSet.getValue1() + newline + "Points earned in February 2020: " + answerSet.getValue2() + newline
			+ "Points earned in March 2020: " + answerSet.getValue3() + newline + "Points earned in the first three months of 2020: "
			+ answerSet.getValue4() + newline);
		}
	for (Quintet<String, Integer, Integer, Integer, Integer>answerSet : calculatePoints(dataSet3) ){
		String newline = System.lineSeparator();
		System.out.println(newline + "DATA SET 3" + newline);
		System.out.println("Customer Name: " + answerSet.getValue0() + newline + "Points earned in January 2020: "
			+ answerSet.getValue1() + newline + "Points earned in February 2020: " + answerSet.getValue2() + newline
			+ "Points earned in March 2020: " + answerSet.getValue3() + newline + "Points earned in the first three months of 2020: "
			+ answerSet.getValue4() + newline);
		}
	for (Quintet<String, Integer, Integer, Integer, Integer>answerSet : calculatePoints(dataSet4) ){
		String newline = System.lineSeparator();
		System.out.println(newline + "DATA SET 4" + newline);
		System.out.println("Customer Name: " + answerSet.getValue0() + newline + "Points earned in January 2020: "
			+ answerSet.getValue1() + newline + "Points earned in February 2020: " + answerSet.getValue2() + newline
			+ "Points earned in March 2020: " + answerSet.getValue3() + newline + "Points earned in the first three months of 2020: "
			+ answerSet.getValue4() + newline);
		}


	}
//	                       method to calculate points for each customer for each month
	public static ArrayList<Quintet<String, Integer, Integer, Integer, Integer>>calculatePoints(ArrayList<Triplet<String, String, Double>> dataSet) {
		ArrayList<String> customerNames = getCustomerNames(dataSet);
		ArrayList<Triplet<String, String, Double>> singleCustomerSalesData = new ArrayList<>();
		ArrayList<Quintet<String, Integer, Integer, Integer, Integer>> calculatedResults = new ArrayList<>();

		for (String customer : customerNames) {
			singleCustomerSalesData = getSingleCustomerSalesData(customer, dataSet);
			ArrayList<HashMap<String, Integer>> customerTotalPoints = getAwardedPoints(singleCustomerSalesData);
			HashMap<String, Integer> monthlyPointTotals = getCustomerMonthlyPointsTotals(customerTotalPoints);
			Quintet<String, Integer, Integer, Integer, Integer> results = Quintet.with(customer, monthlyPointTotals.get("jan"),monthlyPointTotals.get("feb"), monthlyPointTotals.get("march"), monthlyPointTotals.get("three"));
			calculatedResults.add(results);
		}
//		System.out.println("calculatedResults: " + calculatedResults);
		return calculatedResults;
	}
//	            method to create an arrayList of customer names
	public static ArrayList<String> getCustomerNames(ArrayList<Triplet<String, String, Double>> dataSet){
		ArrayList<String> customerList = new ArrayList<>();
		for ( Triplet<String, String, Double> sale : dataSet){
			if (!customerList.contains(sale.getValue1()))
			customerList.add(sale.getValue1());
		}
//		System.out.println("customerList: " + customerList);
		return customerList;
	}
//	          method to create an arrayList of sales records for each customer
	public static ArrayList<Triplet<String, String, Double>> getSingleCustomerSalesData(String name, ArrayList<Triplet<String, String, Double>> dataSet){
		ArrayList<Triplet<String,String, Double>> customerSalesData = new ArrayList<>();
		for (Triplet<String,String, Double> sale : dataSet){
			if (sale.getValue1().equals(name))
				customerSalesData.add(sale);
		}
//		System.out.println("customerSalesData: " + customerSalesData);
		return customerSalesData;
	}
//	          method to find points for each month
	public static HashMap<String, Integer> getCustomerMonthlyPointsTotals(ArrayList<HashMap<String, Integer>> customerPointsDateMaps) {
		Integer janTotalPoints = 0;
		Integer febTotalPoints = 0;
		Integer marchTotalPoints = 0;
		Integer threeMonthTotalPoints;

		for (HashMap<String, Integer> pointDateMap : customerPointsDateMaps) {
			for (Map.Entry<String, Integer> entry : pointDateMap.entrySet()) {
				if (entry.getKey().substring(0, 2).equals("01")) {
					janTotalPoints += entry.getValue();
				} else if (entry.getKey().substring(0, 2).equals("02")) {
					febTotalPoints += entry.getValue();
				} else {
					marchTotalPoints += entry.getValue();
				}
			}
		}
				threeMonthTotalPoints = janTotalPoints + febTotalPoints + marchTotalPoints;
				HashMap<String, Integer> monthlyPointTotals = new HashMap<>();
				monthlyPointTotals.put("jan", janTotalPoints);
				monthlyPointTotals.put("feb", febTotalPoints);
				monthlyPointTotals.put("march", marchTotalPoints);
				monthlyPointTotals.put("three", threeMonthTotalPoints);
//				System.out.println("monthlyPointTotals:" + monthlyPointTotals);
				return monthlyPointTotals;
			}
////	         method to calculate points
		public static Integer countPoints(Double amountSpent) {
			Integer pointCounterOverOneHundred = 50;
			if (amountSpent >= 0.00 && amountSpent <= 49.99) {
				return 0;
			} else if
			   (amountSpent >= 50.00 && amountSpent <= 99.99){
				System.out.println(amountSpent.intValue() - 50);
				return amountSpent.intValue() - 50;
			} else if (amountSpent >= 100.00) {
				pointCounterOverOneHundred += ((amountSpent.intValue()) - 100) * 2;
//				System.out.println("pointCounterOverOneHundred: " + pointCounterOverOneHundred);
				return pointCounterOverOneHundred;
			} else {
				return 0;
			}
		}
//         method to turn sales into awarded points
		public static ArrayList<HashMap<String, Integer>> getAwardedPoints (ArrayList<Triplet<String, String, Double >> customerSalesData){
			HashMap<String,Integer> dateAmount = new HashMap<>();
			ArrayList<HashMap<String, Integer>> customerDatePointsMaps = new ArrayList<>();
			for (Triplet<String, String, Double> sale : customerSalesData ){
				dateAmount.put(sale.getValue0(), countPoints(sale.getValue2()));
			}
			customerDatePointsMaps.add(dateAmount);
//			System.out.println("customerDatePointsMaps: " + customerDatePointsMaps);
			return customerDatePointsMaps;
		}
}

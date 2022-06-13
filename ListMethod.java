package list;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
	List olist = new ArrayList();

	void add() {

		olist.add("vidhya");
		olist.add("anu");
		System.out.println(olist);
	}

	List olist2 = new ArrayList();

	void addAll() {

		olist2.add("akshaya");
		olist.addAll(olist2);
		System.out.println(olist);
	}

	public static void main(String[] args) {
		ListMethod oListMethod = new ListMethod();
		oListMethod.add();
		oListMethod.addAll();
	}
}

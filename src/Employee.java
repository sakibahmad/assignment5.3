/*program to demonstrate the use of abstraction ,inheritence and method overriding
 * CALCULATING SALARY AND PRINTING LEAVE FORMAT
 */
		//abstract class employee
abstract class Employee {
	int empid, tot_leaves;
	double tot_salary;
	String empNames;
		//method to calculate balance leaves
	void cal_bal_leaves() {

	}

	boolean avail_leaves(int no_of_leaves, char type_of_leaves) {
		return false;

	}
		//abstract method
	abstract void cal_salary();

}

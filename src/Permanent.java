
/*program to demonstrate the use of abstraction ,inheritence and method overriding
 * CALCULATING SALARY AND PRINTING LEAVE FORMAT
 */

//using scanner class
import java.util.Scanner;

//inheriting employee functionality
public class Permanent extends Employee {
	// description of leaves
	int paid_leave = 10, casual_leave = 15, sick_leave = 30, total_leave = 45;
	double basic, hra, pfa, tot_salary;

	// leave detail of permanent employee
	void print_leave_detail() {
		System.out.println("Leave details of permanent employee which he can avail yearly ");

		System.out.println(
				"paid leave = " + paid_leave + " \tcasual leave =  " + casual_leave + "\tsick leave = " + sick_leave);

	}
	// method to calculate balance leave
	// NO_OF_LEAVES will be provided while creation of object

	void cal_bal_leaves(int no_of_leaves) {
		System.out.println("the balance leave of the employee is ");

		int bal_leave = total_leave - no_of_leaves;
		// printing balance leaves
		System.out.println(bal_leave);

	}

	// available leaves
	boolean avail_leaves(int no_of_leaves, char type_of_leaves) {
		return true;

	}

	// calculating salary
	void cal_salary() {
		System.out.println("enter the basic salary of permanent ");
		Scanner o = new Scanner(System.in);
		basic = o.nextDouble();

		double pfa = 12.0 / 100;
		System.out.println("the  PFA  of temporary employee\t" + pfa);

		hra = 50.00 / 100 * basic;
		System.out.println("the HRA of temporary employee\t " + hra);
		// printing computed salary
		tot_salary = (basic + hra - pfa);
		System.out.println("Total computed salary is\t " + tot_salary);
	}

}

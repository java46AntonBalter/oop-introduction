package telran.people;

import java.util.Arrays;

public class CompanySortedArray extends CompanyArray {
	@Override
	public boolean addEmployee(Employee empl) {
		long emplId = empl.getId();

		if (isEmployee(emplId)) {
			return false;
		}

		int emplIndex = -(getEmployeeIndex(emplId) + 1);

		Employee[] newArr = new Employee[employees.length + 1];

		for (int i = 0; i < newArr.length; i++) {
			if (i < emplIndex) {
				newArr[i] = employees[i];
			} else if (i == emplIndex) {
				newArr[i] = empl;
			} else {
				newArr[i] = employees[i - 1];
			}
		}

		employees = newArr;
		return true;
	}

	@Override
	protected int getEmployeeIndex(long id) {
		return Arrays.binarySearch(employees, new Person(id, 0, null));
	}

	@Override
	public Employee[] getAllEmployees() {
		return Arrays.copyOf(employees, employees.length);
	}
}
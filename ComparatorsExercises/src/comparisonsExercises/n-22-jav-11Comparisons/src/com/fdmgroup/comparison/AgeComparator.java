package com.fdmgroup.comparison;

import java.util.Comparator;

public class AgeComparator implements Comparator<Trainee> {

	@Override
	public int compare(Trainee s1, Trainee s2) {
		if(s1.getAge() > s2.getAge()) {
			return 1;
		}else if(s1.getAge() < s2.getAge()) {
			return -1;
		}else {
			return 0;
		}
		
	}

}

package com.spring.collectiondi;

import java.util.Iterator;
import java.util.Set;

public class SetBean {

		Set<Integer>  set;

		public Set<Integer> getSet() {
			return set;
		}

		public void setSet(Set<Integer> set) {
			this.set = set;
		}
		public Integer getResult() {
			Integer temp=0;
			Iterator<Integer> iterator = getSet().iterator();
			while (iterator.hasNext()) {
				temp=temp+iterator.next();
			}
			return temp;
		}

}

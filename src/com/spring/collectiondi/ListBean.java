package com.spring.collectiondi;

import java.util.Iterator;
import java.util.List;

public class ListBean {
	List<Integer> list;

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Integer getResult() {
		Integer temp=0;
		Iterator<Integer> iterator = getList().iterator();
		while (iterator.hasNext()) 
			temp=temp+iterator.next();
		
		return temp.intValue();
	}

}

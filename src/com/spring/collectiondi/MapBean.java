package com.spring.collectiondi;

import java.util.Iterator;
import java.util.Map;

public class MapBean {
	Map<String, Integer> map=null;

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	public Integer getResult() {
		Integer temp=0;
		Iterator<Integer> iterator = getMap().values().iterator();
		while (iterator.hasNext()) {
			temp=temp+iterator.next();
		}
		return temp;
	}

	
}

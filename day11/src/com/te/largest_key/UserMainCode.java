package com.te.largest_key;

import java.util.Map;
import java.util.TreeMap;

public class UserMainCode {
	public static String getMaxValue(Map map) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(map);

		return tmap.get(tmap.lastKey());
	}

}

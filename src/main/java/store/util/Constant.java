package store.util;

import java.util.HashMap;
import java.util.Map;

public class Constant {
	public static String imgPath = "D:\\webCollector\\img\\";
	public static String filePath = "D:\\webCollector\\file\\";
	private static Map<String, String> imgTypeMap = new HashMap<String, String>();
	static {
		imgTypeMap.put("img", "img");
		imgTypeMap.put("jpg", "jpg");
		imgTypeMap.put("png", "png");
		imgTypeMap.put("dmp", "dmp");
	}
	
	public static String getImgTypeMap(String key) {
		return imgTypeMap.get(key);
	}
}

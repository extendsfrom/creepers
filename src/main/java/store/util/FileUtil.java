package store.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * 文件操作util
 * @ClassName: FileUtil
 * @date 2015年10月25日 下午8:58:43
 * @author 小银龙
 */
public class FileUtil {
	
	public static void writeFromStr(String content) {
		FileWriter w = null;
		try {
			File destFile = new File(Constant.filePath + new Date().getTime() + ".txt");
			if(!destFile.exists()) {
					destFile.createNewFile();
			}
			w = new FileWriter(destFile);
			w.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(null != w) {
					w.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

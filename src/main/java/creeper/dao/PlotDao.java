package creeper.dao;

import org.springframework.stereotype.Repository;

import creeper.model.Plot;

/**
 * @ClassName: PlotDao
 * @Description: 小区信息
 * @date 2015年9月20日 下午1:15:05
 * @author 小银龙
 */
@Repository
public interface PlotDao {
	/**
	 * 添加小区
	 * @Title: insertPlot
	 * @Description: 
	 * @param @param plot
	 * @param @return
	 * @return int 
	 * @throws
	 * @author 小银龙
	 * @2015年10月31日 上午11:45:56
	 */
	public int insertPlot(Plot plot);
}

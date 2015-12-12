package creeper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import creeper.dao.PlotDao;
import creeper.model.Plot;

@Service
public class PlotService{
	
	@Autowired
	private PlotDao plotDao;
	
	public int insertPlot(Plot plot) {
		return plotDao.insertPlot(plot);
	}

}

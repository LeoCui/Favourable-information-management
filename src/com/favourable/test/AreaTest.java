package com.favourable.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.favourable.domain.Area;
import com.favourable.service.ShowAreaService;

public class AreaTest {
	
	@Test
	public void testArea(){
		ShowAreaService showAreaService = new ShowAreaService();
		List<Area> areaList = showAreaService.showAllAreas();
		Assert.assertNotNull(areaList);
		
	}

}

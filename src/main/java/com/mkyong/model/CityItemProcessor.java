/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mkyong.model;

import org.springframework.batch.item.ItemProcessor;

/**
 *
 * @author mariusz
 */
public class CityItemProcessor implements ItemProcessor<City, City>{

	
	@Override
	public City process(City result) throws Exception {
		System.out.println("Processing result :"+result);
		
		return result;
	}
    
}

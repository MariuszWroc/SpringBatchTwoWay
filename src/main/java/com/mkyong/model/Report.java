/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mkyong.model;

/**
 *
 * @author mczarny
 */
public class Report {
    	private String Date;
	private String Impressions;
	private String Clicks;
	private String Earning;

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getImpressions() {
        return Impressions;
    }

    public void setImpressions(String Impressions) {
        this.Impressions = Impressions;
    }

    public String getClicks() {
        return Clicks;
    }

    public void setClicks(String Clicks) {
        this.Clicks = Clicks;
    }

    public String getEarning() {
        return Earning;
    }

    public void setEarning(String Earning) {
        this.Earning = Earning;
    }
 

}

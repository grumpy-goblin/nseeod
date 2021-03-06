/*
Copyright (c) 2011,2012,2013,2014 Rohit Jhunjhunwala

The program is distributed under the terms of the GNU General Public License

This file is part of NSE EOD Data Downloader.

NSE EOD Data Downloader is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

NSE EOD Data Downloader is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with NSE EOD Data Downloader.  If not, see <http://www.gnu.org/licenses/>.
 */
package db;

class Queries {

	public String readBaseLink(){
		return "select base_url from nsebaselink";
	}
	
	public String readRelativeLink(){
		return "select product_link from links where product_code=?";
	}
	
	public String updateSettings(){
		return "update Settings set setting_value=? where setting_name=? and category=? and subcategory=?";
	}
	
	public String readSettings(){
		return "select setting_name,setting_value from settings where category=? and subcategory=? and setting_type='checkbox'";
	}
	
	public String readIndividualSetting(){
		return "select setting_value from settings where category=? and subcategory=? and setting_name=?";
	}
}

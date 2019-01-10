package com.soap.main;

import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

public class IPLocationFinderMain {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("you need to pass in one IP address...");
		}
		else {
			String ipAddress = args[0];
			/* in command prompt
			  wsimport http://wsgeoip.lavasoft.com/ipservice.asmx?WSDL 
			keep source code use
			wsimport -keep -s src http://wsgeoip.lavasoft.com/ipservice.asmx?WSDL */
			
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIPserviceSoap = ipService.getGeoIPServiceSoap(); //this is our stub
			System.out.println(geoIPserviceSoap.getIpLocation(ipAddress));
		}

	}

}

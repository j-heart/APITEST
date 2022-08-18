package com.example.demo.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.APIdbEntity;
import com.example.demo.repository.ApiRepository;
import com.example.demo.request.ApiRequest;
import com.example.demo.response.ApiResponse;
import com.example.demo.response.ApiResponseData;

@Service
public class ApiService {
	
	@Autowired
	private ApiRepository apirepository;
	
	public Object gentoken(ApiRequest request) {
		Date date = new Date();
		Timestamp time = new Timestamp(date.getTime());
		APIdbEntity apidbentity = new APIdbEntity();
		ApiResponse apiresponse = new ApiResponse();
		ApiResponseData apiresponsedata = new ApiResponseData();
		try {
			apidbentity.setRequest_date(time);
			apidbentity.setSsoType(request.getSsoType());
			apidbentity.setSystemId(request.getSystemId());
			apidbentity.setSystemName(request.getSystemName());
			apidbentity.setSystemTransactions(request.getSystemTransactions());
			apidbentity.setSystemPrivileges(request.getSystemPrivileges());
			apidbentity.setSystemUserGroup(request.getSystemUserGroup());
			apidbentity.setSystemLocationGroup(request.getSystemLocationGroup());
			apidbentity.setUserId(request.getUserId());
			apidbentity.setUserFullName(request.getUserFullName());
			apidbentity.setUserRdOfficeCode(request.getUserRdOfficeCode());
			apidbentity.setUserOfficeCode(request.getUserOfficeCode());
			apidbentity.setClientLocation(request.getClientLocation());
			apidbentity.setLocationMachineNumber(request.getLocationMachineNumber());
			apidbentity.setTokenId(request.getTokenId());
			
			apirepository.save(apidbentity);
			apiresponse.setResponseCode("I07000");
			apiresponse.setResponseMessage("ทำรายการเรียบร้อย");
			apiresponsedata.setUserId(apidbentity.getUserId());
			apiresponsedata.setTokenId(apidbentity.getTokenId());
			apiresponse.setResponseData(apiresponsedata);
			
		}
		catch(Exception e){
			apiresponse.setResponseCode("E000001");
			apiresponse.setResponseMessage("ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้");
			apiresponsedata.setUserId(apidbentity.getUserId());
			apiresponsedata.setTokenId("");
			apiresponse.setResponseData(apiresponsedata);
		}
		return apiresponse;
	}

}


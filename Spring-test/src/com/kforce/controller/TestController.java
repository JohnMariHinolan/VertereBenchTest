package com.kforce.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kforce.config.ConfigObj;
import com.kforce.service.TestServiceInterface;

@Controller
public class TestController {

	@Autowired
	ServletContext context ; 
	@Autowired
	@Qualifier("test2")
	TestServiceInterface tesService;
	@Autowired
	ConfigObj configObj;
	
	@RequestMapping(value = "/testPrint")
	public void autowireTest() {
		System.out.println("Message : " + configObj.getMsgTest());
		tesService.print();
	}
	
	//@RequestMapping("/DownloadTest")
	@RequestMapping(value = "/DownloadTest/{PathVariable}" ,method= RequestMethod.GET,produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	public void downloadTest1(HttpServletResponse response, @PathVariable("PathVariable") String pathVariable) {
	    try {
	    	
	    	String filePath = context.getInitParameter("FilePath");
	    //	System.out.println("filePath: " + filePath + File.separator + pathVariable);
	        // get your file as InputStream
	       InputStream is = new FileInputStream(filePath + File.separator + pathVariable + ".jpg");
	        // copy it to response's OutputStream
	        org.apache.commons.io.IOUtils.copy(is, response.getOutputStream());
	      //  response.setContentType("application/xml");
	        response.setContentType(MediaType.IMAGE_JPEG_VALUE);

	        response.flushBuffer();
	      } catch (IOException ex) {
	   //     log.info("Error writing file to output stream. Filename was '{}'", fileName, ex);
	        throw new RuntimeException("IOError writing file to output stream");
	      }
	}
}

package com.kforce.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@Autowired
	ServletContext context ; 
	
	//@RequestMapping("/DownloadTest")
	@RequestMapping(value = "/DownloadTest/{PathVariable}" ,method= RequestMethod.GET)
	public void downloadTest1(HttpServletResponse response, @PathVariable("PathVariable") String pathVariable) {
	    try {
	    	
	    	String filePath = context.getInitParameter("FilePath");
	    //	System.out.println("filePath: " + filePath + File.separator + pathVariable);
	        // get your file as InputStream
	       InputStream is = new FileInputStream(filePath + File.separator + pathVariable + ".xml");
	        // copy it to response's OutputStream
	        org.apache.commons.io.IOUtils.copy(is, response.getOutputStream());
	        response.setContentType("application/xml");

	        response.flushBuffer();
	      } catch (IOException ex) {
	   //     log.info("Error writing file to output stream. Filename was '{}'", fileName, ex);
	        throw new RuntimeException("IOError writing file to output stream");
	      }
	}
}

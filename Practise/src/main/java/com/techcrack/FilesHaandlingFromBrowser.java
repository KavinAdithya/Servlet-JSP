package com.techcrack;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;

/**
 * Servlet implementation class FilesHaandlingFromBrowser
 */
@WebServlet("/FileUpload")
public class FilesHaandlingFromBrowser extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
		List<FileItem> list=null;
		try {
			list = sf.parseRequest(request);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		for(FileItem fi:list) {
			try {
				fi.write(new File("C:\\Users\\kavin\\WebsiteFile\\"+fi.getName()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			System.out.println("File Has Been Uploaded???");	
	}

}

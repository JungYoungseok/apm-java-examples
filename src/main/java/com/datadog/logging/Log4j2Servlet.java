package com.datadog.logging;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	final static Logger logger = LogManager.getLogger("com.datadog.demo");

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("Logging with log4j2");
		resp.setContentType("text/plain");
		resp.getWriter().println("Logging with log4j2");
	}

}

package org.jboss.wildflyos;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		InetAddress ip;
		try {

			ip = InetAddress.getLocalHost();
			resp.getWriter().write(
					"Hello Openshift from : " + ip.getHostAddress());

		} catch (UnknownHostException e) {

			e.printStackTrace();

		}

	}

}

package org.com;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {
	public static void main(String[] args) {
		SimpleRouteBuilder simpleRouteBuilder = new SimpleRouteBuilder();
		CamelContext camelContext = new DefaultCamelContext();
		try {
			camelContext.addRoutes(simpleRouteBuilder);
			camelContext.start();
			Thread.sleep(5 * 60 * 1000);
			camelContext.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

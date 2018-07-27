package org.com;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C:/Users/Sourabh.Sharma/Intelematics/inputFolder?noop=true")
				.to("file:C:/Users/Sourabh.Sharma/Intelematics/outputFolder");
	}
}

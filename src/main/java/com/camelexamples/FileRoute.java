package com.camelexamples;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:E:\\Ranga_Karanam_CamelExamples\\Ranga_Karanam_Files\\camel-main\\01.files\\")
		.log("FileRoute is Calling:::")
		.to("file:E:\\Destination\\Latest\\");
	}

}

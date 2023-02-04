package com.camelexamples;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SampleTimer extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer:sampleTimer").log("SampleTimer Route is Calling:::").to("log:sampleTimer");

	}

}

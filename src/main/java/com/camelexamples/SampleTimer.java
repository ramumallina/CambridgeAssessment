package com.camelexamples;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SampleTimer extends RouteBuilder {

	class BodyAdding implements Processor {
    private Logger logger= LoggerFactory.getLogger(BodyAdding.class);
		@Override
		public void process(Exchange exchange) throws Exception {
			String payload= exchange.getIn().getBody(String.class);
			logger.info("payload is:::"+ payload);
			payload="Ramu Mallina";
			exchange.getIn().setBody(payload, String.class);
		}
	}

	@Override
	public void configure() throws Exception {
		from("timer:sampleTimer")
		.log("SampleTimer Route is Calling:::")
		.process(new BodyAdding())
		.to("log:sampleTimer");

	}

}

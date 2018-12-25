package com.example.readinglist;


import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
//@Component
public class JerseyConfig extends ResourceConfig{
	 public JerseyConfig(){
		 //register(BookResource.class);
		 //register(IndexController.class);
	 }
}

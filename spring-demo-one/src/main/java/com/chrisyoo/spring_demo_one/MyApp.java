package com.chrisyoo.spring_demo_one;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MyApp 
{
    public static void main( String[] args )
    {
      
    	// load the spring configuration file
    	FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("applicationContext.xml");
    	
    	// retrieve bean from spring container
    	TrackCoach theCoach = context.getBean("myCoach", TrackCoach.class);
    	
    	
    	// call methods on the bean
    	System.out.println(theCoach);
    	
    	
    	
//    	System.out.println(theCoach.getDailyWorkout());
//    	
//    	System.out.println(theCoach.getEmailAddress());
//    	
//    	System.out.println(theCoach.getTeam());
    	
    	// close the context
    	context.close();
    	
    }
}

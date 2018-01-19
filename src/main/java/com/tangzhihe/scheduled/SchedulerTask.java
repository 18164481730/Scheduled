package com.tangzhihe.scheduled;

import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;

@Component
public class SchedulerTask {
	private int count = 0;
	
	@Scheduled(cron = "*/6 * * * * ?")
	public void process() {
		System.out.println("this is scheduler task runing  "+(count++));
	}
}



























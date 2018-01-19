package com.tangzhihe.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler2Task {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
	
	@Scheduled(fixedRate = 6000)
	public void reportCureentTime() {
		System.out.println("现在的时间：" + dateFormat.format(new Date()));
	}
}

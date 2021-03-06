package com.eayun.database.resourcepool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SyncResourceStatutPool {
	public static int maxSize = 0;
	public static int maxAwaitTime = 0;
	static {
		maxSize = 100;
		maxAwaitTime = 5;
	}
	public static ThreadPoolExecutor pool = new ThreadPoolExecutor(maxSize, maxSize, maxAwaitTime, TimeUnit.MINUTES,
			new LinkedBlockingQueue<Runnable>());
}

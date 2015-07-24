package com.taobao.yiwei.mongodb;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.mongodb.MongoClient;

public class TestBase {
	public static MongoClient mongoClient;

	@BeforeClass
	public static void baseSetUpBeforeClass() throws Exception {
		mongoClient = new MongoClient("10.101.72.137", 27017);
	}

	@AfterClass
	public static void baseTearDownAfterClass() throws Exception {
	}


}

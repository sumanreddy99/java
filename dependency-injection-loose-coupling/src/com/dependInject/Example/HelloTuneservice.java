package com.dependInject.Example;

public class HelloTuneservice implements Service {

	HelloTuneservice() {
		System.out.println("HelloTuneservice");
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("hello tune");
	}

}

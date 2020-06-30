package com.di.autowire.qualifier;

public class Heart {
	private String noHeart;

	public void setNoHeart(String noHeart) {
		this.noHeart = noHeart;
	}

	public String getNoHeart() {
		return noHeart;
	}

	public void pumping() {
		System.out.println("heart pumping");
	}

}

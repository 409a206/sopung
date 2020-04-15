package com.kh.maskRush.model.dao.entities.Creature;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Player {
	
	private Date start = null;
	private String name = " ";
	private char genderName = ' ';
	private Image genderImage = null ;
	private int birth = 0;
	private String day ="";
	
	public Player() {
		System.out.println(toString());
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Date getStart() {
		return start;
	}

	public String getName() {
		return name;
	}

	public Image getGenderImage() {
		return genderImage;
	}

	public int getBirth() {
		return birth;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGenderName() {
		return genderName;
	}

	public void setGenderName(char genderName) {
		this.genderName = genderName;
	}

	public void setGenderImage(Image gender) {
		this.genderImage = gender;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Player [start=" + start + ", name=" + name + ", genderName=" + genderName + ", genderImage="
				+ genderImage + ", birth=" + birth + ", day=" + day + "]";
	}
	
	
	
}

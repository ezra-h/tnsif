package com.tnsif.Abstract;

public class square extends shape {
	private int side=2;
	public square(int side)
	{
		this.side=side;
	
	}
	void calArea()
	{
		super.area=side*side;
	}

}

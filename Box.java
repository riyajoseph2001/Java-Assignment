package ControlStructures;

public class Box {
	float width = 0.0f,height =0.0f,depth =0.0f;
	
	public Box(float width, float height, float depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public float volumn(float width,float height,float depth)
	{
		return width*height*depth;
	}
	

}

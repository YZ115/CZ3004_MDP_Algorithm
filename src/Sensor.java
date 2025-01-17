import java.util.HashMap;

public class Sensor{

	private static final int WIDTH = 15;
	private static final int HEIGHT = 20;
	int range;
	SensorLocation currentDirection;
	int locationOnRobot_x;
	int locationOnRobot_y;
	int robot_x;
	int robot_y;
	boolean hitWallCheck;
	int[] sensor_XY = new int[2];
	HashMap<int[], int[]> coordinatesLeft;
	HashMap<int[], int[]> coordinatesRight;

	
	
	public Sensor(int range, SensorLocation currentDirection, int locationOnRobot_x, int locationOnRobot_y, int robot_x,
			int robot_y) {
		super();
		this.range = range;
		this.currentDirection = currentDirection;
		this.locationOnRobot_x = locationOnRobot_x;
		this.locationOnRobot_y = locationOnRobot_y;
		this.robot_x = robot_x;
		this.robot_y = robot_y;
		this.hitWallCheck = false;
	}
	

	

	public void initDirection() {
		switch (currentDirection)
		{
		case FACING_TOP:
			locationOnRobot_x = -1; locationOnRobot_y = 0;
			break;
		case FACING_TOPRIGHT:
			locationOnRobot_x = -1; locationOnRobot_y = 1;
			break;
		case FACING_RIGHT:
			locationOnRobot_x = 1; locationOnRobot_y = -1;
			break;
		case FACING_BOTTOMRIGHT:
			locationOnRobot_x = 1; locationOnRobot_y = 1;
			break;
		case FACING_DOWN:
			locationOnRobot_x = 1; locationOnRobot_y = 0;
			break;
		case FACING_BOTTOMLEFT:
			locationOnRobot_x = 1; locationOnRobot_y = -1;
			break;
		case FACING_LEFT:
			locationOnRobot_x = 0; locationOnRobot_y = -1;
			break;
		case FACING_TOPLEFT:
			locationOnRobot_x = -1; locationOnRobot_y = -1;
			break;
		}
		


	}
	
	public void ChangeDirectionLeft() {
		switch (currentDirection)
		{
		case FACING_TOP:
			currentDirection = currentDirection.FACING_LEFT;
			break;
		case FACING_TOPRIGHT:
			currentDirection = currentDirection.FACING_TOPLEFT;
			break;
		case FACING_RIGHT:
			currentDirection = currentDirection.FACING_TOP;
			break;
		case FACING_BOTTOMRIGHT:
			currentDirection = currentDirection.FACING_TOPRIGHT;
			break;
		case FACING_DOWN:
			currentDirection = currentDirection.FACING_RIGHT;
			break;
		case FACING_BOTTOMLEFT:
			currentDirection = currentDirection.FACING_BOTTOMRIGHT;
			break;
		case FACING_LEFT:
			currentDirection = currentDirection.FACING_DOWN;
			break;
		case FACING_TOPLEFT:
			currentDirection = currentDirection.FACING_BOTTOMLEFT;
			break;
		}
		
		if(locationOnRobot_x == 1 && locationOnRobot_y == -1)
		{
			locationOnRobot_x = -1;
			locationOnRobot_y = -1;
		}
		else if(locationOnRobot_x == 1 && locationOnRobot_y == 0)
		{
			locationOnRobot_x = 0;
			locationOnRobot_y = -1;
		}
		else if(locationOnRobot_x == 1 && locationOnRobot_y == 1)
		{
			locationOnRobot_x = 1;
			locationOnRobot_y = -1;
		}
		else if(locationOnRobot_x == 0 && locationOnRobot_y == 1)
		{
			locationOnRobot_x = 1;
			locationOnRobot_y = 0;
		}
		else if(locationOnRobot_x == -1 && locationOnRobot_y == 1)
		{
			locationOnRobot_x = 1;
			locationOnRobot_y = 1;
		}
		else if(locationOnRobot_x == -1 && locationOnRobot_y == 0)
		{
			locationOnRobot_x = 0;
			locationOnRobot_y = 1;
		}
		else if(locationOnRobot_x == -1 && locationOnRobot_y == -1)
		{
			locationOnRobot_x = -1;
			locationOnRobot_y = 1;
		}
		else if(locationOnRobot_x == 0 && locationOnRobot_y == -1)
		{
			locationOnRobot_x = -1;
			locationOnRobot_y = 0;
		}
	}
	
	public void ChangeDirectionRight() {
		
		
		switch (currentDirection)
		{
		case FACING_TOP:
			currentDirection = currentDirection.FACING_RIGHT;
			break;
		case FACING_TOPRIGHT:
			currentDirection = currentDirection.FACING_BOTTOMRIGHT;
			break;
		case FACING_RIGHT:
			currentDirection = currentDirection.FACING_DOWN;
			break;
		case FACING_BOTTOMRIGHT:
			currentDirection = currentDirection.FACING_BOTTOMLEFT;
			break;
		case FACING_DOWN:
			currentDirection = currentDirection.FACING_LEFT;
			break;
		case FACING_BOTTOMLEFT:
			currentDirection = currentDirection.FACING_TOPLEFT;
			break;
		case FACING_LEFT:
			currentDirection = currentDirection.FACING_TOP;
			break;
		case FACING_TOPLEFT:
			currentDirection = currentDirection.FACING_TOPRIGHT;
			break;
		}

		if(locationOnRobot_x == 1 && locationOnRobot_y == -1)
		{
			locationOnRobot_x = 1;
			locationOnRobot_y = 1;
		}
		else if(locationOnRobot_x == 1 && locationOnRobot_y == 0)
		{
			locationOnRobot_x = 0;
			locationOnRobot_y = 1;
		}
		else if(locationOnRobot_x == 1 && locationOnRobot_y == 1)
		{
			locationOnRobot_x = -1;
			locationOnRobot_y = 1;
		}
		else if(locationOnRobot_x == 0 && locationOnRobot_y == 1)
		{
			locationOnRobot_x = -1;
			locationOnRobot_y = 0;
		}
		else if(locationOnRobot_x == -1 && locationOnRobot_y == 1)
		{
			locationOnRobot_x = -1;
			locationOnRobot_y = -1;
		}
		else if(locationOnRobot_x == -1 && locationOnRobot_y == 0)
		{
			locationOnRobot_x = 0;
			locationOnRobot_y = -1;
		}
		else if(locationOnRobot_x == -1 && locationOnRobot_y == -1)
		{
			locationOnRobot_x = 1;
			locationOnRobot_y = -1;
		}
		else if(locationOnRobot_x == 0 && locationOnRobot_y == -1)
		{
			locationOnRobot_x = 1;
			locationOnRobot_y = 0;
		}

	}
		
	public void updateRobotLocation(int x, int y) {
	 robot_x = x;
	 robot_y = y;
	}

	public boolean SenseLocation(Map map, int x, int y, int distanceFromRobot){
		boolean hitWall = false;
		
		int score = 0;

		if(distanceFromRobot == 1)
			score = -70;
		else if(distanceFromRobot == 2)
			score = -40;
		else if(distanceFromRobot == 3)
			score = -8;
		else if(distanceFromRobot == 4)
			score = -5;
		else if(distanceFromRobot == 5)
			score = -2;
		else score = 0;
		
			
		if(x < WIDTH && y < HEIGHT && x >= 0 && y >= 0)
		{
			//flip the score to positive to indicate that it is a block
			if(map.SimulatedmapArray[y][x] == ExplorationTypes.toInt("OBSTACLE") ||
					map.SimulatedmapArray[y][x] == ExplorationTypes.toInt("UNEXPLORED_OBSTACLE"))
			{
				score = -score;
				hitWall = true;
				System.out.print(" X = " + x + " Y + " + y + " score \n");
			}
			
			//map.setExplored(x,y);
			map.setMapScore(x,y,score);
		}
		else
			hitWall=true;
		
		return hitWall;
	}

	
	public void printGrid(int[][] mapArray) {
		for(int i = 0 ; i < HEIGHT;i++) {
			for(int j = 0; j < WIDTH; j++) {
				System.out.print(mapArray[i][j]);
			}
		}
	}


	public boolean Sense(Map map, int data, int[][] notWorkinghe){
		//have to make sure does not overshort boundary of environment
		
		int nextLocationX = 0;
		int nextLocationY = 0;
		
		//is true after robot hits a wall, to prevent it from sensing further
		boolean hitWall = false;
		boolean hitWallret = false;
		
		for(int i = 1; i < range+1; i++) {
			
			//if(hitWall)
			//	break;
				
			//make sure it is in the map range and bound.
			if(currentDirection ==SensorLocation.FACING_RIGHT) {
				nextLocationX = robot_x+locationOnRobot_x+i;
				nextLocationY = robot_y+locationOnRobot_y;
			}
			
			else if(currentDirection == SensorLocation.FACING_LEFT) {
				nextLocationX = robot_x+locationOnRobot_x-i;
				nextLocationY = robot_y+locationOnRobot_y;
			}
			else if(currentDirection == SensorLocation.FACING_TOP) {
				nextLocationX = robot_x+locationOnRobot_x;
				nextLocationY = robot_y+locationOnRobot_y-i;
			}
			else{
				//System.out.print("should be sensing right wall\n");
				nextLocationX = robot_x+locationOnRobot_x;
				nextLocationY = robot_y+locationOnRobot_y+i;
			}
			
			//hitwill will be true when senselocation returns a true which indicates that a wall has been met
			if(!hitWall){
				// System.out.println("next X: "+nextLocationX+"\tnext Y: "+nextLocationY);
				hitWall = SenseLocation(map,nextLocationX, nextLocationY, i);
				if(SenseLocation(map, nextLocationX, nextLocationY, 0) && i==1)
					hitWallret =true;
			}
			//send a 0 to signify that this is behind a wall
			else
				SenseLocation(map,nextLocationX, nextLocationY, 0);
		}
		//hitWallret=SenseLocation(map,nextLocationX, nextLocationY, 0);
		
		//update the map score after "sensing"
		map.updateMapWithScore();
		return hitWallret;
	}

	public boolean SenseRight(Map map, int data, int[][] notWorkinghe){
		//have to make sure does not overshort boundary of environment
		
		int nextLocationX = 0;
		int nextLocationY = 0;
		
		//is true after robot hits a wall, to prevent it from sensing further
		boolean hitWall = false;
		boolean hitWallret = false;
		
		for(int i = 1; i < range+1; i++) {
			
			//if(hitWall)
			//	break;
				
			//make sure it is in the map range and bound.
			if(currentDirection ==SensorLocation.FACING_RIGHT) {
				nextLocationX = robot_x+locationOnRobot_x+i;
				nextLocationY = robot_y+locationOnRobot_y;
			}
			
			else if(currentDirection == SensorLocation.FACING_LEFT) {
				nextLocationX = robot_x+locationOnRobot_x-i;
				nextLocationY = robot_y+locationOnRobot_y;
			}
			else if(currentDirection == SensorLocation.FACING_TOP) {
				nextLocationX = robot_x+locationOnRobot_x;
				nextLocationY = robot_y+locationOnRobot_y-i;
			}
			else{
				//System.out.print("should be sensing right wall\n");
				nextLocationX = robot_x+locationOnRobot_x;
				nextLocationY = robot_y+locationOnRobot_y+i;
			}
			
			//hitwill will be true when senselocation returns a true which indicates that a wall has been met
			if(!hitWall){
				hitWall = SenseLocation(map,nextLocationX, nextLocationY, i);
				if(SenseLocation(map, nextLocationX, nextLocationY, 0) && i==2)
					hitWallret = true;
			}
			//send a 0 to signify that this is behind a wall
			else
				SenseLocation(map,nextLocationX, nextLocationY, 0);
			
			
		}
		//hitWallret=SenseLocation(map,nextLocationX, nextLocationY, 0);
		
		//update the map score after "sensing"
		map.updateMapWithScore();
		return hitWallret;
	}

}
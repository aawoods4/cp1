public class scores{
	public static void main(String[] args){
		int[] scores = new int[20];
		for(int i = 0; i < scores.length; i++){ //assigns values
			scores[i] = (int)(Math.random()*101);
			
		}
		for(int i = 0; i < scores.length; i++){ //outputs values
			System.out.println(scores);
		}
	}
}

import javax.swing.JOptionPane;


public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		x=10;
		
		int [] score = new int [10];
		for(int i=0; i<score.length; i++) {
			score[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter score"));
		}
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
			
		}
		
	}

}
System.out.println("stuff");

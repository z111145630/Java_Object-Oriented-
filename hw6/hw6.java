package hw6;
import java.util.Scanner;
public class hw6 {

	public static void main(String[] args) {

		int g,s,c1,c2;
		Scanner kb=new Scanner(System.in);
		System.out.println("�п�Jgrammar:");
		g=kb.nextInt();
		while(g<=0||g>30) {
			System.out.println("�Э��s��J�j��0�p��30��grammar:");
			g=kb.nextInt();
		}
		
		System.out.println("�п�Jspelling:");
		s=kb.nextInt();
		while(s<=0||s>20) {
			System.out.println("�Э��s��J�j��0�p��20��spelling:");
			s=kb.nextInt();
		}
		
		System.out.println("�п�Jcorrect:");
		c1=kb.nextInt();
		while(c1<=0||c1>20) {
			System.out.println("�Э��s��J�j��0�p��20��correct:");
			c1=kb.nextInt();
		}
		
		System.out.println("�п�Jcontent:");
		c2=kb.nextInt();
		while(c2<=0||c2>30) {
			System.out.println("�Э��s��J�j��0�p��30��content:");
			c2=kb.nextInt();
		}
		Essay e=new Essay(g,s,c1,c2);
		e.setScore(g,s,c1,c2);
		System.out.println(e.toString());
	}

}

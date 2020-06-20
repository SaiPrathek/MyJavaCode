import java.util.Arrays;
import java.util.Scanner;

public class MinSumPart {
	int sum(int a[], int n){
		int i=0, sum=0;
		for(;i<n;i++)
			sum+=a[i];
		return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MinSumPart msp = new MinSumPart();
		int n = s.nextInt();
		int a[] = new int[n], b[] = new int[n], c[] = new int[n], s1 = 0, s2 = 0;
		for(int i=0;i<n;i++)
			a[i] = s.nextInt();
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		b[s1++] = a[0];
		c[s2++] = a[1];
		for(int i=2;i<n;i++){
			if(msp.sum(c, s2)<msp.sum(b, s1))
				c[s2++]=a[i];
			else
				b[s1++]=a[i];
		}
		System.out.println(Math.abs(msp.sum(b, s1) - msp.sum(c, s2)));
		s.close();
	}

}

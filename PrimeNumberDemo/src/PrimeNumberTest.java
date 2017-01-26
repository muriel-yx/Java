
public class PrimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=2;a<=100;a++){
			int i = 2 ;
			while(i<=a){
				if(a%i == 0)
					break;
				i++;
			}
			if(a == i){
				System.out.println(a+"是质数");
			}
		}
	}
}


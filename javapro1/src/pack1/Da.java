package pack1;


public class Da {

	
	public static void main(String args[]){  

		// 합을 구하기 위한 변수

		int sum = 0;

		// 1은 제외해야 하기 때문에 2부터 시작

	    for(int num=2; num<=100; num++){   

	    	// 1과 자기 자신만으로 나누어지는 값을 소수라고 함

	    	// 1과 자기 자신을 체크하기 위한 변수

	    	int count = 0;

	    	for(int i=1; i<=num; i++) {

	    		if(num%i == 0) {

	    			count++;

	    		}

	    	}

    		if(count == 2) {

    			sum += num;

    			// 소수 출력

    			System.out.print(num+",");

    		}

	    }

	    // 소수의 합 출력

	    System.out.println(sum);

	}  

}




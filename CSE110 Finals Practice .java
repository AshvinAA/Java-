import java.util.ArrayList;
import java.util.Arrays;


class Practice {
	public static void main(String arg[]) {
		ArrayList<String> elements =new ArrayList<>(Arrays.asList("He","He","Io","Io"));
		for(;;){
			if(elements.contains("He")){
				elements.remove("He");
			}
			else {
				break;
			}
		}
		System.out.println(elements);

	}

	//Classwork 1
	public static void oneToN(int x, int n){
		if(x<=n){
			System.out.print(x+" ");
			oneToN(x+1,n);
		}
	}
	public static void nToOne(int x, int n){
		if(n>=x){
			System.out.print(n+" ");
			nToOne(x,n-1);
		}
	}
	public static int recursiveSum(int start, int end){
		if(start==end){
			return start;
		}
		else {
			return start+ recursiveSum(start+1,end);
		}
	}
	public static void reverseDigit(int n){
		if(n!=0){
			System.out.println(n%10);
			reverseDigit(n/10);
		}
	}
	public static int sumDigits(int n){
		if(n==0){
			return n;
		}
		else{
			return n%10 + sumDigits(n/10);
		}
	}
	public static int fibonacciNum(int n){
		if(n<=1){
			return n;
		}
		if(n==2){
			return 1;
		}
		else{
			return fibonacciNum(n-1)+fibonacciNum(n-2);
		}
	}
	public static void modifyStrings(String s, String s1, String s2){
		for(int i=0;i<s.length();i++){
			if(i<=s.length()-s1.length()){
				if(s.charAt(i)==s1.charAt(0)){
					String match="";
					for(int j=i;j<i+s1.length();j++){
						match+=s.charAt(j);
					}
					if(match.equals(s1)){
						System.out.print(s2);
						i+=s1.length();
					}
				}
				System.out.print(s.charAt(i));
			}
			else{
				System.out.print(s.charAt(i));
			}
		}
	}
	public static void emailChecker(String[] sArr){
		int count=0;
		for(int i=0;i< sArr.length;i++){
			boolean con1=false;
			boolean con2=false;
			boolean con3=false;
			boolean con4=false;
			String temp=sArr[i];
			for(int j=0;j<temp.length()-1;j++){
				if(temp.charAt(j)=='@'){
					con1=true;
					if((int) temp.charAt(j-1) >= 97 && (int) temp.charAt(j+1) >= 97){
						con2=true;
					}
				}
				if(con1&&con2){
					if(temp.charAt(j)=='.'){
						con3=true;
						if(temp.charAt(j+1) >= 97){
							con4=true;
						}
					}
				}
			}
			if(con1&&con2&&con3&&con4){
				count++;
			}
		}
		System.out.print(count);
	}
	public static boolean happyNumber(int n) {
		for (;;) {
			int sum = 0;
			while (n != 0) {
				sum += Math.pow(n % 10, 2);
				n /= 10;
			}
			if (sum == 1) {
				return true;
			}
			if (sum == 4) {
				return false;
			}
			n = sum;
		}
	}
	public static void primeOrPerfect(int[]arr){
		System.out.println("Prime numbers: ");
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			int factCount=0;
			for(int j=2;j<=num;j++){
				if(num%j==0){
					factCount++;
				}
			}
			if(factCount==1){
				System.out.println(i+": "+num);
			}
		}
		System.out.println("Perfect numbers: ");
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			int factSum=0;
			for(int j=1;j<num;j++){
				if(num%j==0){
					factSum+=j;
				}
			}
			if(factSum==num){
				System.out.println(i+": "+num);
			}
		}

	}
	public static void getScores(char[] arr){
		for(int i=0;i<arr.length;i++){
			switch(arr[i]){
				case 'A':
					System.out.println(100);
					break;
				case 'B':
					System.out.println(90);
					break;
				case 'C':
					System.out.println(70);
					break;
				default:
					System.out.println(0);
			}
		}
	}
	public static double convertToCm(double inch){
		double cm= inch*2.54;
		return cm;
	}
	public static double findAvgCm(double[] numsArr){
		double sum=0;
		for(int i=0;i<numsArr.length;i++){
			sum+=convertToCm(numsArr[i]);
		}
		double avg=sum/numsArr.length;
		return avg;
	}
	public static int isVowel(String sentence){
		int sum=0;
		for(int i=0;i<sentence.length();i++){
			char alp=Character.toLowerCase(sentence.charAt(i));
			if(alp=='a'||alp=='e'||alp=='i'||alp=='o'||alp=='u'){
				sum++;
			}
		}
		return sum;
	}
	public static int isConsonant(String sentence){
		int sum=0;
		for(int i=0;i<sentence.length();i++){
			char alp=Character.toLowerCase(sentence.charAt(i));
			if(alp!='a'&&alp!='e'&&alp!='i'&&alp!='o'&&alp!='u'&&alp!=' '){
				sum++;
			}
		}
		return sum;
	}
	public static int vowelSum(String[]arr){
		int vSum=0;
		for(int i=0;i<arr.length;i++){
			String name=arr[i];
			vSum+=isVowel(name);
		}
		return vSum;

	}
	public static int consonantSum(String[]arr){
		int cSum=0;
		for(int i=0;i<arr.length;i++){
			String name=arr[i];
			cSum+=isConsonant(name);
		}
		return cSum;
	}
	public static int vowelConsonantSum(String[] arr){
		int vSum=0;
		int cSum=0;
		for(int i=0;i<arr.length;i++){
			String name=arr[i];
			vSum+=isVowel(name);
			cSum+=isConsonant(name);
		}
		return vSum+cSum;
	}
	
	public class Diamond {
	    	public static void main(String[] args) {
	        Solution arr= new Solution();
	        int[] arrs={2,11,7,15};
	        System.out.println(Arrays.toString(arr.twoSum(arrs, 9)));
	    	}
	    	public static void dots(int num){
	        for(int i=1;i<=num;i++){
	            System.out.print(".");
	        	}
	    	}
	    	public static void pal(int num){
		        for(int i=1;i<=num;i++){
		            System.out.print(i);
	        	}
		        for(int i=num-1;i>=1;i--){
		            System.out.print(i);
	        	}
	    	}
	    	public static void diamonds(int num){
	        	for(int i=1;i<=num;i++){
		            dots(num-i);
		            pal(i);
		            dots(num-i);
		            System.out.println();
	        	}
		        for(int i=1;i<num;i++){
		            dots(i);
		            pal(num-i);
		            dots(i);
		            System.out.println();
		        }
	    	}
	}
}



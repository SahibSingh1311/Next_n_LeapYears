public class NextLeapYears{
	public static void main(String[] args){
	int givenYear = 2090;
	int n= 5;
	//1892,1896,1904,1908
	
	int counter=1;
	while(n>0){
		if(isLeap(givenYear)){
			System.out.println(givenYear);
			n--;
			counter=4;
		}
		givenYear +=counter;
}

}
public static boolean isLeap(int year){
	if(year %400==0||(year %4==0 && year %100!=0)){
		return true;
	}else
		return false;
}
}
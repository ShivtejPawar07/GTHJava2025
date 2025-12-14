class MaxLenSubArr{
	public static void main(String x[]){
		int[]a={2, 3, 1, 2, 4};
		int k=7,i=0,sum=0;
		int maxlen=Integer.MAX_VALUE;
		for(int j=0;j<a.length;j++){
			sum+=a[j];
			while(sum>k){
				sum-=a[i];
				i++;
			}
			maxlen=Math.min(maxlen,j-i+1);
		}
	System.out.println("Maximum lenght="+maxlen);
	}
}
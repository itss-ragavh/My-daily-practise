import java.util.Arrays;
class MergeSort 
{
	public static void main(String[] args) 
	{
		int[]a={12,2,3,40,8,0,-2,9,10,1000,3};
		System.out.println("\tArray Before Sorting \n\t\t"+Arrays.toString(a));
		int l=0,h=a.length-1;
		divide(a,l,h);
		System.out.println("\tArray After Sorting \n\t\t"+Arrays.toString(a));
	}
	public static void divide(int[]a,int l,int h){
		if (l==h)
		{
			return;
		}
		int mid=(l+h)/2;
		divide(a,l,mid);// leftt division
		divide(a,mid+1,h);//right division
		merge(a,l,mid,h);
	}
	public static void merge(int[]a,int l,int mid,int h)
	{
		int[]k=new int [a.length];
		int x=0;
		int left=l,right=mid+1;//print for child
		while (left<=mid&&right<=h)
		{
			if (a[left]<=a[right])
			{
				k[x]=a[left];
				x++;
				left++;
			}
			else
			{
				k[x]=a[right];
				x++;
				right++;
			}
		}//While Ends
		while (left<=mid)
		{
			k[x]=a[left];
			x++;
			left++;
		}
		while (right<=h)
		{
			k[x]=a[right];
			x++;
			right++;
		}
		x=0;
		for (int i=l;i<=h ;i++,x++ )
		{
			a[i]=k[x];
		}
	}
}

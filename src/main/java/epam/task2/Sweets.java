package epam.task2;

public class Sweets extends AbstractMethod{
	public int total_weight(int[] sweets,int n)
	{
		int tot=0;
		for(int i=0;i<n;i++)
		{
			tot+=sweets[i];
		}
		return tot;
	}
	public int num_of_candy(int low,int high,int[] sweets,int c)
	{
		int count=0;
		for(int i=0;i<c;i++)
		{
			if(sweets[i]>=low && sweets[i]<=high)
				count++;
		}
		return count;
	}

}

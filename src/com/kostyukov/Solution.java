package com.kostyukov;

public class Solution
{
	public static int solution(int N)
	{
		String binary = Integer.toBinaryString(N);
		int biggestGap = 0;
		int currentGap = 0;
		for (int i = 0; i < binary.length(); i++)
		{
			if (binary.charAt(i) == '0'){
				currentGap++;
			}
			else
			{
				if (currentGap > biggestGap)
				{
					biggestGap = currentGap;
					currentGap = 0;
				}
			}
		}
		
		return biggestGap;
	}
	
	public static void main(String[] args)
	{
		System.out.println(solution(33));
	}
}

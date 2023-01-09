package typical_Programms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		int[] arr= {4,8,6,3,2};
		int firstindex=0;
		int seconIndex=0;
		int temp=0;
		List<Integer> ad=new ArrayList<>();
		for(Integer i:arr) {
			
			ad.add(i);
		}
		//System.out.println(ad);
		Collections.sort(ad);
		//maxElement
		firstindex=ad.get(ad.size()-1);//8
		seconIndex=ad.get(ad.size()-2);//2
		
		temp=firstindex-seconIndex;//6
		
		List<Integer> list=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) 
		{
			list.add(arr[i]);
			if (firstindex==arr[i]) {
				list.remove(i);
				list.add(i, seconIndex);
				list.add(i+1, temp);
			}
		}
		System.out.println(list);
	}
}

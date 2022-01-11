package Lists;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		//2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        //listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
        //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
		
		String[] [] strArr= {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
		
		List<String> list= new ArrayList<>();
		List<String> list2= new ArrayList<>();
		
	
		for(String [ ]w: strArr)
		{
			for(String x:w)
			{
				list.add(x);
				
			}
		}
		
		
		for(int i=0; i<strArr.length; i++)
		{
			for(int j=0; j<strArr[i].length; j++)
			{
				list2.add(strArr[i][j]);
			}
		}
		
      System.out.println(list);
      System.out.println(list2);
	}

}

package ArrayListAsgmt;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class ArrayListExamp4  {
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> inpList = new ArrayList<Integer>();
		for(int i=0;i<n*2;i++) {
			inpList.add(Integer.parseInt(br.readLine()));
			}
		System.out.println(ArrayListExamp4.getYear(inpList));
		}

	private static char[] getYear(ArrayList<Integer> inpList) {
		// TODO Auto-generated method stub
		return null;
	}
	}

//4 2010 200000 2011 300000 2012 45000 2013 25000
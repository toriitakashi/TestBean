package servlet;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args){

		System.out.println(test("2,1,1,4,3"));
	}

	private static boolean test(String arg){

		if(arg ==  null || arg.equals("") ){
			return true;
		}

		//重複チェックリスト
		List<String> list = new ArrayList<String>();

		for(String str :arg.split(",")){
			if(str.matches("[1-5]{1}") && !list.contains(str)){
				list.add(str);
			}else{
				return false;
			}
		}
		return list.size() != 0;
	}

}

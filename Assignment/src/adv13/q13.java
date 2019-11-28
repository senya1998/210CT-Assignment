package adv13;

import java.util.ArrayList;

public class q13 {
	
	static int cound = 1;

	static ArrayList<String> list=new ArrayList<String>();
	
	static String[] success = {"123456","2546","32456","4","546","64"};

	public static void main(String[] args) {
		char[] s = {'1','2','3','4','5','6'};
		permutation(s, 0, 5);
		for(int i = 0; i < list.size(); i++) {
			check(list.get(i));
		}
	}
	
	public static void check(String path) {
		int first = Integer.parseInt(path.substring(0,1));
		int secound = Integer.parseInt(path.substring(1,2));
		int third = Integer.parseInt(path.substring(2,3));
		int fourth = Integer.parseInt(path.substring(3,4));
		int fifth = Integer.parseInt(path.substring(4,5));
		int sixth = Integer.parseInt(path.substring(5,6));
		if(success[first-1].contains(secound+"")) {
			if(success[secound-1].contains(third+"")) {
				if(success[third-1].contains(fourth+"")) {
					if(success[fourth-1].contains(fifth+"")) {
						if(success[fifth-1].contains(sixth+"")) {
							System.out.println(path);
						}
					}
				}
			}
		}
	}
	
    private static void printInfo(char[] a) {
        String s = "";
    	cound %= 6;
        for (int i = 0; i < a.length; i++) {
        	if(cound == 6) {
        		s+=a[i]+"";
        		list.add(s);
        		s = "";
        		cound = 1;
        	} else {
        		s+=a[i]+"";
        		cound++;
        	}
        }
    }
    public static void permutation(char[] s,int from,int to) {
        if(to <= 1)
            return;
        if(from == to) {
            printInfo(s);
        } else {
            for(int i=from; i<=to; i++) {
                swap(s,i,from);
                permutation(s, from+1, to);
                swap(s,from,i);
            }
        }
    }
    public static void swap(char[] s,int i,int j) {
    char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
}

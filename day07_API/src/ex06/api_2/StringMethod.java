package ex06.api_2;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "seulkee";
		String s2 = "Seoul";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println(s2.replace("eo", "Korea"));
		System.out.println(s2.hashCode());
		s2=s2.replace("eo", "Korea");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println("============================");
		
		s1 = s2.concat(s1); //���ڿ� ���� // = s1 = s1+s2;
		s1 = s1+s2;
		System.out.println(s1);
		
		String s3 = new String("     ab       cd        ");
		System.out.println("lenth = " + s3.length());//24
		s3=	s3.trim();//���� ���� method
		
		System.out.println("lenth = " + s3.length());
		
		System.out.println("============================");
		
		int [] arr = { 1,2,3,4,5};
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]+"\t");
		}
		System.out.println("============================");
		
		String s4 = new String("ab/cdefd/23425/sdkfjlsdkf/32324");
		//String s4 = new String("ab cdefd 23425 sdkfjlsdkf 32324");
		String[] s5 = s4.split("/");
		for(int i=0; i<s5.length; i++){
			System.out.println("�и���"+ i + "��° ���ڿ� : " + s5[i]);
		}
		
		System.out.println("---------------------------");
		String s6 = "123-456-789-1230";
		String[] s7 = s6.split("-");
		for(int i=0; i<s7.length; i++){
			System.out.println("�и���"+ i + "��° ���ڿ� : " + s7[i]);
		}
		System.out.println("---------------------------");
		String s8 = "1234567890dkljfwe sdfj      dslkfjwl   dkf";
		char ch = s8.charAt(10);
		System.out.println(ch);
		
		s8 = s8.substring(3);
		System.out.println(s8); // 3�� �ε��� ���� ������ ���
		System.out.println("---------------------------");
		
		s8 = s8.substring(3, 9); // ���۰� ����, ���� ������
		System.out.println(s8);
	
		s8 = "123456789abcld cj cljsd   cjdkslacj c cdkj ";
		System.out.println(s8.indexOf('d')); // 13
		System.out.println(s8.lastIndexOf('d')); // 39
		
		System.out.println("�ҹ��� ��� toLowerCase() : " + s2.toLowerCase());
		System.out.println("�빮�� ��� toUpperCase() : " + s1.toUpperCase());
		//�ٲ㼭 �������
		
		System.out.println(s1.length());
		char[] ch2 = s1.toCharArray(); // string�� char �迭�� �ٲ���
		for(int i=0; i<ch2.length; i++){
			System.out.println(ch2[i]+"\t");
		}
		System.out.println();
		
		String strstr = "abcDEFGHeijwELMPYmnqr";
		String strtemp = strstr.toLowerCase();
		String strtemp2 = strstr.toUpperCase();
		
		char [] chch = strstr.toCharArray();
		char [] chchtemp = strtemp.toCharArray();
		char [] chchtemp2 = strtemp2.toCharArray();
		
		for(int i=0; i<chch.length; i++){
			if(chch[i]==chchtemp[i])
				chch[i]=strtemp2.charAt(i);
			else
				chch[i]=strtemp.charAt(i);
			System.out.print(chch[i]);
		}
		
	}
}

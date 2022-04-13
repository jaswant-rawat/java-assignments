package com.assign3.java;

public class StringAssign {

	
	
	
	public static void main(String[] args) {
		String str="Hello World";
		String str1="Hello ";
		String str2="How are you?";
		
		
		System.out.println("Length of the string is: "+str.length());
		
		
		String str3=str1.concat(str2);
		System.out.println(str3);
		
		
		String str4="Java string pool refers to collection of Strings which are stored in heap memory";
		
		System.out.println("String in lowercase: "+str4.toLowerCase());
		System.out.println("String in lowercase: "+str4.toUpperCase());
		
		String str5=str4.replace('a', '$');
		System.out.println("String after replacing a with $ "+str5 );
		
		
		System.out.println(str4.contains("collection"));
		
		
		String str6="java string pool refers to collection of strings which are stored in heap memory";
		
		System.out.println(str4.equals(str6));
		System.out.println("case ignored:"+str4.equalsIgnoreCase(str6));
		
		
		//StringBuffer
		
		StringBuffer sb=new StringBuffer();
		
		System.out.println(sb);
		
		sb.append("StringBuffer");
		System.out.println(sb);
		sb.append(" is a peer class of String");
		System.out.println(sb);
		sb.append(" that provides much of");
		System.out.println(sb);
		sb.append(" the functionality of strings");
		System.out.println(sb);
		
		StringBuffer sb2=new StringBuffer("It is used to _ at the specified index position");
		System.out.println(sb2);
		String str7="insert text";
		sb2.replace(14, 15, str7);
		System.out.println(sb2);

//		sb2.insert(13, "insert text");
	//	System.out.println(sb2);
		
		
		String str8="This method returns the reversed object on which it was called";
		StringBuffer sb4=new StringBuffer(str8);
		System.out.println("Before reverse:");
		System.out.println(sb4);
		sb4.reverse();
		System.out.println("After reverse:");
		System.out.println(sb4);

		
		//StringBuilder
	
		
		StringBuilder sbu=new StringBuilder();
		
		System.out.println(sbu);
		
		sb.append("StringBuffer");
		System.out.println(sbu);
		sb.append(" is a peer class of String");
		System.out.println(sbu);
		sb.append(" that provides much of");
		System.out.println(sbu);
		sb.append(" the functionality of strings");
		System.out.println(sbu);
		
		StringBuilder sbu2=new StringBuilder("It is used to _ at the specified index position");
		System.out.println(sbu2);
		String str9="insert text";
		sbu2.replace(14, 15, str7);
		System.out.println(sbu2);

//		sb2.insert(13, "insert text");
	//	System.out.println(sb2);
		
		
		String str10="This method returns the reversed object on which it was called";
		StringBuilder sbu3=new StringBuilder(str10);
		System.out.println("Before reverse:");
		System.out.println(sbu3);
		sbu3.reverse();
		System.out.println("After reverse:");
		System.out.println(sbu3);
		
	}
	
	
	
}

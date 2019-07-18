package com.work.view;

import com.work.model.dto.Member;

public class MemberTest {

	public static void main(String[] args) {
		Member dto1 = new Member();
		Member dto2 = new Member("user01", "password01", "홍길동", "010-1234-5678", "user01@work.com");
		
		System.out.println(dto1);
		System.out.println(dto2);
	}

}

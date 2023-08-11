package com.ssafy.fit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;

public class Page {

	Scanner sc = new Scanner(System.in);

	List<VideoReview> review = new ArrayList<>();

	public void page0(List<Video> list) {

		System.out.println("----------------------------------------------");
		System.out.println("자바로 구현하는 SSAFIT");
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		System.out.println("1. 영상정보");
		System.out.println("0. 종료");
		System.out.println("----------------------------------------------");
		System.out.print("메뉴를 선택하세요 : ");
		int n = sc.nextInt();
		if (n == 1) {
			page1(list);
		} else if (n == 0) {
			System.out.println("종료");
		} else {
			System.out.println("0 또는 1을 입력하세요");
		}

	}

	public void page1(List<Video> list) {
		System.out.println("----------------------------------------------");
		System.out.println("1. 영상목록");
		System.out.println("0. 이전으로");
		System.out.println("----------------------------------------------");
		System.out.print("메뉴를 선택하세요 : ");
		int n = sc.nextInt();
		if (n == 1) {
			page2(list);
		} else if (n == 0) {
			page0(list);
		} else {
			System.out.println("0 또는 1을 입력하세요");
		}
	}

	public void page2(List<Video> list) {
		System.out.println("----------------------------------------------");
		System.out.println("전체 :" + list.size() + "개");
		System.out.println("----------------------------------------------");

		for (Video a : list) {
			System.out.println(a.getNo() + "  " + a.getTitle());
		}
		System.out.println("----------------------------------------------");
		System.out.println("1. 영상상세");
		System.out.println("0. 이전으로");
		System.out.println("----------------------------------------------");
		System.out.print("메뉴를 선택하세요 : ");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.print("영상번호를 선택하세요 : ");
			int videoNo = sc.nextInt();
			videoInfo(videoNo, list);
		} else if (n == 0) {
			page1(list);
		} else {
			System.out.println("0 또는 1을 입력하세요");
		}
	}

	public void videoInfo(int num, List<Video> list) {
		Video select = new Video();
		select = list.get(num-1);
		while(true) {
			int cnt =1;
		System.out.println("----------------------------------------------");
		System.out.println("번호  : " + num);
		System.out.println("제목  : " + select.getTitle());
		System.out.println("운동  : " + select.getPart());
		System.out.println("영상 URL  : " + select.getUrl());
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		List<VideoReview> temp = new ArrayList<>();
		for(int i = 0; i<review.size();i++) {
			
			if(review.get(i).getVideoNo() == num) {
				temp.add(review.get(i));
			temp.get(i).setReviewNo(cnt);
			cnt++;
			}
			
		}
		System.out.println("영상 리뷰 : " + temp.size() + "개");
		System.out.println("----------------------------------------------");
		for(VideoReview a : temp) {
			System.out.println(a.getReviewNo()+"  "+a.getNickNmae()+"  " + a.getContent());
		}
		System.out.println("----------------------------------------------");
		System.out.println("1. 리뷰등록");
		System.out.println("0. 이전으로");
		
		System.out.println("----------------------------------------------");
		System.out.print("메뉴를 선택하세요 : ");
		int n = sc.nextInt();
		if(n==1) {
			System.out.print("닉네임을 선택하세요 : \n");
			String nick = sc.next();
			System.out.print("내용을 선택하세요 : ");
			String con = sc.next();
			VideoReview idx = new VideoReview(num, nick, con);
			review.add(idx);
		}
		else if (n==0) {
			 page2(list);
	}
		else System.out.println("0 또는 1을 입력하세요");}
	}

}

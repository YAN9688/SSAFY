package com.ssafy.fit;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import com.google.gson.Gson;

public class Test {

	public static void main(String[] args) throws IOException {
		
		Gson gson = new Gson();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("data/video.json"))); 		
	
		StringBuilder sb = new StringBuilder();
		String str = null; //문자열 임시 저장 변수
		
		while((str = br.readLine())!=null) {
			sb.append(str).append("\n");
		}
		
		Video[] arr = gson.fromJson(sb.toString(), Video[].class);
		
		List<Video> list = new ArrayList<>();
		for(Video a : arr) {
			list.add(a);
		}
		
		List<VideoReview> review =new ArrayList<>();

		Page page =new Page();
		page.page0(list);

	}	
	
}

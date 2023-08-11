package com.ssafy.fit;

public class VideoReview {
	private int videNo;
	private int reviewNo;
	private String nickNmae;
	private String content;
	public int getVideoNo() {
		return videNo;
	}
	public void setVideoNo(int videoNo) {
		this.videNo = videoNo;
	}

	public String getNickNmae() {
		return nickNmae;
	}
	public void setNickNmae(String nickNmae) {
		this.nickNmae = nickNmae;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public VideoReview(int videNo, String nickNmae, String content) {
		
		this.videNo = videNo;
		this.nickNmae = nickNmae;
		this.content = content;
		
	}
	public int getReviewNo() {
		return reviewNo;
	}
	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}
	@Override
	public String toString() {
		return "VideoReview [videNo=" + videNo + ", reviewNo=" + reviewNo + ", nickNmae=" + nickNmae + ", content="
				+ content + "]";
	}
	
	
	
}

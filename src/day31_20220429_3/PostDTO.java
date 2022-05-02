package day31_20220429_3;

public class PostDTO {
	
	// 선생님 코드
	private Long id;
	private String postTitle;
	private String postWriter;
	private String postPass;
	private String postContents;
	private int postHits = 0;
	private String postDate;

	public PostDTO() {

	}

	public PostDTO(Long id, String postTitle, String postWriter, String postPass, String postContents, int postHits,
			String postDate) {
		this.id = id;
		this.postTitle = postTitle;
		this.postWriter = postWriter;
		this.postPass = postPass;
		this.postContents = postContents;
		this.postHits = postHits;
		this.postDate = postDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostWriter() {
		return postWriter;
	}

	public void setPostWriter(String postWriter) {
		this.postWriter = postWriter;
	}

	public String getPostPass() {
		return postPass;
	}

	public void setPostPass(String postPass) {
		this.postPass = postPass;
	}

	public String getPostContents() {
		return postContents;
	}

	public void setPostContents(String postContents) {
		this.postContents = postContents;
	}

	public int getPostHits() {
		return postHits;
	}

	public void setPostHits(int postHits) {
		this.postHits = postHits;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	@Override
	public String toString() {
		return "PostDTO [id=" + id + ", postTitle=" + postTitle + ", postWriter=" + postWriter + ", postPass="
				+ postPass + ", postContents=" + postContents + ", postHits=" + postHits + ", postDate=" + postDate
				+ "]";
	}

}

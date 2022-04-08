package chapter03;

public class MemberInfo {
	private String id;
	private String pw;

	public MemberInfo(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public boolean equals(Object obj) {
		MemberInfo otherMemberInfo = (MemberInfo) obj;
		
		String otherMemberId = otherMemberInfo.getId();
		String otherMemberPw = otherMemberInfo.getPw();
		
		boolean sameId = otherMemberId.equals(id);
		boolean samePw = otherMemberPw.equals(pw);
		
		return sameId && samePw;
	}
}









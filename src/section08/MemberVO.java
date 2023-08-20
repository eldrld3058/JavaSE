package section08;

public class MemberVO {
	//private - 자기자신 클래스에서만 접근 가능한 접근제한자
    private String id;
    private String pwd;
    private String name;
    private String age;
    private String mobile;
    
    public String getId() {
    	return id;
    }
    public void setId(String id) {
    	this.id = id;
    }
    public String getPwd() {
    	return pwd;
    }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	
    }
    public int getAge(int age) {
    	return age;
    }
    public void setAge(int age) {
    	if(age <= 0) {
    		System.out.println("잘못된 수를 입력하였습니다.");
    		return;
    	}
    	this.age = age;
    }
    public String getMobile() {
    	return mobile;
    }
    public void setMobile(String mobile) {
    	this.mobile = mobile;
    }
}

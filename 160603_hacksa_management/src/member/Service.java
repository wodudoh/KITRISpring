package member;


/**
 * 기능을 구현한 서비스 인터페이스
 * @author Administrator
 *
 */
public interface Service {
	/**
	 * 멤버 추가 메소드
	 * @param m
	 */
	void addMember(Member m);
	/**
	 * 멤버 출력 메소드
	 * @param num
	 * @return
	 */
	Member getMember(int num);
	
	/** 로그인
	 * 
	 * @return
	 */
	boolean login(int num, String name);
	/**
	 * 멤버 수정 메소드
	 * @param m
	 */
	void editInfo(Member m);
	/**
	 *  멤버 삭제 메소드
	 * @param num
	 */
	void delMember(int num);
}

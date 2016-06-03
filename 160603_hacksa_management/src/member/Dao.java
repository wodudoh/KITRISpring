package member;

public interface Dao {
	
	void insert(Member m);
	/**
	 * select 해주는 
	 * @param num
	 * @return
	 */
	Member select(int num);
	/**
	 * 전화, 이메일만 수정
	 * @param m
	 */
	void update(Member m);
	/**
	 * 제거
	 * @param num
	 */
	void delete(int num);
	
}

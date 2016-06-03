package member;

public class ServiceImple implements Service {

	private Dao dao;
	
	public ServiceImple(){
		dao = new DaoImpl();
	}
	public void addMember(Member m) {
		// TODO Auto-generated method stub

	}

	@Override
	public Member getMember(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(int num, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void editInfo(Member m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delMember(int num) {
		// TODO Auto-generated method stub

	}

}

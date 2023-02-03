public class ProxyInternetAccess implements OfficeInternetAccess {
	private String employeeName;
	private RealInternetAccess realaccess;


	public ProxyInternetAccess(String employeeName){
		this.employeeName=employeeName;
	}
	public int getRole(String emplName){
		return 9;
	}
	@Override
	public void grantInternetAccess(){
		if( getRole(employeeName)>4 ){
			realaccess = new RealInternetAccess(employeeName);
			realaccess.grantInternetAccess();
		} else {
			System.out.println("No internet access granted. Your job level is below 5");
		}
	}
}
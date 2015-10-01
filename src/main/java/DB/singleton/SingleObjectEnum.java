package DB.singleton;
//enum es una versio resumida del private static, fa el mateix

public enum SingleObjectEnum {
instance;

	public void showMessage(){
		System.out.println("Hello World!");
	}
}
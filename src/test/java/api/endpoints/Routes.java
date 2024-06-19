package api.endpoints;



/*Base URL: https://petstore.swagger.io/v2

Createuser POST :https://petstore.swagger.io/user
ReadUser GET : https://petstore.swagger.io/user/{username}
UpdateUser PUT : https://petstore.swagger.io/user/{username}
DeleteUser Delete : https://petstore.swagger.io/user/{username}*/

public class Routes {
	
	public static String base_url = "https://petstore.swagger.io/v2";
	
	//User model URLs
	public static String post_url = base_url + "/user";
	public static String get_url = base_url + "/user/{username}";
	public static String update_url = base_url + "/user/{username}";
	public static String delete_url = base_url + "/user/{username}";

	

}

import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello World");
		System.out.println("Hello World Program00110");
    		System.out.println("COMMITED FROM GITHUB Test Line of Codes ###");
    		System.out.println("Push Event for Jenkins Build Trigger 001");  // Sample Commit
    		System.out.println("### End of the Program ###12345");
    		System.out.println("### End of the Program ###1234+++++++++");
	}
}

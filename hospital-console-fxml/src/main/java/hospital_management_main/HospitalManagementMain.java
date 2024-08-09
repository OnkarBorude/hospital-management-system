package hospital_management_main;

import common.StageHolder;
import javafx.application.Application;
import javafx.stage.Stage;
import login_screen.LoginScreen;


public class HospitalManagementMain extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stageOfJavaFx) throws Exception {
		StageHolder.stage=stageOfJavaFx;
		StageHolder.stage.setTitle("Hospital-Management");
		new LoginScreen().show();
	}

}

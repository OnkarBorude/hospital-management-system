package login_screen;

import java.io.IOException;

import common.EndPoints;
import common.RestUtil;
import dashboard_page.Dashboard;
import dto.LoginRequest;
import dto.LoginResponse;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginScreenController {
	
	@FXML
	TextField uName;
	
	@FXML
	TextField password;
	
	@FXML
	Label responseMsg;
	
	public void loginButtonClicked() throws IOException, InterruptedException {
		
		LoginRequest loginRequest=new LoginRequest();
		loginRequest.setUser(uName.getText());
		loginRequest.setPassword(password.getText());
		String url=EndPoints.LOGIN;
		
		LoginResponse loginResponse=RestUtil.postRequest(url, loginRequest, LoginResponse.class);
		
		if(loginResponse.getResponseCode().equals("0000")) {
			new Dashboard().show();
		}
		else {
			responseMsg.setText("Login Failed");
			responseMsg.setTextFill(Color.RED);
		}
	}

}

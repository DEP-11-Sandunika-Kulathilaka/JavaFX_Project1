package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainFormController {
    public AnchorPane root;
    public MenuItem MenuItemNew;
    public MenuItem MenuItemUserGuide;
    public MenuItem MenuItemAboutUs;
    public MenuItem MenuExit;

    public void MenuItemNewOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane mainFormRoot = FXMLLoader.load(getClass().getResource("/view/MainForm.fxml"));
        Scene mainForm = new Scene(mainFormRoot);

        Stage stage = new Stage();
        stage.setScene(mainForm);
        stage.setTitle("Simple Text Editor");
        stage.show();
        stage.setMaximized(true);

    }
    public void MenuItemUserGuideOnAction(ActionEvent actionEvent) {
    }

    public void MenuItemAboutUsOnAction(ActionEvent actionEvent) {
    }

    public void MenuExitOnAction(ActionEvent actionEvent) {
    }
}

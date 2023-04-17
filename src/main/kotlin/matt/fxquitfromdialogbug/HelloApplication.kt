package matt.fxquitfromdialogbug

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Dialog
import javafx.scene.input.KeyCode
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val scene = Scene(VBox(), 320.0, 240.0)
        stage.title = "Hello!"
        stage.scene = scene.apply {
            setOnKeyPressed {
                if (it.code == KeyCode.N && it.isMetaDown) {
                    Dialog<String>().apply {
                    }.showAndWait()
                }
            }
        }
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}
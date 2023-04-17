package matt.fxquitfromdialogbug

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.input.KeyCode
import javafx.scene.layout.VBox
import javafx.stage.Modality
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val scene = Scene(VBox(), 320.0, 240.0)
        stage.scene = scene.apply {
            setOnKeyPressed {
                if (it.code == KeyCode.B && it.isMetaDown) {
                    Stage().apply {
                        initModality(Modality.APPLICATION_MODAL)
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
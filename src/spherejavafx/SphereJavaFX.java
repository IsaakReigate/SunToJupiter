//Page 391 in the JavaFX Textbook
package spherejavafx;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.concurrent.TimeUnit;



public class SphereJavaFX extends Application {

    //ROTATE SPEEDS
    //Mercury = 0.02x --> 1000/0.02=50000ms
    //Venus = 0.004x ---> 1000/0.004=250000ms
    //Earth = 1x -------> 1000/1=1000ms
    //Mars = 0.98x -----> 1000/0.98=1020ms
    //Jupiter = 2.66x --> 1000/2.66=376ms
    //Sun = well..... --> BIG ms
    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();

        //root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 300);
        PerspectiveCamera camera = new PerspectiveCamera(true);

        //Backs the camera away from the scene by 1000 units
        camera.setTranslateZ(-12500);

        //This is the range of which the camera will render objects
        camera.setNearClip(0.1);
        camera.setFarClip(15000.0);

        //The default field of view for the scene is 30 but change to suit
        camera.setFieldOfView(60);
        scene.setCamera(camera);

        //This sets up my earth
        Sphere mysphere = new Sphere(700);
        mysphere.setTranslateX(-1500);
        mysphere.setTranslateY(-100);
        mysphere.setTranslateZ(100);
        root.getChildren().add(mysphere);

        Image earthImage = new Image("file:earth.jpg");
        PhongMaterial earthPhong = new PhongMaterial();
        earthPhong.setDiffuseMap(earthImage);
        mysphere.setMaterial(earthPhong);

        RotateTransition rotate = new RotateTransition();
        rotate.setNode(mysphere);
        rotate.setDuration(Duration.millis(1000));
        rotate.setAxis(Rotate.Y_AXIS);
        rotate.setByAngle(-360);
        rotate.setCycleCount(Animation.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.play();

        //This sets up my mercury
        Sphere myMercury = new Sphere(300);
        myMercury.setTranslateX(-4000);
        myMercury.setTranslateY(-100);
        myMercury.setTranslateZ(100);
        root.getChildren().add(myMercury);

        Image MercuryImage = new Image("file:mercury.jpg");
        PhongMaterial MercuryPhong = new PhongMaterial();
        MercuryPhong.setDiffuseMap(MercuryImage);
        myMercury.setMaterial(MercuryPhong);

        RotateTransition rotateMercury = new RotateTransition();
        rotateMercury.setNode(myMercury);
        rotateMercury.setDuration(Duration.millis(50000));
        rotateMercury.setAxis(Rotate.Y_AXIS);
        rotateMercury.setByAngle(-360);
        rotateMercury.setCycleCount(Animation.INDEFINITE);
        rotateMercury.setInterpolator(Interpolator.LINEAR);
        rotateMercury.play();

        //This sets up my Venus
        Sphere myVenus = new Sphere(600);
        myVenus.setTranslateX(-2900);
        myVenus.setTranslateY(-100);
        myVenus.setTranslateZ(100);
        root.getChildren().add(myVenus);

        Image VenusImage = new Image("file:venus.jpg");
        PhongMaterial VenusPhong = new PhongMaterial();
        VenusPhong.setDiffuseMap(VenusImage);
        myVenus.setMaterial(VenusPhong);

        RotateTransition rotateVenus = new RotateTransition();
        rotateVenus.setNode(myVenus);
        rotateVenus.setDuration(Duration.millis(250000));
        rotateVenus.setAxis(Rotate.Y_AXIS);
        rotateVenus.setByAngle(-360);
        rotateVenus.setCycleCount(Animation.INDEFINITE);
        rotateVenus.setInterpolator(Interpolator.LINEAR);
        rotateVenus.play();

        //This sets up my Mars
        Sphere myMars = new Sphere(450);
        myMars.setTranslateX(0);
        myMars.setTranslateY(-100);
        myMars.setTranslateZ(100);
        root.getChildren().add(myMars);

        Image MarsImage = new Image("file:mars.jpg");
        PhongMaterial MarsPhong = new PhongMaterial();
        MarsPhong.setDiffuseMap(MarsImage);
        myMars.setMaterial(MarsPhong);

        RotateTransition rotateMars = new RotateTransition();
        rotateMars.setNode(myMars);
        rotateMars.setDuration(Duration.millis(1020));
        rotateMars.setAxis(Rotate.Y_AXIS);
        rotateMars.setByAngle(-360);
        rotateMars.setCycleCount(Animation.INDEFINITE);
        rotateMars.setInterpolator(Interpolator.LINEAR);
        rotateMars.play();

        //This sets up my Jupiter
        Sphere myJupiter = new Sphere(2500);
        myJupiter.setTranslateX(3500);
        myJupiter.setTranslateY(-100);
        myJupiter.setTranslateZ(100);
        root.getChildren().add(myJupiter);

        Image JupiterImage = new Image("file:jupiter.jpg");
        PhongMaterial JupiterPhong = new PhongMaterial();
        JupiterPhong.setDiffuseMap(JupiterImage);
        myJupiter.setMaterial(JupiterPhong);

        RotateTransition rotateJupiter = new RotateTransition();
        rotateJupiter.setNode(myJupiter);
        rotateJupiter.setDuration(Duration.millis(376));
        rotateJupiter.setAxis(Rotate.Y_AXIS);
        rotateJupiter.setByAngle(-360);
        rotateJupiter.setCycleCount(Animation.INDEFINITE);
        rotateJupiter.setInterpolator(Interpolator.LINEAR);
        rotateJupiter.play();

        //This sets up my Sun
        Sphere mySun = new Sphere(20000);
        mySun.setTranslateX(-25000);
        mySun.setTranslateY(-100);
        mySun.setTranslateZ(100);
        root.getChildren().add(mySun);

        Image SunImage = new Image("file:sun.jfif");
        PhongMaterial SunPhong = new PhongMaterial();
        SunPhong.setDiffuseMap(SunImage);
        mySun.setMaterial(SunPhong);

        RotateTransition rotateSun = new RotateTransition();
        rotateSun.setNode(mySun);
        rotateSun.setDuration(Duration.millis(1000000));
        rotateSun.setAxis(Rotate.Y_AXIS);
        rotateSun.setByAngle(-360);
        rotateSun.setCycleCount(Animation.INDEFINITE);
        rotateSun.setInterpolator(Interpolator.LINEAR);
        rotateSun.play();

        primaryStage.setScene(scene);
        primaryStage.show();



    }

    public static void main(String[] args) {
        launch(args);

    }
}

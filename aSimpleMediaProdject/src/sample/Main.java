package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

  Stage window;
  Scene blueOysterCultScene;
  Scene tyranyAndMutationScene;
  Scene secretTreatiesScene;
  Scene agentsOfFortuneScene;
  Scene spectresScene;
  Scene mirrorsScene;
  Scene cultosaurusErectusScene;
  Scene fireOfUnknownOriginScene;
  Scene theRevolutionByNightScene;
  Scene clubNinjaScene;
  Scene imaginosScene;
  Scene heavenForbidScene;
  Scene curseOfTheHiddenMirrorScene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        final ImageView blueOysterCultImageView = new ImageView();
        String blueOysterCultString = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/" +
                "blueOysterCult/blueOysterCult.png";
        Image blueOysterCultImage = new Image(new File(blueOysterCultString).toURI().toString());
        blueOysterCultImageView.setImage(blueOysterCultImage);
        blueOysterCultImageView.setFitHeight(325);
        blueOysterCultImageView.setFitWidth(325);
        blueOysterCultImageView.setPreserveRatio(true);
        blueOysterCultImageView.setSmooth(true);
        blueOysterCultImageView.setCache(true);
        Button blueOysterCultButton = new Button();
        blueOysterCultButton.setGraphic(blueOysterCultImageView);
        blueOysterCultButton.setOnAction(actionEvent -> window.setScene(blueOysterCultScene));


        final ImageView tyranyAndMutationImageView = new ImageView();
        String tyranyAndMutationString = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/" +
                "tyrannyAndMutation/tyrannyAndMutation.png";
        Image tyranyAndMutationImage = new Image(new File(tyranyAndMutationString).toURI().toString());
        tyranyAndMutationImageView.setImage(tyranyAndMutationImage);
        tyranyAndMutationImageView.setFitHeight(325);
        tyranyAndMutationImageView.setFitWidth(325);
        tyranyAndMutationImageView.setPreserveRatio(true);
        tyranyAndMutationImageView.setSmooth(true);
        tyranyAndMutationImageView.setCache(true);
        Button tyranyAndMutationButton = new Button();
        tyranyAndMutationButton.setGraphic(tyranyAndMutationImageView);
        tyranyAndMutationButton.setOnAction(event -> window.setScene(tyranyAndMutationScene));


        final ImageView secretTreatiesImageView = new ImageView();
        String secretTreatiesString = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/" +
                "secretTreaties/secretTreaties.png";
        Image secretTreatiesImage = new Image(new File(secretTreatiesString).toURI().toString());
        secretTreatiesImageView.setImage(secretTreatiesImage);
        secretTreatiesImageView.setFitHeight(325);
        secretTreatiesImageView.setFitWidth(325);
        secretTreatiesImageView.setPreserveRatio(true);
        secretTreatiesImageView.setSmooth(true);
        secretTreatiesImageView.setCache(true);
        Button secretTreatiesButton = new Button();
        secretTreatiesButton.setGraphic(secretTreatiesImageView);
        secretTreatiesButton.setOnAction(event -> window.setScene(secretTreatiesScene));


        final ImageView agentsOfFortuneImageView = new ImageView();
        String agentsOfFortuneString = "/Users/amanti/Desktop/aSimpleMediaProdject/src/" +
                "sample/media/agentsOfFortune/agentsOfFortune.png";
        Image agentsOfFortuneImage = new Image(new File(agentsOfFortuneString).toURI().toString());
        agentsOfFortuneImageView.setImage(agentsOfFortuneImage);
        agentsOfFortuneImageView.setFitHeight(325);
        agentsOfFortuneImageView.setFitWidth(325);
        agentsOfFortuneImageView.setPreserveRatio(true);
        agentsOfFortuneImageView.setSmooth(true);
        agentsOfFortuneImageView.setCache(true);
        Button agentsOfFortuneButton = new Button();
        agentsOfFortuneButton.setGraphic(agentsOfFortuneImageView);
        agentsOfFortuneButton.setOnAction(event -> window.setScene(agentsOfFortuneScene));



        final ImageView spectresImageView = new ImageView();
        String spectresString = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample" +
                "/media/spectres/spectres.png";
        Image spectresImage = new Image(new File(spectresString).toURI().toString());
        spectresImageView.setImage(spectresImage);
        spectresImageView.setFitHeight(325);
        spectresImageView.setFitWidth(325);
        spectresImageView.setPreserveRatio(true);
        spectresImageView.setSmooth(true);
        spectresImageView.setCache(true);
        Button spectresButton = new Button();
        spectresButton.setGraphic(spectresImageView);
        spectresButton.setOnAction(event -> window.setScene(spectresScene));

        final ImageView mirrorsImageView = new ImageView();
        String mirrorsString = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample" +
                "/media/mirrors/mirrors.jpg";
        Image mirrorsImage = new Image(new File(mirrorsString).toURI().toString());
        mirrorsImageView.setImage(mirrorsImage);
        mirrorsImageView.setFitHeight(325);
        mirrorsImageView.setFitWidth(325);
        mirrorsImageView.setPreserveRatio(true);
        mirrorsImageView.setSmooth(true);
        mirrorsImageView.setCache(true);
        Button mirrorsButton = new Button();
        mirrorsButton.setGraphic(mirrorsImageView);
        mirrorsButton.setOnAction(event -> window.setScene(mirrorsScene));

        final ImageView cultosaurusErectusImageView = new ImageView();
        String cultosaurusErectusString = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/" +
                "cultosaurusErectus/cultosaurusErectus.png";
        Image cultosaurusErectusImage = new Image(new File(cultosaurusErectusString).toURI().toString());
        cultosaurusErectusImageView.setImage(cultosaurusErectusImage);
        cultosaurusErectusImageView.setFitHeight(325);
        cultosaurusErectusImageView.setFitWidth(325);
        cultosaurusErectusImageView.setPreserveRatio(true);
        cultosaurusErectusImageView.setSmooth(true);
        cultosaurusErectusImageView.setCache(true);
        Button cultosaurusErectusButton = new Button();
        cultosaurusErectusButton.setGraphic(cultosaurusErectusImageView);
        cultosaurusErectusButton.setOnAction(event -> window.setScene(cultosaurusErectusScene));

        final ImageView fireOfUnknownOriginImageView = new ImageView();
        String fireOfUnknownOriginImageString = "/Users/amanti/Desktop/aSimpleMediaProdject/" +
                "src/sample/media/fireOfUnknownOrigin/fireOfUnknownOrigin.png";
        Image fireOfUnknownOriginImage = new Image(new File(fireOfUnknownOriginImageString).toURI().toString());
        fireOfUnknownOriginImageView.setImage(fireOfUnknownOriginImage);
        fireOfUnknownOriginImageView.setFitHeight(325);
        fireOfUnknownOriginImageView.setFitWidth(325);
        fireOfUnknownOriginImageView.setPreserveRatio(true);
        fireOfUnknownOriginImageView.setSmooth(true);
        fireOfUnknownOriginImageView.setCache(true);
        Button fireOfUnknownOriginButton = new Button();
        fireOfUnknownOriginButton.setGraphic(fireOfUnknownOriginImageView);
        fireOfUnknownOriginButton.setOnAction(event -> window.setScene(fireOfUnknownOriginScene));

        final ImageView theRevolutionByNightImageView = new ImageView();
        String theRevolutionByNightString = "/Users/amanti/Desktop/aSimpleMediaProdject/src/" +
                "sample/media/theRevolutionByNight/theRevolutionByNight.png";
        Image theRevolutionByNightImage = new Image(new File(theRevolutionByNightString).toURI().toString());
        theRevolutionByNightImageView.setImage(theRevolutionByNightImage);
        theRevolutionByNightImageView.setFitHeight(325);
        theRevolutionByNightImageView.setFitWidth(325);
        theRevolutionByNightImageView.setPreserveRatio(true);
        theRevolutionByNightImageView.setSmooth(true);
        theRevolutionByNightImageView.setCache(true);
        Button theRevolutionByNightButton = new Button();
        theRevolutionByNightButton.setGraphic(theRevolutionByNightImageView);
        theRevolutionByNightButton.setOnAction(event -> window.setScene(theRevolutionByNightScene));

        final ImageView clubNinjaImageView = new ImageView();
        String clubNinjaString = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/clubNinja/clubNinja.png";
        Image clubNinjaImage = new Image(new File(clubNinjaString).toURI().toString());
        clubNinjaImageView.setImage(clubNinjaImage);
        clubNinjaImageView.setFitHeight(325);
        clubNinjaImageView.setFitWidth(325);
        clubNinjaImageView.setPreserveRatio(true);
        clubNinjaImageView.setSmooth(true);
        clubNinjaImageView.setCache(true);
        Button clubNinjaButton = new Button();
        clubNinjaButton.setGraphic(clubNinjaImageView);
        clubNinjaButton.setOnAction(event -> window.setScene(clubNinjaScene));

        final ImageView imaginosImageView = new ImageView();
        String imaginosString = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/imaginos/imaginos.png";
        Image imaginosImage = new Image(new File(imaginosString).toURI().toString());
        imaginosImageView.setImage(imaginosImage);
        imaginosImageView.setFitHeight(325);
        imaginosImageView.setFitWidth(325);
        imaginosImageView.setPreserveRatio(true);
        imaginosImageView.setSmooth(true);
        imaginosImageView.setCache(true);
        Button imaginosButton = new Button();
        imaginosButton.setGraphic(imaginosImageView);
        imaginosButton.setOnAction(event -> window.setScene(imaginosScene));

        final ImageView heavenForbidImageView = new ImageView();
        String heavenForbidString = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/" +
                "media/heavenForbid/heavenForbid.png";
        Image heavenForbidImage = new Image(new File(heavenForbidString).toURI().toString());
        heavenForbidImageView.setImage(heavenForbidImage);
        heavenForbidImageView.setFitHeight(325);
        heavenForbidImageView.setFitWidth(325);
        heavenForbidImageView.setPreserveRatio(true);
        heavenForbidImageView.setSmooth(true);
        heavenForbidImageView.setCache(true);
        Button heavenForbidButton = new Button();
        heavenForbidButton.setGraphic(heavenForbidImageView);
        heavenForbidButton.setOnAction(event -> window.setScene(heavenForbidScene));


        final ImageView curseOfTheHiddenMirrorImageView = new ImageView();
        String curseOfTheHiddenMirrorString = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/" +
                "curseOfTheHiddenMirror/curseOfTheHiddenMirror.png";
        Image curseOfTheHiddenMirrorImage = new Image(new File(curseOfTheHiddenMirrorString).toURI().toString());
        curseOfTheHiddenMirrorImageView.setImage(curseOfTheHiddenMirrorImage);
        curseOfTheHiddenMirrorImageView.setFitHeight(325);
        curseOfTheHiddenMirrorImageView.setFitWidth(325);
        curseOfTheHiddenMirrorImageView.setPreserveRatio(true);
        curseOfTheHiddenMirrorImageView.setSmooth(true);
        curseOfTheHiddenMirrorImageView.setCache(true);
        Button curseOfTheHiddenMirrorButton = new Button();
        curseOfTheHiddenMirrorButton.setGraphic(curseOfTheHiddenMirrorImageView);
        curseOfTheHiddenMirrorButton.setOnAction(event -> window.setScene(curseOfTheHiddenMirrorScene));

        GridPane gridPane = new GridPane();
        gridPane.add(blueOysterCultButton,1,1);
        gridPane.add(tyranyAndMutationButton,2,1);
        gridPane.add(secretTreatiesButton,3,1);
        gridPane.add(agentsOfFortuneButton,1,2);
        gridPane.add(spectresButton,2,2);
        gridPane.add(mirrorsButton,3,2);
        gridPane.add(cultosaurusErectusButton,1,3);
        gridPane.add(fireOfUnknownOriginButton,2,3);
        gridPane.add(theRevolutionByNightButton,3,3);
        gridPane.add(clubNinjaButton,1,4);
        gridPane.add(imaginosButton,2,4);
        gridPane.add(heavenForbidButton,3,4);
        gridPane.add(curseOfTheHiddenMirrorButton,2,5);

        primaryStage.setTitle("A Simple Media Player");
        ScrollPane scrollPane = new ScrollPane(gridPane);
        Scene scene = new Scene(scrollPane,1050,720);
        primaryStage.setScene(scene);


        String blueOysterCultMusicFile = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/" +
                "blueOysterCult/thenCameTheLastDaysOfMay.mp3";
        Media blueOysterCultSong = new Media(new File(blueOysterCultMusicFile).toURI().toString());
        MediaPlayer blueOysterCultMediaPlayer = new MediaPlayer(blueOysterCultSong);
        GridPane blueOysterCultGridPane = new GridPane();
        Button blueOysterCultBackButton = new Button("Back");
        Button blueOysterCultPlayButton = new Button("Play");
        Button blueOysterCultStopButton = new Button("Stop");
        blueOysterCultBackButton.setPrefSize(300,166);
        blueOysterCultPlayButton.setPrefSize(300,166);
        blueOysterCultStopButton.setPrefSize(300,166);
        blueOysterCultGridPane.add(blueOysterCultPlayButton,1,1);
        blueOysterCultGridPane.add(blueOysterCultStopButton,1,2);
        blueOysterCultGridPane.add(blueOysterCultBackButton,1,3);
        blueOysterCultPlayButton.setOnAction(actionEvent -> blueOysterCultMediaPlayer.play());
        blueOysterCultStopButton.setOnAction(event -> blueOysterCultMediaPlayer.stop());
        blueOysterCultBackButton.setOnAction(e -> {
            window.setScene(scene);
            blueOysterCultMediaPlayer.stop();
        });
        blueOysterCultScene = new Scene(blueOysterCultGridPane,300,500);

        String tyrannyAndMutationMediaFile = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/" +
                "tyrannyAndMutation/screamingDizBusters.mp3";
        Media tyrannyAndMutationSong = new Media(new File(tyrannyAndMutationMediaFile).toURI().toString());
        MediaPlayer tamMediaPlayer = new MediaPlayer(tyrannyAndMutationSong);
        GridPane tyrannyAndMutationGridPane = new GridPane();
        Button tyrannyAndMutationBackButton = new Button("Back");
        Button tyrannyAndMutationPlayButton = new Button("Play");
        Button tyrannyAndMutationStopButton = new Button("Stop");
        tyrannyAndMutationBackButton.setPrefSize(300,166);
        tyrannyAndMutationPlayButton.setPrefSize(300,166);
        tyrannyAndMutationStopButton.setPrefSize(300,166);
        tyrannyAndMutationGridPane.add(tyrannyAndMutationPlayButton,1,1);
        tyrannyAndMutationGridPane.add(tyrannyAndMutationStopButton,1,2);
        tyrannyAndMutationGridPane.add(tyrannyAndMutationBackButton,1,3);
        tyrannyAndMutationPlayButton.setOnAction(e -> tamMediaPlayer.play());
        tyrannyAndMutationStopButton.setOnAction(e -> tamMediaPlayer.stop());
        tyrannyAndMutationBackButton.setOnAction(e -> {
            window.setScene(scene);
            tamMediaPlayer.stop();
        });
        tyranyAndMutationScene = new Scene(tyrannyAndMutationGridPane,300,500);


        String secretTreatiesMediaFile = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/secretTreaties/" +
                "flamingTelepaths.mp3";
        Media secretTreatiesSong = new Media(new File(secretTreatiesMediaFile).toURI().toString());
        MediaPlayer secretTreatiesMediaPlayer = new MediaPlayer(secretTreatiesSong);
        GridPane secretTreatiesGridpane = new GridPane();
        Button secretTreatiesStopButton = new Button("Stop");
        Button secretTreatiesPlayButton = new Button("Play");
        Button secretTreatiesBackButton = new Button("Back");
        secretTreatiesBackButton.setPrefSize(300,166);
        secretTreatiesPlayButton.setPrefSize(300,166);
        secretTreatiesStopButton.setPrefSize(300,166);
        secretTreatiesGridpane.add(secretTreatiesPlayButton,1,1);
        secretTreatiesGridpane.add(secretTreatiesStopButton,1,2);
        secretTreatiesGridpane.add(secretTreatiesBackButton,1,3);
        secretTreatiesPlayButton.setOnAction(e -> secretTreatiesMediaPlayer.play());
        secretTreatiesStopButton.setOnAction(e -> secretTreatiesMediaPlayer.pause());
        secretTreatiesBackButton.setOnAction(e -> {
            window.setScene(scene);
            secretTreatiesMediaPlayer.stop();
        });
        secretTreatiesScene = new Scene(secretTreatiesGridpane,300,500);

        String agentsOfFortuneMediaFile = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/" +
                "media/agentsOfFortune/theReaper.mp3";
        Media agentsOfFortuneSong = new Media(new File(agentsOfFortuneMediaFile).toURI().toString());
        MediaPlayer agentsOfFortuneMediaPlayer = new MediaPlayer(agentsOfFortuneSong);
        GridPane agentsOfFortuneGridPane = new GridPane();
        Button agentsOfFortuneStopButton = new Button("Stop");
        Button agentsOfFortunePlayButton = new Button("Play");
        Button agentsOfFortuneBackButton = new Button("Back");
        agentsOfFortuneStopButton.setPrefSize(300,166);
        agentsOfFortunePlayButton.setPrefSize(300,166);
        agentsOfFortuneBackButton.setPrefSize(300,166);
        agentsOfFortuneGridPane.add(agentsOfFortunePlayButton,1,1);
        agentsOfFortuneGridPane.add(agentsOfFortuneStopButton,1,2);
        agentsOfFortuneGridPane.add(agentsOfFortuneBackButton,1,3);
        agentsOfFortuneStopButton.setOnAction(event -> agentsOfFortuneMediaPlayer.pause());
        agentsOfFortunePlayButton.setOnAction(event -> agentsOfFortuneMediaPlayer.play());
        agentsOfFortuneBackButton.setOnAction(event -> {
            window.setScene(scene);
            agentsOfFortuneMediaPlayer.stop();
        });
        agentsOfFortuneScene = new Scene(agentsOfFortuneGridPane,300,500);


        String spectresMediaFile = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/" +
                "spectres/iLoveTheNight.mp3";
        Media spectresSong = new Media(new File(spectresMediaFile).toURI().toString());
        MediaPlayer spectresMediaPlayer = new MediaPlayer(spectresSong);
        GridPane spectresGridPane = new GridPane();
        Button spectresBackButton = new Button("Back");
        Button spectresPlayButton = new Button("Play");
        Button spectresStopButton = new Button("Stop");
        spectresBackButton.setPrefSize(300,166);
        spectresPlayButton.setPrefSize(300,166);
        spectresStopButton.setPrefSize(300,166);
        spectresGridPane.add(spectresPlayButton,1,1);
        spectresGridPane.add(spectresStopButton,1,2);
        spectresGridPane.add(spectresBackButton,1,3);
        spectresPlayButton.setOnAction(event -> spectresMediaPlayer.play());
        spectresStopButton.setOnAction(event -> spectresMediaPlayer.pause());
        spectresBackButton.setOnAction(event -> {
            window.setScene(scene);
            spectresMediaPlayer.stop();
        });
        spectresScene = new Scene(spectresGridPane,300,500);

        String mirrorsMediaFile = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/mirrors/moonCrazy.mp3";
        Media mirrorsSong = new Media(new File(mirrorsMediaFile).toURI().toString());
        MediaPlayer mirrorsMediaPlayer = new MediaPlayer(mirrorsSong);
        GridPane mirrorsGridPane = new GridPane();
        Button mirrorsBackButton = new Button("Back");
        Button mirrorsPlayButton = new Button("Play");
        Button mirrorsStopButton = new Button("Stop");
        mirrorsBackButton.setPrefSize(300,166);
        mirrorsPlayButton.setPrefSize(300,166);
        mirrorsStopButton.setPrefSize(300,166);
        mirrorsGridPane.add(mirrorsPlayButton,1,1);
        mirrorsGridPane.add(mirrorsStopButton,1,2);
        mirrorsGridPane.add(mirrorsBackButton,1,3);
        mirrorsPlayButton.setOnAction(event -> mirrorsMediaPlayer.play());
        mirrorsStopButton.setOnAction(event -> mirrorsMediaPlayer.stop());
        mirrorsBackButton.setOnAction(event -> {
            window.setScene(scene);
            mirrorsMediaPlayer.stop();
        });
        mirrorsScene = new Scene(mirrorsGridPane,300,500);

        String cultosaurusErectusMediaFile = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/" +
                "media/cultosaurusErectus/monsters.mp3";
        Media cultosaurusErectusSong = new Media(new File(cultosaurusErectusMediaFile).toURI().toString());
        MediaPlayer cultosaurusErectusMediaPlayer = new MediaPlayer(cultosaurusErectusSong);
        GridPane cultosaurusGridPane = new GridPane();
        Button cultosaurusBackButton = new Button("Back");
        Button cultosaurusPlayButton = new Button("Play");
        Button cultosaurusStopButton = new Button("stop");
        cultosaurusBackButton.setPrefSize(300,166);
        cultosaurusPlayButton.setPrefSize(300,166);
        cultosaurusStopButton.setPrefSize(300,166);
        cultosaurusGridPane.add(cultosaurusPlayButton,1,1);
        cultosaurusGridPane.add(cultosaurusStopButton,1,2);
        cultosaurusGridPane.add(cultosaurusBackButton,1,3);
        cultosaurusPlayButton.setOnAction(event -> cultosaurusErectusMediaPlayer.play());
        cultosaurusStopButton.setOnAction(event -> cultosaurusErectusMediaPlayer.stop());
        cultosaurusBackButton.setOnAction(event -> {
            window.setScene(scene);
            cultosaurusErectusMediaPlayer.stop();
        });
        cultosaurusErectusScene = new Scene(cultosaurusGridPane,300,500);

        String fireOfUnknownOriginMediaFile = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/" +
                "fireOfUnknownOrigin/burnin'ForYou.mp3";
        Media fireOfUnknownOriginSong = new Media(new File(fireOfUnknownOriginMediaFile).toURI().toString());
        MediaPlayer fireOfUnknownOriginMediaPlayer = new MediaPlayer(fireOfUnknownOriginSong);
        GridPane fireOfUnknownOriginGridPane = new GridPane();
        Button fireOfUnknownOriginPlayButton = new Button("Play");
        Button fireOfUnknownOriginStopButton = new Button("Stop");
        Button fireOfUnknownOriginBackButton = new Button("Back");
        fireOfUnknownOriginBackButton.setPrefSize(300,166);
        fireOfUnknownOriginPlayButton.setPrefSize(300,166);
        fireOfUnknownOriginStopButton.setPrefSize(300,166);
        fireOfUnknownOriginGridPane.add(fireOfUnknownOriginPlayButton,1,1);
        fireOfUnknownOriginGridPane.add(fireOfUnknownOriginStopButton,1,2);
        fireOfUnknownOriginGridPane.add(fireOfUnknownOriginBackButton,1,3);
        fireOfUnknownOriginPlayButton.setOnAction(event -> fireOfUnknownOriginMediaPlayer.play());
        fireOfUnknownOriginStopButton.setOnAction(event -> fireOfUnknownOriginMediaPlayer.stop());
        fireOfUnknownOriginBackButton.setOnAction(event -> {
            window.setScene(scene);
            fireOfUnknownOriginMediaPlayer.stop();
        });
        fireOfUnknownOriginScene = new Scene(fireOfUnknownOriginGridPane,300,500);

        String theRevolutionByNightMediaFile = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/" +
                "theRevolutionByNight/takeMeAway.mp3";
        Media theRevolutionByNightSong = new Media(new File(theRevolutionByNightMediaFile).toURI().toString());
        MediaPlayer theRevolutionByNightMediaPlayer = new MediaPlayer(theRevolutionByNightSong);
        GridPane theRevolutionByNightGridPane = new GridPane();
        Button theRevolutionByNightBackButton = new Button("Back");
        Button theRevolutionByNightPlayButton = new Button("Play");
        Button theRevolutionByNightStopButton = new Button("Stop");
        theRevolutionByNightBackButton.setPrefSize(300,166);
        theRevolutionByNightPlayButton.setPrefSize(300,166);
        theRevolutionByNightStopButton.setPrefSize(300,166);
        theRevolutionByNightGridPane.add(theRevolutionByNightPlayButton,1,1);
        theRevolutionByNightGridPane.add(theRevolutionByNightStopButton,1,2);
        theRevolutionByNightGridPane.add(theRevolutionByNightBackButton,1,3);
        theRevolutionByNightPlayButton.setOnAction(event -> theRevolutionByNightMediaPlayer.play());
        theRevolutionByNightStopButton.setOnAction(event -> theRevolutionByNightMediaPlayer.stop());
        theRevolutionByNightBackButton.setOnAction(event -> {
            window.setScene(scene);
            theRevolutionByNightMediaPlayer.stop();
        });
        theRevolutionByNightScene = new Scene(theRevolutionByNightGridPane,300,500);

        String clubNinjaMediaFile = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/clubNinja/" +
                "dancin'InTheRuins.mp3";
        Media clubNinjaSong = new Media(new File(clubNinjaMediaFile).toURI().toString());
        MediaPlayer clubNinjaMediaPlayer = new MediaPlayer(clubNinjaSong);
        GridPane clubNinjaGridPane = new GridPane();
        Button clubNinjaBackButton = new Button("Back");
        Button clubNinjaPlayButton = new Button("Play");
        Button clubNinjaStopButton = new Button("Stop");
        clubNinjaBackButton.setPrefSize(300,166);
        clubNinjaStopButton.setPrefSize(300,166);
        clubNinjaPlayButton.setPrefSize(300,166);
        clubNinjaGridPane.add(clubNinjaPlayButton,1,1);
        clubNinjaGridPane.add(clubNinjaStopButton,1,2);
        clubNinjaGridPane.add(clubNinjaBackButton,1,3);
        clubNinjaPlayButton.setOnAction(event -> clubNinjaMediaPlayer.play());
        clubNinjaStopButton.setOnAction(event -> clubNinjaMediaPlayer.stop());
        clubNinjaBackButton.setOnAction(event -> {
            window.setScene(scene);
            clubNinjaMediaPlayer.stop();
        });
        clubNinjaScene = new Scene(clubNinjaGridPane,300,500);


        String imaginosMediaFile = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/imaginos/" +
                "inThePresenceOfAnotherWorld.mp3";
        Media imaginosSong = new Media(new File(imaginosMediaFile).toURI().toString());
        MediaPlayer imaginosMediaPlayer = new MediaPlayer(imaginosSong);
        GridPane imaginosGridPane = new GridPane();
        Button imaginosStopButton = new Button("Stop");
        Button imaginosBackButton = new Button("Back");
        Button imaginosPlayButton = new Button("Play");
        imaginosBackButton.setPrefSize(300,166);
        imaginosPlayButton.setPrefSize(300,166);
        imaginosStopButton.setPrefSize(300,166);
        imaginosGridPane.add(imaginosPlayButton,1,1);
        imaginosGridPane.add(imaginosStopButton, 1 ,2);
        imaginosGridPane.add(imaginosBackButton,1,3);
        imaginosPlayButton.setOnAction(event -> imaginosMediaPlayer.play());
        imaginosStopButton.setOnAction(event -> imaginosMediaPlayer.stop());
        imaginosBackButton.setOnAction(event -> {
            window.setScene(scene);
            imaginosMediaPlayer.stop();
        });
        imaginosScene = new Scene(imaginosGridPane,300,500);

        String heavenForbidMediaFile = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/heavenForbid/" +
                "harvestMoon.mp3";
        Media heavenForbidSong = new Media(new File(heavenForbidMediaFile).toURI().toString());
        MediaPlayer heavenForbidMediaPlayer = new MediaPlayer(heavenForbidSong);
        GridPane heavenForbidGridPane = new GridPane();
        Button heavenForbidStopButton = new Button("Stop");
        Button heavenForbidPlayButton = new Button("Play");
        Button heavenForbidBackButton = new Button("Back");
        heavenForbidBackButton.setPrefSize(300,166);
        heavenForbidStopButton.setPrefSize(300,166);
        heavenForbidPlayButton.setPrefSize(300,166);
        heavenForbidGridPane.add(heavenForbidPlayButton,1,1);
        heavenForbidGridPane.add(heavenForbidStopButton,1,2);
        heavenForbidGridPane.add(heavenForbidBackButton,1,3);
        heavenForbidPlayButton.setOnAction(event -> heavenForbidMediaPlayer.play());
        heavenForbidStopButton.setOnAction(event -> heavenForbidMediaPlayer.stop());
        heavenForbidBackButton.setOnAction(event -> {
            window.setScene(scene);
            heavenForbidMediaPlayer.stop();
        });
        heavenForbidScene = new Scene(heavenForbidGridPane,300,500);

        String curseOfTheHiddenMirrorMediaFile = "/Users/amanti/Desktop/aSimpleMediaProdject/src/sample/media/" +
                "curseOfTheHiddenMirror/outOfTheDarkness.mp3";
        Media curseOfTheHiddenMirrorSong = new Media(new File(curseOfTheHiddenMirrorMediaFile).toURI().toString());
        MediaPlayer curseOfTheHiddenMirrorMediaPlayer = new MediaPlayer(curseOfTheHiddenMirrorSong);
        GridPane curseOfTheHiddenMirrorGridPane = new GridPane();
        Button curseOfTheHiddenMirrorStopButton = new Button("Stop");
        Button curseOfTheHiddenMirrorPlayButton = new Button("Play");
        Button curseOfTheHiddenMirrorBackButton = new Button("Back");
        curseOfTheHiddenMirrorBackButton.setPrefSize(300,166);
        curseOfTheHiddenMirrorPlayButton.setPrefSize(300,166);
        curseOfTheHiddenMirrorStopButton.setPrefSize(300,166);
        curseOfTheHiddenMirrorGridPane.add(curseOfTheHiddenMirrorPlayButton,1,1);
        curseOfTheHiddenMirrorGridPane.add(curseOfTheHiddenMirrorStopButton,1,2);
        curseOfTheHiddenMirrorGridPane.add(curseOfTheHiddenMirrorBackButton,1,3);
        curseOfTheHiddenMirrorPlayButton.setOnAction(event -> curseOfTheHiddenMirrorMediaPlayer.play());
        curseOfTheHiddenMirrorStopButton.setOnAction(event -> curseOfTheHiddenMirrorMediaPlayer.stop());
        curseOfTheHiddenMirrorBackButton.setOnAction(e -> {
            window.setScene(scene);
            curseOfTheHiddenMirrorMediaPlayer.stop();
        });
        curseOfTheHiddenMirrorScene = new Scene(curseOfTheHiddenMirrorGridPane,300,500);

        primaryStage.show();
    }


}

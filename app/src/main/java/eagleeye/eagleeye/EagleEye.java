package eagleeye.eagleeye;

import android.media.Image;

/**
 * Created by Mike R on 10/6/2015.
 */

//This is a test
public class EagleEye {

    private String buildingName;
    private Image pic;
    private TakePicture screen1;
    private FoundBuilding screen2;
    private NoMatch screen3;

    public void main(String[] args){

        screen1.setVisible(true);
        screen2.setVisible(false);
        screen3.setVisible(false);

    }

    public boolean isMatch(){
        return false;
    }

    public void openFoundBuildingOnMatch(String buildingName){

    }

    public void openNoMatchOnNoMatch(){

    }

    public void openTakePictureOnStart(){

    }

    public String retrieveNextReferencePictureAndName(){
        return "";
    }

    public void sendPicturesToBlackBox(Image pic){

    }
}

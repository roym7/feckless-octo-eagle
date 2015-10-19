package eagleeye.eagleeye;

import android.media.Image;

/**
 * Created by Mike R on 10/6/2015.
 * Edited by Robert W on mulitiple dates.
 */

import android.net.Uri;

//This is a test
public class EagleEye {

    private TakePicture screen1;
    private FoundBuilding screen2;
    private NoMatch screen3;

    public void main(String[] args){

        screen1.setVisible(true);
        screen2.setVisible(false);
        screen3.setVisible(false);

    }

    public void isMatch(boolean match, String buildingName, Uri buildingPicture){
    
    	if (match=true){
    		
    		Bundle matchInformation = new Bundle();    		
    		Intent startFoundBuilding = new Intent();
    		
    		matchInformation.putString(buildingName, buildingName);
    		startFoundBuilding.setData(buildingPicture);
    		
    		startActivityForResult(startFoundBuilding, 0);
    		
    	} else {
    		
    	}
    		
    	
    	
    }

    public void openFoundBuildingOnMatch(String buildingName){

    }

    public void openNoMatchOnNoMatch(){

    }

    public String retrieveNextReferencePictureAndName(){
        return "";
    }

    public void sendPicturesToBlackBox(Uri buildingPicture){
    	
    	Uri comparisonPicture = new Uri();
    			
    	thirdPartySoftware.beginComparisonMethod(buildingPicture, comparisonPicture);

    }
}

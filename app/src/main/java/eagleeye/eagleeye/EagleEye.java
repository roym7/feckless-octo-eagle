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

    public void isMatch(boolean match, String buildingName, Uri buildingPicture){
    
    	if (match=true){
    		
    		Bundle matchInformation = new Bundle();    		
    		Intent startFoundBuilding = new Intent(this, FoundBuilding.class);
    		
    		matchInformation.putString(buildingName, buildingName);
    		startFoundBuilding.putExtras(matchInformation);
    		startFoundBuilding.setData(buildingPicture);
    		
    		startActivityForResult(startFoundBuilding, 0);
    		
    	} else {
    		
    		Bundle noMatchInformation = new Bundle();    		
    		Intent startNoMatch = new Intent(this, NoMatch.class);
    		
    		startNoMatch.setData(buildingPicture);
    		
    		startActivityForResult(startNoMatch, 0);
    		    		
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

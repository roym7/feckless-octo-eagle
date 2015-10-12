package eagleeye.eagleeye;

import android.media.Image;

/**
 * Created by Mike R on 10/6/2015.
 */
public class INode {

    private Image image;
    private String name;
    private INode next;

    public void INode(String n, Image i){
        name = n;
        image = i;
    }

    public void setNext(INode a){
        next = a;
    }

    public Image getImage(){
        return this.image;
    }

    public String getName(){
        return this.name;
    }

    public INode getNext(){
        return this.next;
    }
}
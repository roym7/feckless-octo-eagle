package eagleeye.eagleeye;

/**
 * Created by Mike R on 10/6/2015.
 * Edited by James Combs on 10/7/2015
 */
public class ReferenceImageDatabase {

    //Class attributes
    //INode root: First INode in the queue
    public INode root;
    //INode last: Last INode in the queue
    public INode last;

    //Simple constructor for the Linked List
    //Creates a Linked List with a single INode
    //@@Arg INode r: First INode of the Linked List
    public void RefrenceImageDatabase(INode r){
        //Sets root to r
        root = r;
        //Sets last to r
        //r is currently only node in Linked List
        last = r;
    }

    //Adds an INode to the end of the Linked List
    //@@Arg INode n: INode to be added
    public void addINode(INode n){
        //Links the current end of the list to n
        last.setNext(n);
        //Sets the end of the list to n
        last = n;
    }

    public void passImage(INode p){
        //NEED BLACK BOX TO COMPLETE METHOD
        //passImageToBlackBox(p.getImage);
    }

    public void passDatabase(INode r){
        //NEED TO COMPLETE passImage(INode p) TO
        //COMPLETE METHOD
        if(r.getNext() != null){
            passDatabase(r.getNext());
        }
        passImage(r);
    }
    public void removeNextImage(){

    }
}

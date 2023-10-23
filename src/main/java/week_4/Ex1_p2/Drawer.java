package week_4.Ex1_p2;

import java.util.ArrayList;
import java.util.List;

public class Drawer {
  // private Sock firstsock = null;
  // private Sock secondsock = null;
  // private Sock thirdsock = null;

  // private int numberOfSocks = 0;

  //instead of using individual variables i created a arraylist
  private List<Sock> socks;

  public Drawer() {
    //creates the arrayList to set the individual socks
    this.socks = new ArrayList<>();

  }

  public Sock getSock(int sockNo) {
    /* if (sockno == 1) return firstsock;
    if (sockno == 2) return secondsock;	  	  	  	       		   	      	
    if (sockno == 3) return thirdsock;	  	  	  	       		   	      	
    // otherwise	  	  	  	       		   	      	
    return null;
    */

    // instead of using this we can just access
    // the arraylist to find the sock

    if (sockNo >= 1 && sockNo <= socks.size()) {
      return socks.get(sockNo - 1);

    }
    return null;


  }

  public void addSock(Sock newsock) {
    /* numberOfSocks++;
    if (numberOfSocks == 1) this.firstsock = newsock;	  	  	  	       		   	      	
    if (numberOfSocks == 2) this.secondsock = newsock;	  	  	  	       		   	      	
    if (numberOfSocks == 3) this.thirdsock = newsock;
    */
    // adds sock to the Array

    socks.add(newsock);


  }

  public boolean hasPair() {
    /*if (firstsock.isPair(secondsock)
     || firstsock.isPair(thirdsock)	  	  	  	       		   	      	
     || secondsock.isPair(firstsock)	  	  	  	       		   	      	
     || secondsock.isPair(thirdsock))	  	  	  	       		   	      	
    {	  	  	  	       		   	      	
      return true;	  	  	  	       		   	      	
    }	  	  	  	       		   	      	
    else	  	  	  	       		   	      	
    {	  	  	  	       		   	      	
      return false;	  	  	  	       		   	      	
    }
    */

    // created a nested loop where
    // one loop goes through the first sock
    // and the other through the second pair
    // this makes it so everytime the loop is completed
    // two socks will combine to create a single pair of socks
    // using the sock class we can pull the method isPair
    for (int i = 0; i < socks.size(); i++) {
      for (int j = i + 1; j < socks.size(); j++) {
        if (socks.get(i).isPair(socks.get(j))) {
          return true;
        }
      }


    }
    return false;

  }
}


package week_4.Ex1_p2;
public class Drawer
{	  	  	  	       		   	      	
  private Sock firstsock = null;	  	  	  	       		   	      	
  private Sock secondsock = null;	  	  	  	       		   	      	
  private Sock thirdsock = null;	  	  	  	       		   	      	
	  	  	  	       		   	      	
  private int numberOfSocks = 0;	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public Sock getSock(int sockno)	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    if (sockno == 1) return firstsock;	  	  	  	       		   	      	
    if (sockno == 2) return secondsock;	  	  	  	       		   	      	
    if (sockno == 3) return thirdsock;	  	  	  	       		   	      	
    // otherwise	  	  	  	       		   	      	
    return null;	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public void addSock(Sock newsock)	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    numberOfSocks++;	  	  	  	       		   	      	
    if (numberOfSocks == 1) this.firstsock = newsock;	  	  	  	       		   	      	
    if (numberOfSocks == 2) this.secondsock = newsock;	  	  	  	       		   	      	
    if (numberOfSocks == 3) this.thirdsock = newsock;	  	  	  	       		   	      	
  }	  	  	  	       		   	      	
	  	  	  	       		   	      	
  public boolean hasPair()	  	  	  	       		   	      	
  {	  	  	  	       		   	      	
    if (firstsock.isPair(secondsock)	  	  	  	       		   	      	
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
  }	  	  	  	       		   	      	
}
package C_zentrix_Services.C_zentrix_Services;
import java.io.*;
import java.net.*;

public class server577 
{
	  Socket sock;
	  String server = "192.168.1.57";
	  int port = 22;
	 // String filename = "/foo/bar/application1.log";
	  String command = "tail -f /var/log/mysqllog.log |grep 'insert into campaign'";
	  
	  public static void main(String[] args)
	  {
	    new server577();
	  }
	  
	  public server577()
	  {
	    openSocket();
	    try 
	    {
	      // write to socket
	      BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
	      wr.write(command);
	      wr.flush();
	      
	      // read from socket
	      BufferedReader rd = new BufferedReader(new InputStreamReader(sock.getInputStream()));
	      String str;
	      while ((str = rd.readLine()) != null)
	      {
	        System.out.println(str);
	      }
	      rd.close();
	    } 
	    catch (IOException e) 
	    {
	      System.err.println(e);
	    }
	  }
	  
	  private void openSocket()
	  {
	    // open a socket and connect with a timeout limit
	    try
	    {
	      InetAddress addr = InetAddress.getByName(server);
	      SocketAddress sockaddr = new InetSocketAddress(addr, port);
	      sock = new Socket();
	  
	      // this method will block for the defined number of milliseconds
	      int timeout = 2000;
	      sock.connect(sockaddr, timeout);
	    } 
	    catch (UnknownHostException e) 
	    {
	      e.printStackTrace();
	    }
	    catch (SocketTimeoutException e) 
	    {
	      e.printStackTrace();
	    }
	    catch (IOException e) 
	    {
	      e.printStackTrace();
	    }
	  }
	

}

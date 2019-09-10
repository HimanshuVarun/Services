package C_zentrix_Services.C_zentrix_Services;
import java.io.InputStream;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class Method3 
{
public static int j=0;
static String s1,s2,s3,se1,se2,se3,se4,se5,se6,se7;
	public static void methodTest()
	{
	   
	     //System.out.println("hbhbjbjb");
        String host="192.168.1.57";
        String user="root";
        String password="latest57";
        String command1="ps -ef |grep zentrix";
       // String TIME;
       // String CMD;
       // String[] SERVER_STATUS = new String[]{command1, "systemctl is-active czentrix.service"};
        try{

        	  // initialize the string
            se1="cz_dialer_data.pl";
            se2 = "channel_health.pl";
            se3 = "dialer_manager_listen.pl";
            se4 = "erp_manager.pl";
            se5= "dialer_reporter.pl";
            se6= "czentrix_dialer.pl";
            se7 = "ftp-client.pl";
            
//command1.substring(TIME, CMD);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();
            Session session=jsch.getSession(user, host, 22);
            session.setPassword(password);
            session.setConfig(config);
            session.connect();
            System.out.println("Connected");

            Channel channel=session.openChannel("exec");
            ((ChannelExec)channel).setCommand(command1);
            channel.setInputStream(null);
            ((ChannelExec)channel).setErrStream(System.err);

            InputStream in=channel.getInputStream();
            channel.connect();
            byte[] tmp=new byte[1024];
            while(true){
              while(in.available()>0){
                int i=in.read(tmp, 0, 1024);
                if(i<0)break;
                System.out.print(new String(tmp, 0, i));
                s1=new String(tmp,0,i);//initialize the string from server string

              }

              System.out.println(channel.toString());
               //System.out.println("---- End OF Line ----");

if(channel.isClosed()){
                System.out.println("exit-status:"+channel.getExitStatus());
                break;
              }
              try{Thread.sleep(1000);}catch(Exception ee){}
            }
            channel.disconnect();
            session.disconnect();
            System.out.println("DONE");
        }catch(Exception e){
            e.printStackTrace();
        }
	}

}

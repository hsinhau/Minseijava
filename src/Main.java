import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

  public static void main(String[] args) throws Exception {

	  SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
	  String MyYesterday = sdf1.format(yesterday());

	  Authenticator.setDefault(new MyAuthenticator());

	 String createCSV = "bin/get_vc69_csv.sh?Ymd=" + MyYesterday;
	 String getCSV = "bin/csv_download.sh?csv_file="+ MyYesterday + ".csv";
    URL url = new URL("http://111.68.19.220/M2C2M/MIN/001/" + createCSV);
    URL url2 = new URL("http://111.68.19.220/M2C2M/MIN/001/" + getCSV);
    url.openStream();

    BufferedReader in = new BufferedReader(new InputStreamReader(url2.openStream()));

    in.close();
  }
//

  private static Date yesterday() {
	    final Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -1);
	    return cal.getTime();
	}
}

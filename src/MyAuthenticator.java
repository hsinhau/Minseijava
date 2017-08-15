import java.net.Authenticator;
import java.net.PasswordAuthentication;

class MyAuthenticator extends Authenticator {

  protected PasswordAuthentication getPasswordAuthentication() {

    String username = "minseiks";
    String password = "minseiks";
    return new PasswordAuthentication(username, password.toCharArray());
  }
}
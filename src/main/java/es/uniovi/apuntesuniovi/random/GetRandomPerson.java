package es.uniovi.apuntesuniovi.random;

import es.uniovi.apuntesuniovi.random.model.Person;
import es.uniovi.apuntesuniovi.random.model.RandomPersonList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetRandomPerson {

  public static Person getPerson() {
    try {
      URL url = new URL("https://randomuser.me/api");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");
      BufferedReader in = new BufferedReader(
          new InputStreamReader(con.getInputStream()));
      String inputLine;
      StringBuilder content = new StringBuilder();
      while ((inputLine = in.readLine()) != null) {
        content.append(inputLine);
      }
      RandomPersonList randomPersonList = Converter.fromJsonString(content.toString());
      in.close();
      con.disconnect();
      return randomPersonList.getResults().get(0);
    } catch (MalformedURLException e) {
      throw new IllegalArgumentException(e.getMessage());
    } catch (IOException e) {
      throw new IllegalArgumentException(e.getMessage());
    } catch (NullPointerException e) {
      throw new IllegalArgumentException(e.getMessage());
    }
  }
}

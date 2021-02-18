package es.uniovi.apuntesuniovi.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class GetFilesInternet {
  private static final String folderName = "testFiles";

  public static void getFile(String url, String fileName) {
    createFolder();
    try (BufferedInputStream inputStream = new BufferedInputStream(
        new URL(url).openStream());
         FileOutputStream fileOS = new FileOutputStream(getFolderFileUrl(fileName))) {
      byte[] data = new byte[1024];
      int byteContent;
      while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
        fileOS.write(data, 0, byteContent);
      }
    } catch (IOException e) {
      System.err.println("Error al descargar el fichero " + fileName);
    }
  }

  private static void createFolder() {
    File file = new File(folderName);
    if (file.exists()) {
      return;
    }
    if (file.mkdir()) {
      System.out.println("Carpeta " + folderName + " creada correctamente");
    }
  }

  public static String getFolderFileUrl(String fileName) {
    return new File(folderName + "/" + fileName).getAbsolutePath();
  }

  public static boolean delete(String url) {
    return new File(url).delete();
  }
}

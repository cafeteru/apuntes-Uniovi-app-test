package es.uniovi.apuntesuniovi.tests.users.create;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import es.uniovi.apuntesuniovi.util.GetFilesInternet;
import io.cucumber.java.en.When;

public class ImageWithinLimits extends AbstractTest {
    @When("add a valid image")
    public void add_a_valid_image() {
        String fileName = "photo.jpg";
        String url = "https://i.ytimg.com/vi/8PvyIAEfPgE/maxresdefault.jpg";
        GetFilesInternet.getFile(url, fileName);
        testUtil.selectFile("img", GetFilesInternet.getFolderFileUrl(fileName));
    }
}

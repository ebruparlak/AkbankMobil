public class mobil {

    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;

    public  static void main (String[] args){
        openAkbank();

    }
    public static void main openAkbank{

        DesiredCapabilities mobil = new DesiredCapabilities();

        mobil.setCapability("deviceName", "SM-A107F/DS");
        mobil.setCapability("udid", "R9WN1073M3J");
        mobil.setCapability(" platformName", "Android");
        mobil.setCapability("platformVersion", "11");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),mobil);
        wait = new WebDriverWait(driver, 10);




    }
}

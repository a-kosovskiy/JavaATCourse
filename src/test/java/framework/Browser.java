package framework;

import org.openqa.selenium.WebDriver;

public class Browser {
    private static Browser browser;
    private static WebDriver webDriver;
    private BrowserFactory browserFactory = new BrowserFactory();

    public Browser() {
        webDriver = browserFactory.getWebDriver("chrome");
    }

    public static Browser getInstance() {
        if (browser == null) {
            browser = new Browser();
        }
        return browser;
    };

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void open(String url) {
        webDriver.get(url);
    }

    public static void quit() {
        Browser.getInstance().getWebDriver().quit();
    }
}

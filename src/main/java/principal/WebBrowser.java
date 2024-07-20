package principal;

public interface WebBrowser {
    void openURL(String url);
    void refresh();
    void goBack();
    void goForward();
    void bookmarkPage();
}

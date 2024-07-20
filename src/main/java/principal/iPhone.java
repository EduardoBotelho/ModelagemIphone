package principal;

public class iPhone implements MusicPlayer, Telephone, WebBrowser {

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music...");
    }

    @Override
    public void nextTrack() {
        System.out.println("Skipping to next track...");
    }

    @Override
    public void previousTrack() {
        System.out.println("Going back to previous track...");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }

    @Override
    public void endCall() {
        System.out.println("Ending call...");
    }

    @Override
    public void answerCall() {
        System.out.println("Answering call...");
    }

    @Override
    public void holdCall() {
        System.out.println("Holding call...");
    }

    @Override
    public void openURL(String url) {
        System.out.println("Opening URL: " + url);
    }

    @Override
    public void refresh() {
        System.out.println("Refreshing page...");
    }

    @Override
    public void goBack() {
        System.out.println("Going back to previous page...");
    }

    @Override
    public void goForward() {
        System.out.println("Going forward to next page...");
    }

    @Override
    public void bookmarkPage() {
        System.out.println("Bookmarking current page...");
    }
}


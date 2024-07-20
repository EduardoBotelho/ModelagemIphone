package principal;

public class Main {
    public static void main(String[] args) {

        iPhone myiPhone = new iPhone();

        // Testando MusicPlayer
        myiPhone.play();
        myiPhone.nextTrack();
        myiPhone.stop();

        // Testando Telephone
        myiPhone.makeCall("123-456-7890");
        myiPhone.answerCall();
        myiPhone.endCall();

        // Testando InternetBrowser
        myiPhone.openURL("https://www.uol.com.br");
        myiPhone.refresh();
        myiPhone.bookmarkPage();

    }
}

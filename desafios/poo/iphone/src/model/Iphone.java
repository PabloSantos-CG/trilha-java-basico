package model;
public class Iphone implements InternetBrowser, MusicPlayer, Telephone {
    
    public void executeTest(String number, String music, String url) {
        //Telephone
        makeCall(number);
        answerCall();
        startVoiceMail();

        //Music Player
        playMusic();
        stopMusic();
        selectMusic(music);

        //Internet Browser
        displayPage(url);
        addNewTab();
        refreshPage();
    }

    //Telephone
    public void makeCall(String number) {
        System.out.println("Fazendo uma ligação para: " + number);
    }

    public void answerCall() {
        System.out.println("Recebendo uma ligação...");
    }

    public void startVoiceMail() {
        System.out.println("Você possui uma nova mensagem.");
    }

    //Music Player
    public void playMusic() {
        System.out.println("Reproduzindo música");
    }
    
    public void stopMusic() {
        System.out.println("Música parada");
    }

    public void selectMusic(String musica) {
        System.out.println("Tocando a música: " + musica);
    }

    //Internet Browser
    public void displayPage(String url) {
        System.out.println("Acessando https://" + url);
    }

    public void addNewTab() {
        System.out.println("Abrindo nova guia");
    }

    public void refreshPage() {
        System.out.println("Recarregando página");
    }
    
}

class phone {
    void call(){};
    void sms(){};
}

interface camera{
    void click();
    void record();
}

interface musicPlayer{
    void play();
    void pause();
    void stop();
}

class smarterphone extends phone implements camera,musicPlayer{
    void videoCall(){
        System.out.println("Video call is being made");
    }

    @Override
    public void click() {
        System.out.println("Photo has been clicked");
    }

    @Override
    public void record() {
        System.out.println("Video has been recorded");
    }

    @Override
    public void pause() {
        System.out.println("Music is paused");
    }

    @Override
    public void play() {
        System.out.println("music has started playing");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopped playing");
    }
}

public class smartPhone {
    static void main(String[] args) {
        smarterphone s = new smarterphone();
        phone p = s;
        camera c =s;
        musicPlayer m =s;
        c.click();

    }

}

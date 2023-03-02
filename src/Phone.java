
public class Phone {

    public void call(){
        System.out.println("Calling to...");
    }

    public void sms(){
        System.out.println("Messaging to...");
    }
}

interface camera{
    abstract void click();
    abstract void record();
}

interface MusicPlayer{
    abstract void play();
    abstract void stop();
}

 class smartPhone extends Phone implements camera, MusicPlayer{

    public void click(){
        System.out.println("Clicking the record button...");
    }

    public void record(){
        System.out.println("Recording is on...");
    }

    public void play(){
        System.out.println("MusicPlayer is on...");
    }

    public void stop(){
        System.out.println("Stoping the MusicPlayer...");
    }

    public static void main(String args[]){

        smartPhone sP1 = new smartPhone();

        sP1.call();
        sP1.sms();
        sP1.click();
        sP1.record();
        sP1.play();
        sP1.stop();

    }
}


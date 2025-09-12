package ch08.sec04;

public class Audio implements RemoteControl {
    /// 필드
    private int volume;

    /// turnOn() 추상 메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("오디오를 킵니다.");
    }


    /// turnOff() 추상 메소드 오버라이딩
    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }


    /// setVolume() 추상 메소드 오버라이딩
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        if (this.volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if (this.volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }


}

package me.esavojt.parkour;

public class ParkourState {
    public boolean isPlaying;
    public int currentCheckpoint;
    public ParkourState(boolean playing, int checkpoint){
        this.isPlaying = playing;
        this.currentCheckpoint = checkpoint;
    }
}

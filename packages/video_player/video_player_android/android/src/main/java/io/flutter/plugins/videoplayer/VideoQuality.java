package io.flutter.plugins.videoplayer;

public class VideoQuality {
    public int bitrate;
    public int width;
    public int height;
    public boolean selected;
    
    public VideoQuality(int bitrate, int width, int height){
        this.bitrate = bitrate;
        this.width = width;
        this.height = height;
        this.selected = false;
    }
    public boolean isSelected(){
        return selected;
    }
    public void setSelected(boolean selected){
        this.selected = selected ;
    }
    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getBitrate(){
        return bitrate;
    }
    @Override
    public String toString() {
        return "VideoQuality [bitrate=" + bitrate + ", width=" + width + ", height=" + height + ", selected=" + selected + "]";
    }

    
}

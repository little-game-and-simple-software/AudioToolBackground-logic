import java.util.ArrayList;

public class AudioTrack 
{
    public ArrayList<AudioClip> clips;
    public ArrayList<Int> clips_start;
    public boolean mute;
    public boolean solo;
    //添加剪辑片段到轨道
    public boolean add_clip(AudioClip clip)
    {
        return true;
    }
    //删除音频片段
    public boolean remove_clips(int idx)
    {
        clips.remove(idx);
    }
    public void set_mute(boolean bool)
    {
        this.mute = bool;
    }
    public void set_solo(boolean bool)
    {
        if(bool)
        {
            this.mute = false;
            this.solo = so;
        }
    }
}

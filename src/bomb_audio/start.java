package bomb_audio;

import java.io.File;

public class start extends Audio {
	File file = new File( Audio.class.getResource("/bomb_audio/audio_file/START.wav").getFile() );
	public start() {
		try {
			super.loading_file(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void play(boolean loop) {
		clip.setFramePosition(0);
		if( loop) {		
			clip.loop(clip.LOOP_CONTINUOUSLY);
		}
		else clip.loop(0);
	}
	public boolean isPlaying() {
		if( clip.isActive()) System.out.println("đng chạy");
		else System.out.println("không chạy");
		return clip.isRunning();
	}
}

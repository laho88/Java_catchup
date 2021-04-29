package com.laho.hashmap;
import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		
		trackList.put("Cleverly named", "Sample lyrics here");
		trackList.put("Witty Title", "Listen closely for the subtle humor");
		trackList.put("Ironicly Titled", "Lyrics sure express double meaning");
		trackList.put("Nostalgic Reflection", "Words invoke some feels of longing");
		
		String singleTrack = trackList.get("Witty Title");
		System.out.printf("This is the single track being requested: %s\n", singleTrack);
		
		Set<String> tracks = trackList.keySet();
		for(String track: tracks) {
			System.out.printf("%s : %s\n", track, trackList.get(track));

		}
		
	}

}
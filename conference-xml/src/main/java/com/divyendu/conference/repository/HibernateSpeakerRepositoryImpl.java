package com.jbattiste.conference.repository;

import java.util.ArrayList;
import java.util.List;

import com.jbattiste.conference.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository{

	public List<Speaker> findAll(){
			List<Speaker> speakers = new ArrayList<>();
			
			Speaker speaker = new Speaker();
			speaker.setFirstName("jbattiste");
			speaker.setLastName("Dutta");
			
			speakers.add(speaker);
			
			return speakers;
	}
}

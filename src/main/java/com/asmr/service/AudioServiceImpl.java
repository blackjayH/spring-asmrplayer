package com.asmr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asmr.repository.AudioRepository;
import com.asmr.vo.AudioVO;

@Service
public class AudioServiceImpl implements AudioService {
	@Autowired
	AudioRepository audiorepository;

	@Transactional
	@Override
	public void insertAudio(AudioVO audiovo) {
		audiorepository.insertAudio(audiovo);
	}
	
	@Transactional
	@Override
	public List<AudioVO> getAudioList(String id, int slot) {
		return audiorepository.getAudioList(id, slot);
	}

	@Transactional
	@Override
	public void updateAudio(AudioVO audiovo) {
		audiorepository.updateAudio(audiovo);
	}

	@Transactional
	@Override
	public void deleteAudio(AudioVO audiovo) {
		audiorepository.deleteAudio(audiovo);

	}
}

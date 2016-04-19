package com.tao.training.domain.person;

import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.emumurate.LanguageLevel;

public class BpLanguage extends AbstractDomain<Long>{

	
	public BpLanguage()
	{
		
	}
	private Long bpId;
	private String language;
	private LanguageLevel reading;
	private LanguageLevel writing;
	private LanguageLevel understand;
	private LanguageLevel listening;
	private LanguageLevel speaking;
	public Long getBpId() {
		return bpId;
	}
	public void setBpId(Long bpId) {
		this.bpId = bpId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public LanguageLevel getReading() {
		return reading;
	}
	public void setReading(LanguageLevel reading) {
		this.reading = reading;
	}
	public LanguageLevel getWriting() {
		return writing;
	}
	public void setWriting(LanguageLevel writing) {
		this.writing = writing;
	}
	public LanguageLevel getUnderstand() {
		return understand;
	}
	public void setUnderstand(LanguageLevel understand) {
		this.understand = understand;
	}
	public LanguageLevel getListening() {
		return listening;
	}
	public void setListening(LanguageLevel listening) {
		this.listening = listening;
	}
	public LanguageLevel getSpeaking() {
		return speaking;
	}
	public void setSpeaking(LanguageLevel speaking) {
		this.speaking = speaking;
	}
	
}

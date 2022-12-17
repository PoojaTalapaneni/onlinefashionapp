package com.fashion.gtest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fashion.gtest.entity.AppUser;
import com.fashion.gtest.entity.Profile;

@Service
public interface ProfileService {

	public List<Profile> getProfilesConnections(int profileId)throws Exception;
	
	public List<Profile> getAllProfiles();
	public void deleteProfileById(int profileId);
	public Profile addProfile(Profile profile);
	public Profile updateProfile(Profile profile);
	
	
public Profile getAllProfilesByPhoneNumber(long phoneNumber)throws Exception;
	
	
	
}

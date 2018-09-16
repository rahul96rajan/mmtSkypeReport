package com.java.mmtSkypeReport.util;

import java.io.IOException;

import fr.delthas.skype.Skype;
import fr.delthas.skype.User;

public class SkypeUtil {
	Skype skype;

	public SkypeUtil(String username, String pwd) {
		skype = new Skype(username, pwd);
		try {
			// If you want to report a bug, enable logging
			// Skype.setDebug(path);
			skype.connect(); // Will block until we're connected
		} catch (IOException e) {
			System.err.println("An error occured while connecting...");
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		skype.setErrorListener(Exception::printStackTrace);
	}

	public void sendMessage(String message, String username) {
		for (User user : skype.getContacts()) {
			if (user.getUsername().equals(username)) {
				System.out.println("Sending Message to : " + user.getFirstname() + " " + user.getLastname());
				user.sendMessage("Hi, " + user.getDisplayName() + ",\n" + message);
			}
		}
	}
	
	public void disconnect() {
		skype.disconnect();
	}

}

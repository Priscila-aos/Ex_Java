package jokengen.challenges;

import jokengen.Player;

public abstract class Challenge {

	private final String name;
	private final Player player;

	public Challenge(String name, Player player){
		this.name = name;
		this.player = player;
	}

	public String getName() {
		return this.name;
	}
	
	public Player getPlayer(){
		return this.player;
	}

}

 	
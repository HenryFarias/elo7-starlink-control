package br.com.elo7.starlink.domains.probe.enumeration;

public enum Direction {
	N('N'), W('W'), E('E'), S('S');
	public final char direction;
	Direction(char direction) {
		this.direction = direction;
	}
}

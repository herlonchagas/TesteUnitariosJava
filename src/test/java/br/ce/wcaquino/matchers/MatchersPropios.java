package br.ce.wcaquino.matchers;

import java.util.Calendar;

public class MatchersPropios {
	
	public static DiaDaSemanaMatchers caiEm(Integer diaSemana)
	{
		return new DiaDaSemanaMatchers(diaSemana);
	}
	
	public static DiaDaSemanaMatchers caiNumaSegunda() {
		return new DiaDaSemanaMatchers(Calendar.MONDAY);
	}
}

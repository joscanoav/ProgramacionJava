package main;

import entidades.Actor;
import queries.ActorQueries;

public class MainSelect {

	public static void main(String[] args) {
		
		/*
		 * for(Actor a : ActorQueries.getActorBySearch("E")) {
		 
			System.out.println(a);
			*/
			Actor a = new Actor(0,"ACTOR NUEVO4","...","2024-04-22 09:34:33");
			if (ActorQueries.insertActor(a)){
				System.out.println("Insert con exito");
			} else {
				System.out.println("Error en insert");
			}
			
			System.out.println(ActorQueries.getActorByID(190));
		}
	}


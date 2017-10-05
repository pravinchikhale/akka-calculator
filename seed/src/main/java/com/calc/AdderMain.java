package com.calc;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.calc.actor.AdderActor;
import com.typesafe.config.ConfigFactory;



/**
 * Created by pravin on 3/29/17.
 */
public class AdderMain {

    public static void main(String[] args) {

        ActorSystem system = ActorSystem.create("adder");
        ActorRef actorRef = system.actorOf(Props.create(AdderActor.class), "adder");
        Integer[] ints = {1,2,3,4,5};
        actorRef.tell(ints, ActorRef.noSender());

    }

}

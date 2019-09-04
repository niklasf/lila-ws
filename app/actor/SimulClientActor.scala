package lila.ws

import akka.actor.typed.scaladsl.{ Behaviors, ActorContext }
import akka.actor.typed.{ ActorRef, Behavior, PostStop }
import play.api.libs.json._
import play.api.Logger

import ipc._

object SimulClientActor {

  import ClientActor._

  def start(simul: Simul)(deps: Deps): Behavior[ClientMsg] = Behaviors.setup { ctx =>
    ???
    // import deps._
    // onStart(deps, ctx)
    // deps.user foreach { u =>
    //   deps.queue(_.user, UserSM.ConnectSilently(u, ctx.self))
    // }
    // queue(_.lobby, LilaIn.ConnectSri(sri, user.map(_.id)))
    // bus.subscribe(ctx.self, _.lobby)
    // apply(State(ClientActor.State(), false), deps)
  }
}

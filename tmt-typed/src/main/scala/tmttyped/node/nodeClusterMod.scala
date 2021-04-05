package tmttyped.node

import tmttyped.node.NodeJS.Dict
import tmttyped.node.clusterMod.Address
import tmttyped.node.clusterMod.Cluster
import tmttyped.node.clusterMod.ClusterSettings
import tmttyped.node.eventsMod.EventEmitterOptions
import tmttyped.node.nodeNetMod.Server
import tmttyped.node.nodeNetMod.Socket
import tmttyped.node.nodeStrings.disconnect
import tmttyped.node.nodeStrings.exit
import tmttyped.node.nodeStrings.fork
import tmttyped.node.nodeStrings.listening
import tmttyped.node.nodeStrings.message
import tmttyped.node.nodeStrings.online
import tmttyped.node.nodeStrings.setup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeClusterMod {
  
  @JSImport("node:cluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:cluster", "SCHED_NONE")
  @js.native
  val SCHED_NONE: Double = js.native
  
  @JSImport("node:cluster", "SCHED_RR")
  @js.native
  val SCHED_RR: Double = js.native
  
  @JSImport("node:cluster", "Worker")
  @js.native
  class Worker_ ()
    extends tmttyped.node.clusterMod.Worker_ {
    def this(options: EventEmitterOptions) = this()
  }
  
  /**
    * events.EventEmitter
    *   1. disconnect
    *   2. exit
    *   3. fork
    *   4. listening
    *   5. message
    *   6. online
    *   7. setup
    */
  @scala.inline
  def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def addListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def addListener_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* code */ Double, 
      /* signal */ java.lang.String, 
      Unit
    ]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def addListener_fork(event: fork, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def addListener_listening(
    event: listening,
    listener: js.Function2[/* worker */ tmttyped.node.clusterMod.Worker_, /* address */ Address, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  // the handle is a net.Socket or net.Server object, or undefined.
  @scala.inline
  def addListener_message(
    event: message,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def addListener_online(event: online, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def addListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def disconnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[Unit]
  @scala.inline
  def disconnect(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def emit(event: java.lang.String, args: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def emit(event: js.Symbol, args: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_disconnect(event: disconnect, worker: tmttyped.node.clusterMod.Worker_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_exit(event: exit, worker: tmttyped.node.clusterMod.Worker_, code: Double, signal: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], code.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_fork(event: fork, worker: tmttyped.node.clusterMod.Worker_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_listening(event: listening, worker: tmttyped.node.clusterMod.Worker_, address: Address): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], address.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_message(event: message, worker: tmttyped.node.clusterMod.Worker_, message: js.Any, handle: Server): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], message.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def emit_message(event: message, worker: tmttyped.node.clusterMod.Worker_, message: js.Any, handle: Socket): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], message.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_online(event: online, worker: tmttyped.node.clusterMod.Worker_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_setup(event: setup, settings: ClusterSettings): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def eventNames(): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventNames")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def fork(): tmttyped.node.clusterMod.Worker_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")().asInstanceOf[tmttyped.node.clusterMod.Worker_]
  @scala.inline
  def fork(env: js.Any): tmttyped.node.clusterMod.Worker_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")(env.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.clusterMod.Worker_]
  
  @scala.inline
  def getMaxListeners(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxListeners")().asInstanceOf[Double]
  
  @JSImport("node:cluster", "isMaster")
  @js.native
  val isMaster: Boolean = js.native
  
  @JSImport("node:cluster", "isWorker")
  @js.native
  val isWorker: Boolean = js.native
  
  @scala.inline
  def listenerCount(`type`: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def listeners(event: java.lang.String): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("listeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
  
  @scala.inline
  def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def on_disconnect(event: disconnect, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def on_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* code */ Double, 
      /* signal */ java.lang.String, 
      Unit
    ]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def on_fork(event: fork, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def on_listening(
    event: listening,
    listener: js.Function2[/* worker */ tmttyped.node.clusterMod.Worker_, /* address */ Address, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def on_message(
    event: message,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  // the handle is a net.Socket or net.Server object, or undefined.
  @scala.inline
  def on_online(event: online, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def on_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def once_disconnect(event: disconnect, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def once_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* code */ Double, 
      /* signal */ java.lang.String, 
      Unit
    ]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def once_fork(event: fork, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def once_listening(
    event: listening,
    listener: js.Function2[/* worker */ tmttyped.node.clusterMod.Worker_, /* address */ Address, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def once_message(
    event: message,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  // the handle is a net.Socket or net.Server object, or undefined.
  @scala.inline
  def once_online(event: online, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def once_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependListener_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* code */ Double, 
      /* signal */ java.lang.String, 
      Unit
    ]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependListener_fork(event: fork, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependListener_listening(
    event: listening,
    listener: js.Function2[/* worker */ tmttyped.node.clusterMod.Worker_, /* address */ Address, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  // the handle is a net.Socket or net.Server object, or undefined.
  @scala.inline
  def prependListener_message(
    event: message,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependListener_online(event: online, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependOnceListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependOnceListener_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* code */ Double, 
      /* signal */ java.lang.String, 
      Unit
    ]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependOnceListener_fork(event: fork, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependOnceListener_listening(
    event: listening,
    listener: js.Function2[/* worker */ tmttyped.node.clusterMod.Worker_, /* address */ Address, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  // the handle is a net.Socket or net.Server object, or undefined.
  @scala.inline
  def prependOnceListener_message(
    event: message,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependOnceListener_online(event: online, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependOnceListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def removeAllListeners(): Cluster = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[Cluster]
  @scala.inline
  def removeAllListeners(event: java.lang.String): Cluster = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(event.asInstanceOf[js.Any]).asInstanceOf[Cluster]
  
  @scala.inline
  def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @JSImport("node:cluster", "schedulingPolicy")
  @js.native
  def schedulingPolicy: Double = js.native
  @scala.inline
  def schedulingPolicy_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("schedulingPolicy")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def setMaxListeners(n: Double): Cluster = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxListeners")(n.asInstanceOf[js.Any]).asInstanceOf[Cluster]
  
  @JSImport("node:cluster", "settings")
  @js.native
  val settings: ClusterSettings = js.native
  
  @scala.inline
  def setupMaster(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupMaster")().asInstanceOf[Unit]
  @scala.inline
  def setupMaster(settings: ClusterSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupMaster")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("node:cluster", "worker")
  @js.native
  val worker: tmttyped.node.clusterMod.Worker_ = js.native
  
  @JSImport("node:cluster", "workers")
  @js.native
  val workers: Dict[tmttyped.node.clusterMod.Worker_] = js.native
}

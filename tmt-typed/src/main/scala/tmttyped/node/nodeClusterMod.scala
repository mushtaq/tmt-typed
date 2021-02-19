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
  @JSImport("node:cluster", "addListener")
  @js.native
  def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSImport("node:cluster", "addListener")
  @js.native
  def addListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "addListener")
  @js.native
  def addListener_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* code */ Double, 
      /* signal */ java.lang.String, 
      Unit
    ]
  ): Cluster = js.native
  @JSImport("node:cluster", "addListener")
  @js.native
  def addListener_fork(event: fork, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "addListener")
  @js.native
  def addListener_listening(
    event: listening,
    listener: js.Function2[/* worker */ tmttyped.node.clusterMod.Worker_, /* address */ Address, Unit]
  ): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSImport("node:cluster", "addListener")
  @js.native
  def addListener_message(
    event: message,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = js.native
  @JSImport("node:cluster", "addListener")
  @js.native
  def addListener_online(event: online, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "addListener")
  @js.native
  def addListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  
  @JSImport("node:cluster", "disconnect")
  @js.native
  def disconnect(): Unit = js.native
  @JSImport("node:cluster", "disconnect")
  @js.native
  def disconnect(callback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("node:cluster", "emit")
  @js.native
  def emit(event: java.lang.String, args: js.Any*): Boolean = js.native
  @JSImport("node:cluster", "emit")
  @js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  @JSImport("node:cluster", "emit")
  @js.native
  def emit_disconnect(event: disconnect, worker: tmttyped.node.clusterMod.Worker_): Boolean = js.native
  @JSImport("node:cluster", "emit")
  @js.native
  def emit_exit(event: exit, worker: tmttyped.node.clusterMod.Worker_, code: Double, signal: java.lang.String): Boolean = js.native
  @JSImport("node:cluster", "emit")
  @js.native
  def emit_fork(event: fork, worker: tmttyped.node.clusterMod.Worker_): Boolean = js.native
  @JSImport("node:cluster", "emit")
  @js.native
  def emit_listening(event: listening, worker: tmttyped.node.clusterMod.Worker_, address: Address): Boolean = js.native
  @JSImport("node:cluster", "emit")
  @js.native
  def emit_message(event: message, worker: tmttyped.node.clusterMod.Worker_, message: js.Any, handle: Server): Boolean = js.native
  @JSImport("node:cluster", "emit")
  @js.native
  def emit_message(event: message, worker: tmttyped.node.clusterMod.Worker_, message: js.Any, handle: Socket): Boolean = js.native
  @JSImport("node:cluster", "emit")
  @js.native
  def emit_online(event: online, worker: tmttyped.node.clusterMod.Worker_): Boolean = js.native
  @JSImport("node:cluster", "emit")
  @js.native
  def emit_setup(event: setup, settings: ClusterSettings): Boolean = js.native
  
  @JSImport("node:cluster", "eventNames")
  @js.native
  def eventNames(): js.Array[java.lang.String] = js.native
  
  @JSImport("node:cluster", "fork")
  @js.native
  def fork(): tmttyped.node.clusterMod.Worker_ = js.native
  @JSImport("node:cluster", "fork")
  @js.native
  def fork(env: js.Any): tmttyped.node.clusterMod.Worker_ = js.native
  
  @JSImport("node:cluster", "getMaxListeners")
  @js.native
  def getMaxListeners(): Double = js.native
  
  @JSImport("node:cluster", "isMaster")
  @js.native
  val isMaster: Boolean = js.native
  
  @JSImport("node:cluster", "isWorker")
  @js.native
  val isWorker: Boolean = js.native
  
  @JSImport("node:cluster", "listenerCount")
  @js.native
  def listenerCount(`type`: java.lang.String): Double = js.native
  
  @JSImport("node:cluster", "listeners")
  @js.native
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  
  @JSImport("node:cluster", "on")
  @js.native
  def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSImport("node:cluster", "on")
  @js.native
  def on_disconnect(event: disconnect, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "on")
  @js.native
  def on_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* code */ Double, 
      /* signal */ java.lang.String, 
      Unit
    ]
  ): Cluster = js.native
  @JSImport("node:cluster", "on")
  @js.native
  def on_fork(event: fork, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "on")
  @js.native
  def on_listening(
    event: listening,
    listener: js.Function2[/* worker */ tmttyped.node.clusterMod.Worker_, /* address */ Address, Unit]
  ): Cluster = js.native
  @JSImport("node:cluster", "on")
  @js.native
  def on_message(
    event: message,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSImport("node:cluster", "on")
  @js.native
  def on_online(event: online, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "on")
  @js.native
  def on_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  
  @JSImport("node:cluster", "once")
  @js.native
  def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSImport("node:cluster", "once")
  @js.native
  def once_disconnect(event: disconnect, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "once")
  @js.native
  def once_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* code */ Double, 
      /* signal */ java.lang.String, 
      Unit
    ]
  ): Cluster = js.native
  @JSImport("node:cluster", "once")
  @js.native
  def once_fork(event: fork, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "once")
  @js.native
  def once_listening(
    event: listening,
    listener: js.Function2[/* worker */ tmttyped.node.clusterMod.Worker_, /* address */ Address, Unit]
  ): Cluster = js.native
  @JSImport("node:cluster", "once")
  @js.native
  def once_message(
    event: message,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSImport("node:cluster", "once")
  @js.native
  def once_online(event: online, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "once")
  @js.native
  def once_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  
  @JSImport("node:cluster", "prependListener")
  @js.native
  def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSImport("node:cluster", "prependListener")
  @js.native
  def prependListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "prependListener")
  @js.native
  def prependListener_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* code */ Double, 
      /* signal */ java.lang.String, 
      Unit
    ]
  ): Cluster = js.native
  @JSImport("node:cluster", "prependListener")
  @js.native
  def prependListener_fork(event: fork, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "prependListener")
  @js.native
  def prependListener_listening(
    event: listening,
    listener: js.Function2[/* worker */ tmttyped.node.clusterMod.Worker_, /* address */ Address, Unit]
  ): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSImport("node:cluster", "prependListener")
  @js.native
  def prependListener_message(
    event: message,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = js.native
  @JSImport("node:cluster", "prependListener")
  @js.native
  def prependListener_online(event: online, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "prependListener")
  @js.native
  def prependListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  
  @JSImport("node:cluster", "prependOnceListener")
  @js.native
  def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSImport("node:cluster", "prependOnceListener")
  @js.native
  def prependOnceListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "prependOnceListener")
  @js.native
  def prependOnceListener_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* code */ Double, 
      /* signal */ java.lang.String, 
      Unit
    ]
  ): Cluster = js.native
  @JSImport("node:cluster", "prependOnceListener")
  @js.native
  def prependOnceListener_fork(event: fork, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "prependOnceListener")
  @js.native
  def prependOnceListener_listening(
    event: listening,
    listener: js.Function2[/* worker */ tmttyped.node.clusterMod.Worker_, /* address */ Address, Unit]
  ): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSImport("node:cluster", "prependOnceListener")
  @js.native
  def prependOnceListener_message(
    event: message,
    listener: js.Function3[
      /* worker */ tmttyped.node.clusterMod.Worker_, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = js.native
  @JSImport("node:cluster", "prependOnceListener")
  @js.native
  def prependOnceListener_online(event: online, listener: js.Function1[/* worker */ tmttyped.node.clusterMod.Worker_, Unit]): Cluster = js.native
  @JSImport("node:cluster", "prependOnceListener")
  @js.native
  def prependOnceListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  
  @JSImport("node:cluster", "removeAllListeners")
  @js.native
  def removeAllListeners(): Cluster = js.native
  @JSImport("node:cluster", "removeAllListeners")
  @js.native
  def removeAllListeners(event: java.lang.String): Cluster = js.native
  
  @JSImport("node:cluster", "removeListener")
  @js.native
  def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  
  @JSImport("node:cluster", "schedulingPolicy")
  @js.native
  def schedulingPolicy: Double = js.native
  @scala.inline
  def schedulingPolicy_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("schedulingPolicy")(x.asInstanceOf[js.Any])
  
  @JSImport("node:cluster", "setMaxListeners")
  @js.native
  def setMaxListeners(n: Double): Cluster = js.native
  
  @JSImport("node:cluster", "settings")
  @js.native
  val settings: ClusterSettings = js.native
  
  @JSImport("node:cluster", "setupMaster")
  @js.native
  def setupMaster(): Unit = js.native
  @JSImport("node:cluster", "setupMaster")
  @js.native
  def setupMaster(settings: ClusterSettings): Unit = js.native
  
  @JSImport("node:cluster", "worker")
  @js.native
  val worker: tmttyped.node.clusterMod.Worker_ = js.native
  
  @JSImport("node:cluster", "workers")
  @js.native
  val workers: Dict[tmttyped.node.clusterMod.Worker_] = js.native
}

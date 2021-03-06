package tmttyped.node

import tmttyped.node.NodeJS.Dict
import tmttyped.node.childProcessMod.ChildProcess
import tmttyped.node.childProcessMod.SendHandle
import tmttyped.node.childProcessMod.Serializable
import tmttyped.node.eventsMod.EventEmitterOptions
import tmttyped.node.nodeNetMod.Server
import tmttyped.node.nodeNetMod.Socket
import tmttyped.node.nodeStrings.disconnect
import tmttyped.node.nodeStrings.error
import tmttyped.node.nodeStrings.exit
import tmttyped.node.nodeStrings.fork
import tmttyped.node.nodeStrings.listening
import tmttyped.node.nodeStrings.message
import tmttyped.node.nodeStrings.online
import tmttyped.node.nodeStrings.setup
import tmttyped.node.nodeStrings.udp4
import tmttyped.node.nodeStrings.udp6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterMod {
  
  @JSImport("cluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cluster", "SCHED_NONE")
  @js.native
  val SCHED_NONE: Double = js.native
  
  @JSImport("cluster", "SCHED_RR")
  @js.native
  val SCHED_RR: Double = js.native
  
  @JSImport("cluster", "Worker")
  @js.native
  class Worker_ ()
    extends tmttyped.node.nodeEventsMod.^ {
    def this(options: EventEmitterOptions) = this()
    
    @JSName("addListener")
    def addListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("addListener")
    def addListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    def destroy(): Unit = js.native
    def destroy(signal: java.lang.String): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    @JSName("emit")
    def emit_disconnect(event: disconnect): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, error: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_exit(event: exit, code: Double, signal: java.lang.String): Boolean = js.native
    @JSName("emit")
    def emit_listening(event: listening, address: Address): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, message: js.Any, handle: Server): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, message: js.Any, handle: Socket): Boolean = js.native
    @JSName("emit")
    def emit_online(event: online): Boolean = js.native
    
    var exitedAfterDisconnect: Boolean = js.native
    
    var id: Double = js.native
    
    def isConnected(): Boolean = js.native
    
    def isDead(): Boolean = js.native
    
    def kill(): Unit = js.native
    def kill(signal: java.lang.String): Unit = js.native
    
    @JSName("on")
    def on_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
    @JSName("on")
    def on_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("on")
    def on_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
    @JSName("once")
    def once_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
    @JSName("once")
    def once_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("once")
    def once_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("prependListener")
    def prependListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_exit(event: exit, listener: js.Function2[/* code */ Double, /* signal */ java.lang.String, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_listening(event: listening, listener: js.Function1[/* address */ Address, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_message(event: message, listener: js.Function2[/* message */ js.Any, /* handle */ Socket | Server, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("prependOnceListener")
    def prependOnceListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    var process: ChildProcess = js.native
    
    def send(message: Serializable): Boolean = js.native
    def send(
      message: Serializable,
      sendHandle: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ js.Error | Null, Unit]
    ): Boolean = js.native
    def send(message: Serializable, sendHandle: SendHandle): Boolean = js.native
    def send(
      message: Serializable,
      sendHandle: SendHandle,
      callback: js.Function1[/* error */ js.Error | Null, Unit]
    ): Boolean = js.native
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
  def addListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def addListener_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def addListener_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def addListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  // the handle is a net.Socket or net.Server object, or undefined.
  @scala.inline
  def addListener_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def addListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
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
  def emit_disconnect(event: disconnect, worker: Worker_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_exit(event: exit, worker: Worker_, code: Double, signal: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], code.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_fork(event: fork, worker: Worker_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_listening(event: listening, worker: Worker_, address: Address): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], address.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_message(event: message, worker: Worker_, message: js.Any, handle: Server): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], message.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def emit_message(event: message, worker: Worker_, message: js.Any, handle: Socket): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], message.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_online(event: online, worker: Worker_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emit_setup(event: setup, settings: ClusterSettings): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def eventNames(): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventNames")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def fork(): Worker_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")().asInstanceOf[Worker_]
  @scala.inline
  def fork(env: js.Any): Worker_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")(env.asInstanceOf[js.Any]).asInstanceOf[Worker_]
  
  @scala.inline
  def getMaxListeners(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxListeners")().asInstanceOf[Double]
  
  @JSImport("cluster", "isMaster")
  @js.native
  val isMaster: Boolean = js.native
  
  @JSImport("cluster", "isWorker")
  @js.native
  val isWorker: Boolean = js.native
  
  @scala.inline
  def listenerCount(`type`: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def listeners(event: java.lang.String): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("listeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
  
  @scala.inline
  def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def on_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def on_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def on_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def on_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def on_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  // the handle is a net.Socket or net.Server object, or undefined.
  @scala.inline
  def on_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def on_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def once_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def once_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def once_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def once_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def once_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  // the handle is a net.Socket or net.Server object, or undefined.
  @scala.inline
  def once_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def once_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependListener_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependListener_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  // the handle is a net.Socket or net.Server object, or undefined.
  @scala.inline
  def prependListener_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependOnceListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependOnceListener_exit(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependOnceListener_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependOnceListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  // the handle is a net.Socket or net.Server object, or undefined.
  @scala.inline
  def prependOnceListener_message(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependOnceListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def prependOnceListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @scala.inline
  def removeAllListeners(): Cluster = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[Cluster]
  @scala.inline
  def removeAllListeners(event: java.lang.String): Cluster = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(event.asInstanceOf[js.Any]).asInstanceOf[Cluster]
  
  @scala.inline
  def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Cluster]
  
  @JSImport("cluster", "schedulingPolicy")
  @js.native
  def schedulingPolicy: Double = js.native
  @scala.inline
  def schedulingPolicy_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("schedulingPolicy")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def setMaxListeners(n: Double): Cluster = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxListeners")(n.asInstanceOf[js.Any]).asInstanceOf[Cluster]
  
  @JSImport("cluster", "settings")
  @js.native
  val settings: ClusterSettings = js.native
  
  @scala.inline
  def setupMaster(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupMaster")().asInstanceOf[Unit]
  @scala.inline
  def setupMaster(settings: ClusterSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupMaster")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("cluster", "worker")
  @js.native
  val worker: Worker_ = js.native
  
  @JSImport("cluster", "workers")
  @js.native
  val workers: Dict[Worker_] = js.native
  
  trait Address extends StObject {
    
    var address: java.lang.String
    
    var addressType: Double | udp4 | udp6
    
    var port: Double
  }
  object Address {
    
    @scala.inline
    def apply(address: java.lang.String, addressType: Double | udp4 | udp6, port: Double): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressType = addressType.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: java.lang.String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressType(value: Double | udp4 | udp6): Self = StObject.set(x, "addressType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cluster
    extends tmttyped.node.nodeEventsMod.^ {
    
    val SCHED_NONE: Double = js.native
    
    val SCHED_RR: Double = js.native
    
    var Worker: Worker_ = js.native
    
    @JSName("addListener")
    def addListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_exit(
      event: exit,
      listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_message(
      event: message,
      listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
    ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("addListener")
    def addListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
    
    def disconnect(): Unit = js.native
    def disconnect(callback: js.Function0[Unit]): Unit = js.native
    
    @JSName("emit")
    def emit_disconnect(event: disconnect, worker: Worker_): Boolean = js.native
    @JSName("emit")
    def emit_exit(event: exit, worker: Worker_, code: Double, signal: java.lang.String): Boolean = js.native
    @JSName("emit")
    def emit_fork(event: fork, worker: Worker_): Boolean = js.native
    @JSName("emit")
    def emit_listening(event: listening, worker: Worker_, address: Address): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, worker: Worker_, message: js.Any, handle: Server): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, worker: Worker_, message: js.Any, handle: Socket): Boolean = js.native
    @JSName("emit")
    def emit_online(event: online, worker: Worker_): Boolean = js.native
    @JSName("emit")
    def emit_setup(event: setup, settings: ClusterSettings): Boolean = js.native
    
    def fork(): Worker_ = js.native
    def fork(env: js.Any): Worker_ = js.native
    
    var isMaster: Boolean = js.native
    
    var isWorker: Boolean = js.native
    
    @JSName("on")
    def on_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("on")
    def on_exit(
      event: exit,
      listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("on")
    def on_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
    @JSName("on")
    def on_message(
      event: message,
      listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
    ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("on")
    def on_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("on")
    def on_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
    
    @JSName("once")
    def once_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("once")
    def once_exit(
      event: exit,
      listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("once")
    def once_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
    @JSName("once")
    def once_message(
      event: message,
      listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
    ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("once")
    def once_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("once")
    def once_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_exit(
      event: exit,
      listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_message(
      event: message,
      listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
    ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("prependListener")
    def prependListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_exit(
      event: exit,
      listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ java.lang.String, Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_fork(event: fork, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_listening(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
    @JSName("prependOnceListener")
    def prependOnceListener_message(
      event: message,
      listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_online(event: online, listener: js.Function1[/* worker */ Worker_, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): this.type = js.native
    
    var schedulingPolicy: Double = js.native
    
    var settings: ClusterSettings = js.native
    
    def setupMaster(): Unit = js.native
    def setupMaster(settings: ClusterSettings): Unit = js.native
    
    var worker: js.UndefOr[Worker_] = js.native
    
    var workers: js.UndefOr[Dict[Worker_]] = js.native
  }
  
  // interfaces
  trait ClusterSettings extends StObject {
    
    var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    
    // default: process.execArgv
    var exec: js.UndefOr[java.lang.String] = js.undefined
    
    var execArgv: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    
    var gid: js.UndefOr[Double] = js.undefined
    
    var inspectPort: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var stdio: js.UndefOr[js.Array[_]] = js.undefined
    
    var uid: js.UndefOr[Double] = js.undefined
  }
  object ClusterSettings {
    
    @scala.inline
    def apply(): ClusterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterSettings]
    }
    
    @scala.inline
    implicit class ClusterSettingsMutableBuilder[Self <: ClusterSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[java.lang.String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: java.lang.String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setExec(value: java.lang.String): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecArgv(value: js.Array[java.lang.String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      @scala.inline
      def setExecArgvVarargs(value: java.lang.String*): Self = StObject.set(x, "execArgv", js.Array(value :_*))
      
      @scala.inline
      def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setInspectPort(value: Double | js.Function0[Double]): Self = StObject.set(x, "inspectPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInspectPortFunction0(value: () => Double): Self = StObject.set(x, "inspectPort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInspectPortUndefined: Self = StObject.set(x, "inspectPort", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setStdio(value: js.Array[_]): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      @scala.inline
      def setStdioVarargs(value: js.Any*): Self = StObject.set(x, "stdio", js.Array(value :_*))
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}

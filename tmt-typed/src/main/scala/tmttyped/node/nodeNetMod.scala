package tmttyped.node

import tmttyped.node.NodeJS.WritableStream
import tmttyped.node.anon.End
import tmttyped.node.childProcessMod.SendHandle
import tmttyped.node.netMod.NetConnectOpts
import tmttyped.node.netMod.ServerOpts
import tmttyped.node.netMod.SocketConstructorOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeNetMod {
  
  @JSImport("node:net", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // https://github.com/nodejs/node/blob/master/lib/net.js
  @JSImport("node:net", "Server")
  @js.native
  class Server ()
    extends tmttyped.node.netMod.Server
       with SendHandle {
    def this(connectionListener: js.Function1[/* socket */ tmttyped.node.netMod.Socket, Unit]) = this()
    def this(options: ServerOpts) = this()
    def this(
      options: js.UndefOr[scala.Nothing],
      connectionListener: js.Function1[/* socket */ tmttyped.node.netMod.Socket, Unit]
    ) = this()
    def this(
      options: ServerOpts,
      connectionListener: js.Function1[/* socket */ tmttyped.node.netMod.Socket, Unit]
    ) = this()
  }
  
  @JSImport("node:net", "Socket")
  @js.native
  class Socket ()
    extends tmttyped.node.netMod.Socket
       with SendHandle {
    def this(options: SocketConstructorOpts) = this()
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
  
  @scala.inline
  def connect(options: NetConnectOpts): tmttyped.node.netMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.netMod.Socket]
  @scala.inline
  def connect(options: NetConnectOpts, connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.netMod.Socket]
  @scala.inline
  def connect(path: java.lang.String): tmttyped.node.netMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(path.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.netMod.Socket]
  @scala.inline
  def connect(path: java.lang.String, connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(path.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.netMod.Socket]
  @scala.inline
  def connect(port: Double): tmttyped.node.netMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.netMod.Socket]
  @scala.inline
  def connect(port: Double, host: js.UndefOr[scala.Nothing], connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.netMod.Socket]
  @scala.inline
  def connect(port: Double, host: java.lang.String): tmttyped.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.netMod.Socket]
  @scala.inline
  def connect(port: Double, host: java.lang.String, connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.netMod.Socket]
  
  @scala.inline
  def createConnection(options: NetConnectOpts): tmttyped.node.netMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.netMod.Socket]
  @scala.inline
  def createConnection(options: NetConnectOpts, connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.netMod.Socket]
  @scala.inline
  def createConnection(path: java.lang.String): tmttyped.node.netMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(path.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.netMod.Socket]
  @scala.inline
  def createConnection(path: java.lang.String, connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(path.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.netMod.Socket]
  @scala.inline
  def createConnection(port: Double): tmttyped.node.netMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.netMod.Socket]
  @scala.inline
  def createConnection(port: Double, host: js.UndefOr[scala.Nothing], connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.netMod.Socket]
  @scala.inline
  def createConnection(port: Double, host: java.lang.String): tmttyped.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.netMod.Socket]
  @scala.inline
  def createConnection(port: Double, host: java.lang.String, connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.netMod.Socket]
  
  @scala.inline
  def createServer(): tmttyped.node.netMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[tmttyped.node.netMod.Server]
  @scala.inline
  def createServer(connectionListener: js.Function1[/* socket */ tmttyped.node.netMod.Socket, Unit]): tmttyped.node.netMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(connectionListener.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.netMod.Server]
  @scala.inline
  def createServer(
    options: js.UndefOr[scala.Nothing],
    connectionListener: js.Function1[/* socket */ tmttyped.node.netMod.Socket, Unit]
  ): tmttyped.node.netMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.netMod.Server]
  @scala.inline
  def createServer(options: ServerOpts): tmttyped.node.netMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.netMod.Server]
  @scala.inline
  def createServer(
    options: ServerOpts,
    connectionListener: js.Function1[/* socket */ tmttyped.node.netMod.Socket, Unit]
  ): tmttyped.node.netMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.netMod.Server]
  
  @scala.inline
  def isIP(input: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isIPv4(input: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isIPv6(input: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv6")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

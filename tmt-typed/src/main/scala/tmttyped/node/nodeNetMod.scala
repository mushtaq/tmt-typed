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
  
  @JSImport("node:net", "connect")
  @js.native
  def connect(options: NetConnectOpts): tmttyped.node.netMod.Socket = js.native
  @JSImport("node:net", "connect")
  @js.native
  def connect(options: NetConnectOpts, connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = js.native
  @JSImport("node:net", "connect")
  @js.native
  def connect(path: java.lang.String): tmttyped.node.netMod.Socket = js.native
  @JSImport("node:net", "connect")
  @js.native
  def connect(path: java.lang.String, connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = js.native
  @JSImport("node:net", "connect")
  @js.native
  def connect(port: Double): tmttyped.node.netMod.Socket = js.native
  @JSImport("node:net", "connect")
  @js.native
  def connect(port: Double, host: js.UndefOr[scala.Nothing], connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = js.native
  @JSImport("node:net", "connect")
  @js.native
  def connect(port: Double, host: java.lang.String): tmttyped.node.netMod.Socket = js.native
  @JSImport("node:net", "connect")
  @js.native
  def connect(port: Double, host: java.lang.String, connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = js.native
  
  @JSImport("node:net", "createConnection")
  @js.native
  def createConnection(options: NetConnectOpts): tmttyped.node.netMod.Socket = js.native
  @JSImport("node:net", "createConnection")
  @js.native
  def createConnection(options: NetConnectOpts, connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = js.native
  @JSImport("node:net", "createConnection")
  @js.native
  def createConnection(path: java.lang.String): tmttyped.node.netMod.Socket = js.native
  @JSImport("node:net", "createConnection")
  @js.native
  def createConnection(path: java.lang.String, connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = js.native
  @JSImport("node:net", "createConnection")
  @js.native
  def createConnection(port: Double): tmttyped.node.netMod.Socket = js.native
  @JSImport("node:net", "createConnection")
  @js.native
  def createConnection(port: Double, host: js.UndefOr[scala.Nothing], connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = js.native
  @JSImport("node:net", "createConnection")
  @js.native
  def createConnection(port: Double, host: java.lang.String): tmttyped.node.netMod.Socket = js.native
  @JSImport("node:net", "createConnection")
  @js.native
  def createConnection(port: Double, host: java.lang.String, connectionListener: js.Function0[Unit]): tmttyped.node.netMod.Socket = js.native
  
  @JSImport("node:net", "createServer")
  @js.native
  def createServer(): tmttyped.node.netMod.Server = js.native
  @JSImport("node:net", "createServer")
  @js.native
  def createServer(connectionListener: js.Function1[/* socket */ tmttyped.node.netMod.Socket, Unit]): tmttyped.node.netMod.Server = js.native
  @JSImport("node:net", "createServer")
  @js.native
  def createServer(
    options: js.UndefOr[scala.Nothing],
    connectionListener: js.Function1[/* socket */ tmttyped.node.netMod.Socket, Unit]
  ): tmttyped.node.netMod.Server = js.native
  @JSImport("node:net", "createServer")
  @js.native
  def createServer(options: ServerOpts): tmttyped.node.netMod.Server = js.native
  @JSImport("node:net", "createServer")
  @js.native
  def createServer(
    options: ServerOpts,
    connectionListener: js.Function1[/* socket */ tmttyped.node.netMod.Socket, Unit]
  ): tmttyped.node.netMod.Server = js.native
  
  @JSImport("node:net", "isIP")
  @js.native
  def isIP(input: java.lang.String): Double = js.native
  
  @JSImport("node:net", "isIPv4")
  @js.native
  def isIPv4(input: java.lang.String): Boolean = js.native
  
  @JSImport("node:net", "isIPv6")
  @js.native
  def isIPv6(input: java.lang.String): Boolean = js.native
}

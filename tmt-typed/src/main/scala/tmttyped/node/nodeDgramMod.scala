package tmttyped.node

import tmttyped.node.dgramMod.RemoteInfo
import tmttyped.node.dgramMod.SocketOptions
import tmttyped.node.dgramMod.SocketType
import tmttyped.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeDgramMod {
  
  @JSImport("node:dgram", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:dgram", "Socket")
  @js.native
  class Socket ()
    extends tmttyped.node.dgramMod.Socket {
    def this(options: EventEmitterOptions) = this()
  }
  
  @scala.inline
  def createSocket(options: SocketOptions): tmttyped.node.dgramMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.dgramMod.Socket]
  @scala.inline
  def createSocket(options: SocketOptions, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): tmttyped.node.dgramMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.dgramMod.Socket]
  @scala.inline
  def createSocket(`type`: SocketType): tmttyped.node.dgramMod.Socket = ^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(`type`.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.dgramMod.Socket]
  @scala.inline
  def createSocket(`type`: SocketType, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): tmttyped.node.dgramMod.Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createSocket")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.dgramMod.Socket]
}

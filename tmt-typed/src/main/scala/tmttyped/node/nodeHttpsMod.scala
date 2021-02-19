package tmttyped.node

import tmttyped.node.httpMod.RequestListener
import tmttyped.node.httpsMod.AgentOptions
import tmttyped.node.httpsMod.RequestOptions
import tmttyped.node.httpsMod.ServerOptions
import tmttyped.node.nodeHttpMod.ClientRequest
import tmttyped.node.nodeHttpMod.IncomingMessage
import tmttyped.node.nodeUrlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHttpsMod {
  
  @JSImport("node:https", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:https", "Agent")
  @js.native
  class Agent ()
    extends tmttyped.node.httpsMod.Agent {
    def this(options: AgentOptions) = this()
  }
  
  @JSImport("node:https", "Server")
  @js.native
  class Server ()
    extends tmttyped.node.httpsMod.Server {
    def this(options: ServerOptions) = this()
    def this(requestListener: RequestListener) = this()
    def this(options: ServerOptions, requestListener: RequestListener) = this()
  }
  
  @JSImport("node:https", "createServer")
  @js.native
  def createServer(): tmttyped.node.httpsMod.Server = js.native
  @JSImport("node:https", "createServer")
  @js.native
  def createServer(options: ServerOptions): tmttyped.node.httpsMod.Server = js.native
  @JSImport("node:https", "createServer")
  @js.native
  def createServer(options: ServerOptions, requestListener: RequestListener): tmttyped.node.httpsMod.Server = js.native
  @JSImport("node:https", "createServer")
  @js.native
  def createServer(requestListener: RequestListener): tmttyped.node.httpsMod.Server = js.native
  
  @JSImport("node:https", "get")
  @js.native
  def get(options: java.lang.String): ClientRequest = js.native
  @JSImport("node:https", "get")
  @js.native
  def get(options: java.lang.String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("node:https", "get")
  @js.native
  def get(options: RequestOptions): ClientRequest = js.native
  @JSImport("node:https", "get")
  @js.native
  def get(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("node:https", "get")
  @js.native
  def get(options: URL): ClientRequest = js.native
  @JSImport("node:https", "get")
  @js.native
  def get(options: URL, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("node:https", "get")
  @js.native
  def get(url: java.lang.String, options: RequestOptions): ClientRequest = js.native
  @JSImport("node:https", "get")
  @js.native
  def get(
    url: java.lang.String,
    options: RequestOptions,
    callback: js.Function1[/* res */ IncomingMessage, Unit]
  ): ClientRequest = js.native
  @JSImport("node:https", "get")
  @js.native
  def get(url: URL, options: RequestOptions): ClientRequest = js.native
  @JSImport("node:https", "get")
  @js.native
  def get(url: URL, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  
  @JSImport("node:https", "globalAgent")
  @js.native
  def globalAgent: tmttyped.node.httpsMod.Agent = js.native
  @scala.inline
  def globalAgent_=(x: tmttyped.node.httpsMod.Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
  
  @JSImport("node:https", "request")
  @js.native
  def request(options: java.lang.String): ClientRequest = js.native
  @JSImport("node:https", "request")
  @js.native
  def request(options: java.lang.String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("node:https", "request")
  @js.native
  def request(options: RequestOptions): ClientRequest = js.native
  @JSImport("node:https", "request")
  @js.native
  def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("node:https", "request")
  @js.native
  def request(options: URL): ClientRequest = js.native
  @JSImport("node:https", "request")
  @js.native
  def request(options: URL, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  @JSImport("node:https", "request")
  @js.native
  def request(url: java.lang.String, options: RequestOptions): ClientRequest = js.native
  @JSImport("node:https", "request")
  @js.native
  def request(
    url: java.lang.String,
    options: RequestOptions,
    callback: js.Function1[/* res */ IncomingMessage, Unit]
  ): ClientRequest = js.native
  @JSImport("node:https", "request")
  @js.native
  def request(url: URL, options: RequestOptions): ClientRequest = js.native
  @JSImport("node:https", "request")
  @js.native
  def request(url: URL, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
}

package tmttyped.node

import tmttyped.node.httpMod.AgentOptions
import tmttyped.node.httpMod.ClientRequestArgs
import tmttyped.node.httpMod.RequestListener
import tmttyped.node.httpMod.RequestOptions
import tmttyped.node.httpMod.ServerOptions
import tmttyped.node.nodeNetMod.Socket
import tmttyped.node.nodeUrlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHttpMod {
  
  @JSImport("node:http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:http", "Agent")
  @js.native
  class Agent ()
    extends tmttyped.node.httpMod.Agent {
    def this(opts: AgentOptions) = this()
  }
  
  // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L77
  @JSImport("node:http", "ClientRequest")
  @js.native
  class ClientRequest protected ()
    extends tmttyped.node.httpMod.ClientRequest {
    def this(url: java.lang.String) = this()
    def this(url: ClientRequestArgs) = this()
    def this(url: URL) = this()
    def this(url: java.lang.String, cb: js.Function1[/* res */ tmttyped.node.httpMod.IncomingMessage, Unit]) = this()
    def this(url: ClientRequestArgs, cb: js.Function1[/* res */ tmttyped.node.httpMod.IncomingMessage, Unit]) = this()
    def this(url: URL, cb: js.Function1[/* res */ tmttyped.node.httpMod.IncomingMessage, Unit]) = this()
  }
  
  @JSImport("node:http", "IncomingMessage")
  @js.native
  class IncomingMessage protected ()
    extends tmttyped.node.httpMod.IncomingMessage {
    def this(socket: Socket) = this()
  }
  
  @JSImport("node:http", "METHODS")
  @js.native
  val METHODS: js.Array[java.lang.String] = js.native
  
  // https://github.com/nodejs/node/blob/master/lib/_http_outgoing.js
  @JSImport("node:http", "OutgoingMessage")
  @js.native
  class OutgoingMessage ()
    extends tmttyped.node.httpMod.OutgoingMessage
  
  @JSImport("node:http", "Server")
  @js.native
  class Server ()
    extends tmttyped.node.httpMod.Server {
    def this(options: ServerOptions) = this()
    def this(requestListener: RequestListener) = this()
    def this(options: ServerOptions, requestListener: RequestListener) = this()
  }
  
  // https://github.com/nodejs/node/blob/master/lib/_http_server.js#L108-L256
  @JSImport("node:http", "ServerResponse")
  @js.native
  class ServerResponse protected ()
    extends tmttyped.node.httpMod.ServerResponse {
    def this(req: tmttyped.node.httpMod.IncomingMessage) = this()
  }
  
  @JSImport("node:http", "createServer")
  @js.native
  def createServer(): tmttyped.node.httpMod.Server = js.native
  @JSImport("node:http", "createServer")
  @js.native
  def createServer(options: ServerOptions): tmttyped.node.httpMod.Server = js.native
  @JSImport("node:http", "createServer")
  @js.native
  def createServer(options: ServerOptions, requestListener: RequestListener): tmttyped.node.httpMod.Server = js.native
  @JSImport("node:http", "createServer")
  @js.native
  def createServer(requestListener: RequestListener): tmttyped.node.httpMod.Server = js.native
  
  @JSImport("node:http", "get")
  @js.native
  def get(options: java.lang.String): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "get")
  @js.native
  def get(
    options: java.lang.String,
    callback: js.Function1[/* res */ tmttyped.node.httpMod.IncomingMessage, Unit]
  ): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "get")
  @js.native
  def get(options: RequestOptions): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "get")
  @js.native
  def get(
    options: RequestOptions,
    callback: js.Function1[/* res */ tmttyped.node.httpMod.IncomingMessage, Unit]
  ): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "get")
  @js.native
  def get(options: URL): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "get")
  @js.native
  def get(options: URL, callback: js.Function1[/* res */ tmttyped.node.httpMod.IncomingMessage, Unit]): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "get")
  @js.native
  def get(url: java.lang.String, options: RequestOptions): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "get")
  @js.native
  def get(
    url: java.lang.String,
    options: RequestOptions,
    callback: js.Function1[/* res */ tmttyped.node.httpMod.IncomingMessage, Unit]
  ): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "get")
  @js.native
  def get(url: URL, options: RequestOptions): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "get")
  @js.native
  def get(
    url: URL,
    options: RequestOptions,
    callback: js.Function1[/* res */ tmttyped.node.httpMod.IncomingMessage, Unit]
  ): tmttyped.node.httpMod.ClientRequest = js.native
  
  @JSImport("node:http", "globalAgent")
  @js.native
  def globalAgent: tmttyped.node.httpMod.Agent = js.native
  @scala.inline
  def globalAgent_=(x: tmttyped.node.httpMod.Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
  
  /**
    * Read-only property specifying the maximum allowed size of HTTP headers in bytes.
    * Defaults to 16KB. Configurable using the [`--max-http-header-size`][] CLI option.
    */
  @JSImport("node:http", "maxHeaderSize")
  @js.native
  val maxHeaderSize: Double = js.native
  
  @JSImport("node:http", "request")
  @js.native
  def request(options: java.lang.String): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "request")
  @js.native
  def request(
    options: java.lang.String,
    callback: js.Function1[/* res */ tmttyped.node.httpMod.IncomingMessage, Unit]
  ): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "request")
  @js.native
  def request(options: RequestOptions): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "request")
  @js.native
  def request(
    options: RequestOptions,
    callback: js.Function1[/* res */ tmttyped.node.httpMod.IncomingMessage, Unit]
  ): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "request")
  @js.native
  def request(options: URL): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "request")
  @js.native
  def request(options: URL, callback: js.Function1[/* res */ tmttyped.node.httpMod.IncomingMessage, Unit]): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "request")
  @js.native
  def request(url: java.lang.String, options: RequestOptions): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "request")
  @js.native
  def request(
    url: java.lang.String,
    options: RequestOptions,
    callback: js.Function1[/* res */ tmttyped.node.httpMod.IncomingMessage, Unit]
  ): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "request")
  @js.native
  def request(url: URL, options: RequestOptions): tmttyped.node.httpMod.ClientRequest = js.native
  @JSImport("node:http", "request")
  @js.native
  def request(
    url: URL,
    options: RequestOptions,
    callback: js.Function1[/* res */ tmttyped.node.httpMod.IncomingMessage, Unit]
  ): tmttyped.node.httpMod.ClientRequest = js.native
}

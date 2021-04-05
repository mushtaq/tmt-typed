package tmttyped.node.http2Mod

import tmttyped.node.BufferEncoding
import tmttyped.node.httpMod.OutgoingHttpHeaders
import tmttyped.node.nodeNetMod.Socket
import tmttyped.node.nodeStreamMod.Readable
import tmttyped.node.nodeStreamMod.Writable
import tmttyped.node.nodeStrings._empty
import tmttyped.node.nodeStrings.pipe
import tmttyped.node.nodeStrings.unpipe
import tmttyped.node.nodeTlsMod.TLSSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http2", "Http2ServerResponse")
@js.native
class Http2ServerResponse protected () extends Writable {
  def this(stream: ServerHttp2Stream) = this()
  
  def addTrailers(trailers: OutgoingHttpHeaders): Unit = js.native
  
  val connection: Socket | TLSSocket = js.native
  
  def createPushResponse(
    headers: OutgoingHttpHeaders,
    callback: js.Function2[/* err */ js.Error | Null, /* res */ this.type, Unit]
  ): Unit = js.native
  
  @JSName("emit")
  def emit_pipe(event: pipe, src: Readable): Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
  
  def end(data: js.typedarray.Uint8Array, encoding: BufferEncoding): Unit = js.native
  def end(data: js.typedarray.Uint8Array, encoding: BufferEncoding, callback: js.Function0[Unit]): Unit = js.native
  
  val finished: Boolean = js.native
  
  def getHeader(name: String): String = js.native
  
  def getHeaderNames(): js.Array[String] = js.native
  
  def getHeaders(): OutgoingHttpHeaders = js.native
  
  def hasHeader(name: String): Boolean = js.native
  
  val headersSent: Boolean = js.native
  
  def removeHeader(name: String): Unit = js.native
  
  var sendDate: Boolean = js.native
  
  def setHeader(name: String, value: String): Unit = js.native
  def setHeader(name: String, value: js.Array[String]): Unit = js.native
  def setHeader(name: String, value: Double): Unit = js.native
  
  def setTimeout(msecs: Double): Unit = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): Unit = js.native
  
  val socket: Socket | TLSSocket = js.native
  
  var statusCode: Double = js.native
  
  var statusMessage: _empty = js.native
  
  val stream: ServerHttp2Stream = js.native
  
  def write(chunk: js.typedarray.Uint8Array, encoding: BufferEncoding): Boolean = js.native
  def write(
    chunk: js.typedarray.Uint8Array,
    encoding: BufferEncoding,
    callback: js.Function1[/* err */ js.Error, Unit]
  ): Boolean = js.native
  
  def writeContinue(): Unit = js.native
  
  def writeHead(statusCode: Double): this.type = js.native
  def writeHead(statusCode: Double, headers: OutgoingHttpHeaders): this.type = js.native
  def writeHead(statusCode: Double, statusMessage: String): this.type = js.native
  def writeHead(statusCode: Double, statusMessage: String, headers: OutgoingHttpHeaders): this.type = js.native
}

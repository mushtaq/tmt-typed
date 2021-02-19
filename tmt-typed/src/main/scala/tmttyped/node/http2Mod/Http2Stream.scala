package tmttyped.node.http2Mod

import tmttyped.node.Buffer
import tmttyped.node.httpMod.OutgoingHttpHeaders
import tmttyped.node.nodeStreamMod.Duplex
import tmttyped.node.nodeStreamMod.Readable
import tmttyped.node.nodeStrings.data
import tmttyped.node.nodeStrings.frameError
import tmttyped.node.nodeStrings.pipe
import tmttyped.node.nodeStrings.streamClosed
import tmttyped.node.nodeStrings.timeout
import tmttyped.node.nodeStrings.trailers
import tmttyped.node.nodeStrings.unpipe
import tmttyped.node.nodeStrings.wantTrailers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Http2Stream extends Duplex {
  
  val aborted: Boolean = js.native
  
  @JSName("addListener")
  def addListener_aborted(event: tmttyped.node.nodeStrings.aborted, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_frameError(event: frameError, listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_streamClosed(event: streamClosed, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_trailers(
    event: trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_wantTrailers(event: wantTrailers, listener: js.Function0[Unit]): this.type = js.native
  
  val bufferSize: Double = js.native
  
  def close(): Unit = js.native
  def close(code: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, callback: js.Function0[Unit]): Unit = js.native
  
  val closed: Boolean = js.native
  
  @JSName("emit")
  def emit_aborted(event: tmttyped.node.nodeStrings.aborted): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: String): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: Buffer): Boolean = js.native
  @JSName("emit")
  def emit_frameError(event: frameError, frameType: Double, errorCode: Double): Boolean = js.native
  @JSName("emit")
  def emit_pipe(event: pipe, src: Readable): Boolean = js.native
  @JSName("emit")
  def emit_streamClosed(event: streamClosed, code: Double): Boolean = js.native
  @JSName("emit")
  def emit_timeout(event: timeout): Boolean = js.native
  @JSName("emit")
  def emit_trailers(event: trailers, trailers: IncomingHttpHeaders, flags: Double): Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
  @JSName("emit")
  def emit_wantTrailers(event: wantTrailers): Boolean = js.native
  
  /**
    * Set the true if the END_STREAM flag was set in the request or response HEADERS frame received,
    * indicating that no additional data should be received and the readable side of the Http2Stream will be closed.
    */
  val endAfterHeaders: Boolean = js.native
  
  val id: js.UndefOr[Double] = js.native
  
  @JSName("on")
  def on_aborted(event: tmttyped.node.nodeStrings.aborted, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_frameError(event: frameError, listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_streamClosed(event: streamClosed, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_trailers(
    event: trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_wantTrailers(event: wantTrailers, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_aborted(event: tmttyped.node.nodeStrings.aborted, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_frameError(event: frameError, listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_streamClosed(event: streamClosed, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_trailers(
    event: trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_wantTrailers(event: wantTrailers, listener: js.Function0[Unit]): this.type = js.native
  
  val pending: Boolean = js.native
  
  @JSName("prependListener")
  def prependListener_aborted(event: tmttyped.node.nodeStrings.aborted, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_frameError(event: frameError, listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_streamClosed(event: streamClosed, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_trailers(
    event: trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_wantTrailers(event: wantTrailers, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_aborted(event: tmttyped.node.nodeStrings.aborted, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_frameError(event: frameError, listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_streamClosed(event: streamClosed, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_trailers(
    event: trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_wantTrailers(event: wantTrailers, listener: js.Function0[Unit]): this.type = js.native
  
  def priority(options: StreamPriorityOptions): Unit = js.native
  
  val rstCode: Double = js.native
  
  def sendTrailers(headers: OutgoingHttpHeaders): Unit = js.native
  
  val sentHeaders: OutgoingHttpHeaders = js.native
  
  val sentInfoHeaders: js.UndefOr[js.Array[OutgoingHttpHeaders]] = js.native
  
  val sentTrailers: js.UndefOr[OutgoingHttpHeaders] = js.native
  
  val session: Http2Session = js.native
  
  def setTimeout(msecs: Double): Unit = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): Unit = js.native
  
  val state: StreamState = js.native
}

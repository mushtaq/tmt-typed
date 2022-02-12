package tmttyped.rsocketWebsocketClient

import org.scalajs.dom.WebSocket
import tmttyped.rsocketCore.rsocketencodingMod.Encoders
import tmttyped.rsocketFlowable.mod.Flowable
import tmttyped.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import tmttyped.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import tmttyped.rsocketTypes.reactiveSocketTypesMod.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketwebsocketclientMod {
  
  @JSImport("rsocket-websocket-client/RSocketWebSocketClient", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with RSocketWebSocketClient {
    def this(options: ClientOptions) = this()
    def this(options: ClientOptions, encoders: Encoders[Any]) = this()
    
    /**
      * Close the underlying connection, emitting `onComplete` on the receive()
      * Publisher.
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Open the underlying connection. Throws if the connection is already in
      * the CLOSED or ERROR state.
      */
    /* CompleteClass */
    override def connect(): Unit = js.native
    
    /**
      * Returns a Flowable that immediately publishes the current connection
      * status and thereafter updates as it changes. Once a connection is in
      * the CLOSED or ERROR state, it may not be connected again.
      * Implementations must publish values per the comments on ConnectionStatus.
      */
    /* CompleteClass */
    override def connectionStatus(): Flowable[ConnectionStatus] = js.native
    
    /**
      * Returns a stream of all `Frame`s received on this connection.
      *
      * Notes:
      * - Implementations must call `onComplete` if the underlying connection is
      *   closed by the peer or by calling `close()`.
      * - Implementations must call `onError` if there are any errors
      *   sending/receiving frames.
      * - Implemenations may optionally support multi-cast receivers. Those that do
      *   not should throw if `receive` is called more than once.
      */
    /* CompleteClass */
    override def receive(): Flowable[Frame] = js.native
    
    /**
      * Send all the `input` frames on this connection.
      *
      * Notes:
      * - Implementations must not cancel the subscription.
      * - Implementations must signal any errors by calling `onError` on the
      *   `receive()` Publisher.
      */
    /* CompleteClass */
    override def send(input: Flowable[Frame]): Unit = js.native
    
    /**
      * Send a single frame on the connection.
      */
    /* CompleteClass */
    override def sendOne(frame: Frame): Unit = js.native
  }
  
  trait ClientOptions extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var lengthPrefixedFrames: js.UndefOr[Boolean] = js.undefined
    
    var url: String
    
    var wsCreator: js.UndefOr[js.Function1[/* url */ String, WebSocket]] = js.undefined
  }
  object ClientOptions {
    
    @scala.inline
    def apply(url: String): ClientOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setLengthPrefixedFrames(value: Boolean): Self = StObject.set(x, "lengthPrefixedFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthPrefixedFramesUndefined: Self = StObject.set(x, "lengthPrefixedFrames", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsCreator(value: /* url */ String => WebSocket): Self = StObject.set(x, "wsCreator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWsCreatorUndefined: Self = StObject.set(x, "wsCreator", js.undefined)
    }
  }
  
  trait RSocketWebSocketClient
    extends StObject
       with DuplexConnection
  object RSocketWebSocketClient {
    
    @scala.inline
    def apply(
      close: () => Unit,
      connect: () => Unit,
      connectionStatus: () => Flowable[ConnectionStatus],
      receive: () => Flowable[Frame],
      send: Flowable[Frame] => Unit,
      sendOne: Frame => Unit
    ): RSocketWebSocketClient = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect), connectionStatus = js.Any.fromFunction0(connectionStatus), receive = js.Any.fromFunction0(receive), send = js.Any.fromFunction1(send), sendOne = js.Any.fromFunction1(sendOne))
      __obj.asInstanceOf[RSocketWebSocketClient]
    }
  }
}

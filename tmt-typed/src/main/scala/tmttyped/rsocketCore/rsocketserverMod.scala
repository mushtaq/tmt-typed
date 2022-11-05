package tmttyped.rsocketCore

import tmttyped.rsocketCore.rsocketleaseMod.Leases
import tmttyped.rsocketCore.rsocketserializationMod.PayloadSerializers
import tmttyped.rsocketFlowable.mod.Flowable
import tmttyped.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import tmttyped.rsocketTypes.reactiveSocketTypesMod.Payload
import tmttyped.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import tmttyped.rsocketTypes.reactiveSocketTypesMod.Responder
import tmttyped.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketserverMod {
  
  @JSImport("rsocket-core/RSocketServer", JSImport.Default)
  @js.native
  open class default[D, M] protected ()
    extends StObject
       with RSocketServer[D, M] {
    def this(config: ServerConfig[D, M]) = this()
    
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  trait RSocketServer[D, M] extends StObject {
    
    def start(): Unit
    
    def stop(): Unit
  }
  object RSocketServer {
    
    inline def apply[D, M](start: () => Unit, stop: () => Unit): RSocketServer[D, M] = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[RSocketServer[D, M]]
    }
    
    extension [Self <: RSocketServer[?, ?], D, M](x: Self & (RSocketServer[D, M])) {
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait ServerConfig[D, M] extends StObject {
    
    var errorHandler: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
    
    def getRequestHandler(socket: ReactiveSocket[D, M], payload: Payload[D, M]): Partial[Responder[D, M]]
    
    var leases: js.UndefOr[js.Function0[Leases[Any]]] = js.undefined
    
    var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.undefined
    
    var transport: TransportServer
  }
  object ServerConfig {
    
    inline def apply[D, M](
      getRequestHandler: (ReactiveSocket[D, M], Payload[D, M]) => Partial[Responder[D, M]],
      transport: TransportServer
    ): ServerConfig[D, M] = {
      val __obj = js.Dynamic.literal(getRequestHandler = js.Any.fromFunction2(getRequestHandler), transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerConfig[D, M]]
    }
    
    extension [Self <: ServerConfig[?, ?], D, M](x: Self & (ServerConfig[D, M])) {
      
      inline def setErrorHandler(value: /* e */ js.Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setGetRequestHandler(value: (ReactiveSocket[D, M], Payload[D, M]) => Partial[Responder[D, M]]): Self = StObject.set(x, "getRequestHandler", js.Any.fromFunction2(value))
      
      inline def setLeases(value: () => Leases[Any]): Self = StObject.set(x, "leases", js.Any.fromFunction0(value))
      
      inline def setLeasesUndefined: Self = StObject.set(x, "leases", js.undefined)
      
      inline def setSerializers(value: PayloadSerializers[D, M]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      inline def setTransport(value: TransportServer): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransportServer extends StObject {
    
    def start(): Flowable[DuplexConnection]
    
    def stop(): Unit
  }
  object TransportServer {
    
    inline def apply(start: () => Flowable[DuplexConnection], stop: () => Unit): TransportServer = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[TransportServer]
    }
    
    extension [Self <: TransportServer](x: Self) {
      
      inline def setStart(value: () => Flowable[DuplexConnection]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}

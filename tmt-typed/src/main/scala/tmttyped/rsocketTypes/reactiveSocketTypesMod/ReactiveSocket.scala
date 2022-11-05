package tmttyped.rsocketTypes.reactiveSocketTypesMod

import tmttyped.rsocketFlowable.mod.Flowable
import tmttyped.rsocketFlowable.mod.Single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactiveSocket[D, M]
  extends StObject
     with Responder[D, M] {
  
  /**
    * Returns positive number representing the availability of RSocket requester. Higher is better, 0.0
    * means not available.
    */
  def availability(): Double
  
  /**
    * Close this `ReactiveSocket` and the underlying transport connection.
    */
  def close(): Unit
  
  /**
    * Returns a Flowable that immediately publishes the current connection
    * status and thereafter updates as it changes. Once a connection is in
    * the CLOSED or ERROR state, it may not be connected again.
    * Implementations must publish values per the comments on ConnectionStatus.
    */
  def connectionStatus(): Flowable[ConnectionStatus]
}
object ReactiveSocket {
  
  inline def apply[D, M](
    availability: () => Double,
    close: () => Unit,
    connectionStatus: () => Flowable[ConnectionStatus],
    fireAndForget: Payload[D, M] => Unit,
    metadataPush: Payload[D, M] => Single[Unit],
    requestChannel: Flowable[Payload[D, M]] => Flowable[Payload[D, M]],
    requestResponse: Payload[D, M] => Single[Payload[D, M]],
    requestStream: Payload[D, M] => Flowable[Payload[D, M]]
  ): ReactiveSocket[D, M] = {
    val __obj = js.Dynamic.literal(availability = js.Any.fromFunction0(availability), close = js.Any.fromFunction0(close), connectionStatus = js.Any.fromFunction0(connectionStatus), fireAndForget = js.Any.fromFunction1(fireAndForget), metadataPush = js.Any.fromFunction1(metadataPush), requestChannel = js.Any.fromFunction1(requestChannel), requestResponse = js.Any.fromFunction1(requestResponse), requestStream = js.Any.fromFunction1(requestStream))
    __obj.asInstanceOf[ReactiveSocket[D, M]]
  }
  
  extension [Self <: ReactiveSocket[?, ?], D, M](x: Self & (ReactiveSocket[D, M])) {
    
    inline def setAvailability(value: () => Double): Self = StObject.set(x, "availability", js.Any.fromFunction0(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setConnectionStatus(value: () => Flowable[ConnectionStatus]): Self = StObject.set(x, "connectionStatus", js.Any.fromFunction0(value))
  }
}

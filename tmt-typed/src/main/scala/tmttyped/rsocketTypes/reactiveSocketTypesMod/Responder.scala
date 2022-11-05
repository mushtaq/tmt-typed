package tmttyped.rsocketTypes.reactiveSocketTypesMod

import tmttyped.rsocketFlowable.mod.Flowable
import tmttyped.rsocketFlowable.mod.Single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responder[D, M] extends StObject {
  
  /**
    * Fire and Forget interaction model of `ReactiveSocket`. The returned
    * Publisher resolves when the passed `payload` is successfully handled.
    */
  def fireAndForget(payload: Payload[D, M]): Unit
  
  /**
    * Metadata-Push interaction model of `ReactiveSocket`. The returned Publisher
    * resolves when the passed `payload` is successfully handled.
    */
  def metadataPush(payload: Payload[D, M]): Single[Unit]
  
  /**
    * Request-Channel interaction model of `ReactiveSocket`. The returned
    * Publisher returns values representing the response(s).
    */
  def requestChannel(payloads: Flowable[Payload[D, M]]): Flowable[Payload[D, M]]
  
  /**
    * Request-Response interaction model of `ReactiveSocket`. The returned
    * Publisher resolves with the response.
    */
  def requestResponse(payload: Payload[D, M]): Single[Payload[D, M]]
  
  /**
    * Request-Stream interaction model of `ReactiveSocket`. The returned
    * Publisher returns values representing the response(s).
    */
  def requestStream(payload: Payload[D, M]): Flowable[Payload[D, M]]
}
object Responder {
  
  inline def apply[D, M](
    fireAndForget: Payload[D, M] => Unit,
    metadataPush: Payload[D, M] => Single[Unit],
    requestChannel: Flowable[Payload[D, M]] => Flowable[Payload[D, M]],
    requestResponse: Payload[D, M] => Single[Payload[D, M]],
    requestStream: Payload[D, M] => Flowable[Payload[D, M]]
  ): Responder[D, M] = {
    val __obj = js.Dynamic.literal(fireAndForget = js.Any.fromFunction1(fireAndForget), metadataPush = js.Any.fromFunction1(metadataPush), requestChannel = js.Any.fromFunction1(requestChannel), requestResponse = js.Any.fromFunction1(requestResponse), requestStream = js.Any.fromFunction1(requestStream))
    __obj.asInstanceOf[Responder[D, M]]
  }
  
  extension [Self <: Responder[?, ?], D, M](x: Self & (Responder[D, M])) {
    
    inline def setFireAndForget(value: Payload[D, M] => Unit): Self = StObject.set(x, "fireAndForget", js.Any.fromFunction1(value))
    
    inline def setMetadataPush(value: Payload[D, M] => Single[Unit]): Self = StObject.set(x, "metadataPush", js.Any.fromFunction1(value))
    
    inline def setRequestChannel(value: Flowable[Payload[D, M]] => Flowable[Payload[D, M]]): Self = StObject.set(x, "requestChannel", js.Any.fromFunction1(value))
    
    inline def setRequestResponse(value: Payload[D, M] => Single[Payload[D, M]]): Self = StObject.set(x, "requestResponse", js.Any.fromFunction1(value))
    
    inline def setRequestStream(value: Payload[D, M] => Flowable[Payload[D, M]]): Self = StObject.set(x, "requestStream", js.Any.fromFunction1(value))
  }
}

package tmttyped.rsocketCore

import tmttyped.rsocketCore.rsocketframeMod.ErrorSource
import tmttyped.rsocketTypes.reactiveSocketTypesMod.Frame
import tmttyped.rsocketTypes.reactiveSocketTypesMod.Payload
import tmttyped.rsocketTypes.reactiveStreamTypesMod.ISubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DataMimeType[D, M] extends StObject {
    
    var dataMimeType: String
    
    var keepAlive: Double
    
    var lifetime: Double
    
    var metadataMimeType: String
    
    var payload: js.UndefOr[Payload[D, M]] = js.undefined
  }
  object DataMimeType {
    
    @scala.inline
    def apply[D, M](dataMimeType: String, keepAlive: Double, lifetime: Double, metadataMimeType: String): DataMimeType[D, M] = {
      val __obj = js.Dynamic.literal(dataMimeType = dataMimeType.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataMimeType[D, M]]
    }
    
    @scala.inline
    implicit class DataMimeTypeMutableBuilder[Self <: DataMimeType[_, _], D, M] (val x: Self with (DataMimeType[D, M])) extends AnyVal {
      
      @scala.inline
      def setDataMimeType(value: String): Self = StObject.set(x, "dataMimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAlive(value: Double): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifetime(value: Double): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataMimeType(value: String): Self = StObject.set(x, "metadataMimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: Payload[D, M]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  /* Inlined std.Error & {  source :rsocket-core.rsocket-core/RSocketFrame.ErrorSource} */
  trait ErrorsourceErrorSource extends StObject {
    
    var message: String
    
    var name: String
    
    var source: ErrorSource
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object ErrorsourceErrorSource {
    
    @scala.inline
    def apply(message: String, name: String, source: ErrorSource): ErrorsourceErrorSource = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorsourceErrorSource]
    }
    
    @scala.inline
    implicit class ErrorsourceErrorSourceMutableBuilder[Self <: ErrorsourceErrorSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: ErrorSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rsocket-types.rsocket-types.ISubscriber<rsocket-types.rsocket-types.Frame>> */
  trait PartialISubscriberFrame extends StObject {
    
    var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var onNext: js.UndefOr[js.Function1[/* value */ Frame, Unit]] = js.undefined
    
    var onSubscribe: js.UndefOr[js.Function1[/* subscription */ ISubscription, Unit]] = js.undefined
  }
  object PartialISubscriberFrame {
    
    @scala.inline
    def apply(): PartialISubscriberFrame = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialISubscriberFrame]
    }
    
    @scala.inline
    implicit class PartialISubscriberFrameMutableBuilder[Self <: PartialISubscriberFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnNext(value: /* value */ Frame => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      @scala.inline
      def setOnSubscribe(value: /* subscription */ ISubscription => Unit): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubscribeUndefined: Self = StObject.set(x, "onSubscribe", js.undefined)
    }
  }
}

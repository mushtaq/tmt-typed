package tmttyped.microsoftFetchEventSource

import org.scalajs.dom.Response
import tmttyped.microsoftFetchEventSource.anon.FnCall
import tmttyped.microsoftFetchEventSource.parseMod.EventSourceMessage
import tmttyped.std.Record
import tmttyped.std.RequestInfo
import tmttyped.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchMod {
  
  @JSImport("@microsoft/fetch-event-source/lib/cjs/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@microsoft/fetch-event-source/lib/cjs/fetch", "EventStreamContentType")
  @js.native
  val EventStreamContentType: /* "text/event-stream" */ String = js.native
  
  @scala.inline
  def fetchEventSource(
    input: RequestInfo,
    hasInputSignalInputHeadersInputOnOpenOnmessageOncloseOnerrorOpenWhenHiddenInputFetchRest: FetchEventSourceInit
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchEventSource")(input.asInstanceOf[js.Any], hasInputSignalInputHeadersInputOnOpenOnmessageOncloseOnerrorOpenWhenHiddenInputFetchRest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait FetchEventSourceInit
    extends StObject
       with RequestInit {
    
    var fetch: js.UndefOr[FnCall] = js.undefined
    
    @JSName("headers")
    var headers_FetchEventSourceInit: js.UndefOr[Record[String, String]] = js.undefined
    
    var onclose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onerror: js.UndefOr[js.Function1[/* err */ Any, js.UndefOr[Double | Null | Unit]]] = js.undefined
    
    var onmessage: js.UndefOr[js.Function1[/* ev */ EventSourceMessage, Unit]] = js.undefined
    
    var onopen: js.UndefOr[js.Function1[/* response */ Response, js.Promise[Unit]]] = js.undefined
    
    var openWhenHidden: js.UndefOr[Boolean] = js.undefined
  }
  object FetchEventSourceInit {
    
    @scala.inline
    def apply(): FetchEventSourceInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchEventSourceInit]
    }
    
    @scala.inline
    implicit class FetchEventSourceInitMutableBuilder[Self <: FetchEventSourceInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setOnclose(value: () => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      @scala.inline
      def setOnerror(value: /* err */ Any => js.UndefOr[Double | Null | Unit]): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      @scala.inline
      def setOnmessage(value: /* ev */ EventSourceMessage => Unit): Self = StObject.set(x, "onmessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnmessageUndefined: Self = StObject.set(x, "onmessage", js.undefined)
      
      @scala.inline
      def setOnopen(value: /* response */ Response => js.Promise[Unit]): Self = StObject.set(x, "onopen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnopenUndefined: Self = StObject.set(x, "onopen", js.undefined)
      
      @scala.inline
      def setOpenWhenHidden(value: Boolean): Self = StObject.set(x, "openWhenHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenWhenHiddenUndefined: Self = StObject.set(x, "openWhenHidden", js.undefined)
    }
  }
}

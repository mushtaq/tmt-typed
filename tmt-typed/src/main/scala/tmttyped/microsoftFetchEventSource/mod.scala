package tmttyped.microsoftFetchEventSource

import tmttyped.microsoftFetchEventSource.fetchMod.FetchEventSourceInit
import tmttyped.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@microsoft/fetch-event-source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@microsoft/fetch-event-source", "EventStreamContentType")
  @js.native
  val EventStreamContentType: /* "text/event-stream" */ String = js.native
  
  @scala.inline
  def fetchEventSource(
    input: RequestInfo,
    hasSignalHeadersOnopenOnmessageOncloseOnerrorOpenWhenHiddenFetchRest: FetchEventSourceInit
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchEventSource")(input.asInstanceOf[js.Any], hasSignalHeadersOnopenOnmessageOncloseOnerrorOpenWhenHiddenFetchRest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}

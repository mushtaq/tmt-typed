package tmttyped.microsoftFetchEventSource

import tmttyped.microsoftFetchEventSource.fetchMod.FetchEventSourceInit
import tmttyped.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@microsoft/fetch-event-source", "EventStreamContentType")
  @js.native
  val EventStreamContentType: /* "text/event-stream" */ String = js.native
  
  @JSImport("@microsoft/fetch-event-source", "fetchEventSource")
  @js.native
  def fetchEventSource(
    input: RequestInfo,
    hasSignalHeadersOnopenOnmessageOncloseOnerrorOpenWhenHiddenFetchRest: FetchEventSourceInit
  ): js.Promise[Unit] = js.native
}

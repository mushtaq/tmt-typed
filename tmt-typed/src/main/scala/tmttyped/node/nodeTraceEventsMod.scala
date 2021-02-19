package tmttyped.node

import tmttyped.node.traceEventsMod.CreateTracingOptions
import tmttyped.node.traceEventsMod.Tracing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeTraceEventsMod {
  
  /**
    * Creates and returns a Tracing object for the given set of categories.
    */
  @JSImport("node:trace_events", "createTracing")
  @js.native
  def createTracing(options: CreateTracingOptions): Tracing = js.native
  
  /**
    * Returns a comma-separated list of all currently-enabled trace event
    * categories. The current set of enabled trace event categories is
    * determined by the union of all currently-enabled `Tracing` objects and
    * any categories enabled using the `--trace-event-categories` flag.
    */
  @JSImport("node:trace_events", "getEnabledCategories")
  @js.native
  def getEnabledCategories(): js.UndefOr[java.lang.String] = js.native
}

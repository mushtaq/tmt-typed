package tmttyped.node

import tmttyped.node.traceEventsMod.CreateTracingOptions
import tmttyped.node.traceEventsMod.Tracing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeTraceEventsMod {
  
  @JSImport("node:trace_events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a Tracing object for the given set of categories.
    */
  @scala.inline
  def createTracing(options: CreateTracingOptions): Tracing = ^.asInstanceOf[js.Dynamic].applyDynamic("createTracing")(options.asInstanceOf[js.Any]).asInstanceOf[Tracing]
  
  /**
    * Returns a comma-separated list of all currently-enabled trace event
    * categories. The current set of enabled trace event categories is
    * determined by the union of all currently-enabled `Tracing` objects and
    * any categories enabled using the `--trace-event-categories` flag.
    */
  @scala.inline
  def getEnabledCategories(): js.UndefOr[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnabledCategories")().asInstanceOf[js.UndefOr[java.lang.String]]
}

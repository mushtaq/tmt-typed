package tmttyped.node

import tmttyped.node.perfHooksMod.EventLoopDelayMonitor
import tmttyped.node.perfHooksMod.EventLoopMonitorOptions
import tmttyped.node.perfHooksMod.PerformanceObserverCallback
import tmttyped.node.perfHooksMod.Performance_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodePerfHooksMod {
  
  @JSImport("node:perf_hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:perf_hooks", "PerformanceObserver")
  @js.native
  class PerformanceObserver protected ()
    extends tmttyped.node.perfHooksMod.PerformanceObserver {
    def this(callback: PerformanceObserverCallback) = this()
  }
  
  object constants {
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_ALL_AVAILABLE_GARBAGE")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_ALL_AVAILABLE_GARBAGE: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_ALL_EXTERNAL_MEMORY")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_ALL_EXTERNAL_MEMORY: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_CONSTRUCT_RETAINED")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_CONSTRUCT_RETAINED: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_FORCED")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_FORCED: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_NO")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_NO: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_SCHEDULE_IDLE")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_SCHEDULE_IDLE: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_SYNCHRONOUS_PHANTOM_PROCESSING")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_SYNCHRONOUS_PHANTOM_PROCESSING: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_INCREMENTAL")
    @js.native
    val NODE_PERFORMANCE_GC_INCREMENTAL: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_MAJOR")
    @js.native
    val NODE_PERFORMANCE_GC_MAJOR: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_MINOR")
    @js.native
    val NODE_PERFORMANCE_GC_MINOR: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_WEAKCB")
    @js.native
    val NODE_PERFORMANCE_GC_WEAKCB: Double = js.native
  }
  
  @scala.inline
  def monitorEventLoopDelay(): EventLoopDelayMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorEventLoopDelay")().asInstanceOf[EventLoopDelayMonitor]
  @scala.inline
  def monitorEventLoopDelay(options: EventLoopMonitorOptions): EventLoopDelayMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorEventLoopDelay")(options.asInstanceOf[js.Any]).asInstanceOf[EventLoopDelayMonitor]
  
  @JSImport("node:perf_hooks", "performance")
  @js.native
  val performance: Performance_ = js.native
}

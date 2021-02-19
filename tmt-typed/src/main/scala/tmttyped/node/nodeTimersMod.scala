package tmttyped.node

import tmttyped.node.NodeJS.Immediate
import tmttyped.node.NodeJS.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeTimersMod {
  
  @JSImport("node:timers", "clearImmediate")
  @js.native
  def clearImmediate(immediateId: Immediate): Unit = js.native
  
  @JSImport("node:timers", "clearInterval")
  @js.native
  def clearInterval(intervalId: Timeout): Unit = js.native
  
  @JSImport("node:timers", "clearTimeout")
  @js.native
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  
  @JSImport("node:timers", "setImmediate")
  @js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  
  @JSImport("node:timers", "setInterval")
  @js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  
  @JSImport("node:timers", "setTimeout")
  @js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
}

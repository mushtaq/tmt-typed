package tmttyped.node

import tmttyped.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeDomainMod {
  
  @JSImport("node:domain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The `Domain` class encapsulates the functionality of routing errors and
    * uncaught exceptions to the active `Domain` object.
    *
    * To handle the errors that it catches, listen to its `'error'` event.
    */
  @JSImport("node:domain", "Domain")
  @js.native
  open class Domain () extends StObject {
    def this(options: EventEmitterOptions) = this()
  }
  
  inline def create(): tmttyped.node.domainMod.Domain = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[tmttyped.node.domainMod.Domain]
}

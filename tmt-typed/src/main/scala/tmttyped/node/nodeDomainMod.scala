package tmttyped.node

import tmttyped.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeDomainMod {
  
  @JSImport("node:domain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:domain", "Domain")
  @js.native
  class Domain ()
    extends tmttyped.node.domainMod.Domain {
    def this(options: EventEmitterOptions) = this()
  }
  
  @scala.inline
  def create(): tmttyped.node.domainMod.Domain = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[tmttyped.node.domainMod.Domain]
}

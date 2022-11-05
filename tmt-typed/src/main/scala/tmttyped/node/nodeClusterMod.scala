package tmttyped.node

import org.scalablytyped.runtime.Shortcut
import tmttyped.node.clusterMod.Cluster
import tmttyped.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeClusterMod extends Shortcut {
  
  @JSImport("node:cluster", JSImport.Default)
  @js.native
  val default: Cluster = js.native
  
  @JSImport("node:cluster", "Worker")
  @js.native
  open class Worker () extends StObject {
    def this(options: EventEmitterOptions) = this()
  }
  
  type _To = Cluster
  
  /* This means you don't have to write `default`, but can instead just say `nodeClusterMod.foo` */
  override def _to: Cluster = default
}

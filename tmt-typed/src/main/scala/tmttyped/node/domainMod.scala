package tmttyped.node

import tmttyped.node.NodeJS.Timer
import tmttyped.node.eventsMod.EventEmitterOptions
import tmttyped.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainMod {
  
  @JSImport("domain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("domain", "Domain")
  @js.native
  class Domain ()
    extends tmttyped.node.nodeEventsMod.^
       with tmttyped.node.domainMod.global.NodeJS.Domain {
    def this(options: EventEmitterOptions) = this()
    
    def enter(): Unit = js.native
    
    def exit(): Unit = js.native
    
    var members: js.Array[tmttyped.node.nodeEventsMod.^ | Timer] = js.native
  }
  
  @scala.inline
  def create(): Domain = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Domain]
  
  object global {
    
    object NodeJS {
      
      @js.native
      trait Domain extends EventEmitter {
        
        def add(emitter: Timer): Unit = js.native
        def add(emitter: EventEmitter): Unit = js.native
        
        def bind[T /* <: js.Function */](cb: T): T = js.native
        
        def intercept[T /* <: js.Function */](cb: T): T = js.native
        
        def remove(emitter: Timer): Unit = js.native
        def remove(emitter: EventEmitter): Unit = js.native
        
        def run[T](fn: js.Function1[/* repeated */ js.Any, T], args: js.Any*): T = js.native
      }
    }
  }
}

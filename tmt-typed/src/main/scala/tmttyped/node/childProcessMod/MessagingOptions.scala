package tmttyped.node.childProcessMod

import tmttyped.node.eventsMod.Abortable
import tmttyped.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingOptions
  extends StObject
     with Abortable {
  
  /**
    * The signal value to be used when the spawned process will be killed by the abort signal.
    * @default 'SIGTERM'
    */
  var killSignal: js.UndefOr[Signals | Double] = js.undefined
  
  /**
    * Specify the kind of serialization used for sending messages between processes.
    * @default 'json'
    */
  var serialization: js.UndefOr[SerializationType] = js.undefined
  
  /**
    * In milliseconds the maximum amount of time the process is allowed to run.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object MessagingOptions {
  
  @scala.inline
  def apply(): MessagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingOptions]
  }
  
  @scala.inline
  implicit class MessagingOptionsMutableBuilder[Self <: MessagingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    @scala.inline
    def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}

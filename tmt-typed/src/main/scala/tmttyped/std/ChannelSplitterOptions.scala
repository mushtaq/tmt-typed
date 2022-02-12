package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelSplitterOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard DOM */
  var numberOfOutputs: js.UndefOr[Double] = js.undefined
}
object ChannelSplitterOptions {
  
  @scala.inline
  def apply(): ChannelSplitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSplitterOptions]
  }
  
  @scala.inline
  implicit class ChannelSplitterOptionsMutableBuilder[Self <: ChannelSplitterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberOfOutputs(value: Double): Self = StObject.set(x, "numberOfOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfOutputsUndefined: Self = StObject.set(x, "numberOfOutputs", js.undefined)
  }
}

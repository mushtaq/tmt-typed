package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputEventInit
  extends StObject
     with UIEventInit {
  
  /* standard DOM */
  var data: js.UndefOr[java.lang.String | Null] = js.undefined
  
  /* standard DOM */
  var dataTransfer: js.UndefOr[org.scalajs.dom.DataTransfer | Null] = js.undefined
  
  /* standard DOM */
  var inputType: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var isComposing: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard DOM */
  var targetRanges: js.UndefOr[js.Array[StaticRange]] = js.undefined
}
object InputEventInit {
  
  @scala.inline
  def apply(): InputEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputEventInit]
  }
  
  @scala.inline
  implicit class InputEventInitMutableBuilder[Self <: InputEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: java.lang.String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataTransfer(value: org.scalajs.dom.DataTransfer): Self = StObject.set(x, "dataTransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransferNull: Self = StObject.set(x, "dataTransfer", null)
    
    @scala.inline
    def setDataTransferUndefined: Self = StObject.set(x, "dataTransfer", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setInputType(value: java.lang.String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    @scala.inline
    def setIsComposing(value: scala.Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComposingUndefined: Self = StObject.set(x, "isComposing", js.undefined)
    
    @scala.inline
    def setTargetRanges(value: js.Array[StaticRange]): Self = StObject.set(x, "targetRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRangesUndefined: Self = StObject.set(x, "targetRanges", js.undefined)
    
    @scala.inline
    def setTargetRangesVarargs(value: StaticRange*): Self = StObject.set(x, "targetRanges", js.Array(value :_*))
  }
}

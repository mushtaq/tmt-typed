package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerEventInit
  extends StObject
     with MouseEventInit {
  
  /* standard DOM */
  var coalescedEvents: js.UndefOr[js.Array[org.scalajs.dom.PointerEvent]] = js.undefined
  
  /* standard DOM */
  var height: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var isPrimary: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard DOM */
  var pointerId: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var pointerType: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var predictedEvents: js.UndefOr[js.Array[org.scalajs.dom.PointerEvent]] = js.undefined
  
  /* standard DOM */
  var pressure: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var tangentialPressure: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var tiltX: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var tiltY: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var twist: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var width: js.UndefOr[Double] = js.undefined
}
object PointerEventInit {
  
  @scala.inline
  def apply(): PointerEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointerEventInit]
  }
  
  @scala.inline
  implicit class PointerEventInitMutableBuilder[Self <: PointerEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoalescedEvents(value: js.Array[org.scalajs.dom.PointerEvent]): Self = StObject.set(x, "coalescedEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoalescedEventsUndefined: Self = StObject.set(x, "coalescedEvents", js.undefined)
    
    @scala.inline
    def setCoalescedEventsVarargs(value: org.scalajs.dom.PointerEvent*): Self = StObject.set(x, "coalescedEvents", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIsPrimary(value: scala.Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
    
    @scala.inline
    def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerIdUndefined: Self = StObject.set(x, "pointerId", js.undefined)
    
    @scala.inline
    def setPointerType(value: java.lang.String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
    
    @scala.inline
    def setPredictedEvents(value: js.Array[org.scalajs.dom.PointerEvent]): Self = StObject.set(x, "predictedEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictedEventsUndefined: Self = StObject.set(x, "predictedEvents", js.undefined)
    
    @scala.inline
    def setPredictedEventsVarargs(value: org.scalajs.dom.PointerEvent*): Self = StObject.set(x, "predictedEvents", js.Array(value :_*))
    
    @scala.inline
    def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressureUndefined: Self = StObject.set(x, "pressure", js.undefined)
    
    @scala.inline
    def setTangentialPressure(value: Double): Self = StObject.set(x, "tangentialPressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangentialPressureUndefined: Self = StObject.set(x, "tangentialPressure", js.undefined)
    
    @scala.inline
    def setTiltX(value: Double): Self = StObject.set(x, "tiltX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltXUndefined: Self = StObject.set(x, "tiltX", js.undefined)
    
    @scala.inline
    def setTiltY(value: Double): Self = StObject.set(x, "tiltY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltYUndefined: Self = StObject.set(x, "tiltY", js.undefined)
    
    @scala.inline
    def setTwist(value: Double): Self = StObject.set(x, "twist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwistUndefined: Self = StObject.set(x, "twist", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

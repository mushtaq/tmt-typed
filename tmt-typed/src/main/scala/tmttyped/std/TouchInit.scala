package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchInit extends StObject {
  
  /* standard DOM */
  var altitudeAngle: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var azimuthAngle: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var clientX: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var clientY: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var force: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var identifier: Double
  
  /* standard DOM */
  var pageX: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var pageY: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var radiusX: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var radiusY: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var rotationAngle: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var screenX: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var screenY: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var target: org.scalajs.dom.EventTarget
  
  /* standard DOM */
  var touchType: js.UndefOr[TouchType] = js.undefined
}
object TouchInit {
  
  @scala.inline
  def apply(identifier: Double, target: org.scalajs.dom.EventTarget): TouchInit = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchInit]
  }
  
  @scala.inline
  implicit class TouchInitMutableBuilder[Self <: TouchInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitudeAngle(value: Double): Self = StObject.set(x, "altitudeAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeAngleUndefined: Self = StObject.set(x, "altitudeAngle", js.undefined)
    
    @scala.inline
    def setAzimuthAngle(value: Double): Self = StObject.set(x, "azimuthAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzimuthAngleUndefined: Self = StObject.set(x, "azimuthAngle", js.undefined)
    
    @scala.inline
    def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientXUndefined: Self = StObject.set(x, "clientX", js.undefined)
    
    @scala.inline
    def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientYUndefined: Self = StObject.set(x, "clientY", js.undefined)
    
    @scala.inline
    def setForce(value: Double): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
    
    @scala.inline
    def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
    
    @scala.inline
    def setRadiusX(value: Double): Self = StObject.set(x, "radiusX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusXUndefined: Self = StObject.set(x, "radiusX", js.undefined)
    
    @scala.inline
    def setRadiusY(value: Double): Self = StObject.set(x, "radiusY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusYUndefined: Self = StObject.set(x, "radiusY", js.undefined)
    
    @scala.inline
    def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
    
    @scala.inline
    def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenXUndefined: Self = StObject.set(x, "screenX", js.undefined)
    
    @scala.inline
    def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenYUndefined: Self = StObject.set(x, "screenY", js.undefined)
    
    @scala.inline
    def setTarget(value: org.scalajs.dom.EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchType(value: TouchType): Self = StObject.set(x, "touchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchTypeUndefined: Self = StObject.set(x, "touchType", js.undefined)
  }
}
